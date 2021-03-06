package com.nikonhacker.disassembly.tx;

import com.nikonhacker.Constants;
import com.nikonhacker.disassembly.*;

import java.io.IOException;
import java.util.Set;

public class Dtx extends Disassembler
{
    public Dtx() {
        super(Constants.CHIP_TX);
    }
    
    public static void main(String[] args) {
        Dtx dtx = new Dtx();
        try {
            dtx.execute(args);
        } catch (Exception | Error e) {
            e.printStackTrace();
            dtx.log("ERROR : " + e.getClass().getName() + ": " + e.getMessage()+"\n");
        } finally {
            dtx.closeDebugPrintWriter();
        }
    }


    /* output */
    protected int disassembleOne16BitStatement(StatementContext context, Range memRange, int memoryFileOffset, CodeStructure codeStructure, Set<OutputOption> outputOptions) throws IOException, DisassemblyException {
        TxStatement statement = new TxStatement(memRange.getStart());

        int binaryStatement16 = memory.loadInstruction16(context.cpuState.pc);

        statement.fill16bInstruction(binaryStatement16, context.cpuState.pc, memory);

        statement.decode16BitOperands(context.cpuState.pc);

        statement.formatOperandsAndComment(context, true, this.outputOptions);

        if (codeStructure != null) {
            if ((statement.getInstruction().flowType == Instruction.FlowType.CALL || statement.getInstruction().flowType == Instruction.FlowType.INT) && outputOptions.contains(OutputOption.PARAMETERS)) {
                statement.context = new StatementContext();
                statement.context.cpuState = ((TxCPUState) context.cpuState).createCopy();
            }

            codeStructure.putStatement(context.cpuState.pc, statement);
        }
        else {
            // No structure analysis, output right now
            if (outWriter != null) {
                Disassembler.printDisassembly(outWriter, statement, context.cpuState.pc, memoryFileOffset, outputOptions);
            }
        }
        return statement.getNumBytes();
    }

    @Override
    protected int disassembleOne32BitStatement(StatementContext context, Range memRange, int memoryFileOffset, CodeStructure codeStructure, Set<OutputOption> outputOptions) throws IOException, DisassemblyException {
        TxStatement statement = new TxStatement(memRange.getStart());

        int binaryStatement32 = memory.loadInstruction32(context.cpuState.pc);

        statement.fill32bInstruction(binaryStatement32);

        statement.decode32BitOperands();

        statement.formatOperandsAndComment(context, true, this.outputOptions);

        if (codeStructure != null) {
            if ((statement.getInstruction().flowType == Instruction.FlowType.CALL || statement.getInstruction().flowType == Instruction.FlowType.INT) && outputOptions.contains(OutputOption.PARAMETERS)) {
                statement.context = new StatementContext();
                statement.context.cpuState = ((TxCPUState) context.cpuState).createCopy();
            }

            codeStructure.putStatement(context.cpuState.pc, statement);
        }
        else {
            // No structure analysis, output right now
            if (outWriter != null) {
                Disassembler.printDisassembly(outWriter, statement, context.cpuState.pc, memoryFileOffset, outputOptions);
            }
        }
        return 4;
    }


    protected int disassembleOneDataRecord(StatementContext context, Range memRange, int memoryFileOffset, Set<OutputOption> outputOptions) throws IOException, DisassemblyException {

        int sizeInBytes = 0;

        for (RangeType.Width spec : memRange.getRangeType().widths)
        {
            TxStatement statement = new TxStatement(memRange.getStart());
            switch (spec.getWidth()) {
                case 1:
                    statement.imm = memory.loadUnsigned8(context.cpuState.pc);
                    statement.immBitWidth = 8;
                    break;
                case 2:
                    statement.imm = memory.loadUnsigned16(context.cpuState.pc);
                    statement.immBitWidth = 16;
                    break;
                default:
                    statement.imm = memory.load32(context.cpuState.pc);
                    statement.immBitWidth = 32;
                    break;
            }
            statement.setBinaryStatement(statement.immBitWidth / 8, statement.imm);

            statement.setInstruction(TxInstructionSet.opData[spec.getIndex()]);

            statement.formatOperandsAndComment(context, true, this.outputOptions);

            if (outWriter != null) {
                Disassembler.printDisassembly(outWriter, statement, context.cpuState.pc, memoryFileOffset, outputOptions);
            }

            sizeInBytes += statement.getNumBytes();
        }

        return sizeInBytes;
    }


    protected CPUState getCPUState(Range memRange) {
        return new TxCPUState(memRange.getStart());
    }

    ///* initialization */

    public void initialize() throws IOException {
        super.initialize();
        TxInstructionSet.init(outputOptions);

        TxStatement.initFormatChars(outputOptions);

        TxCPUState.initRegisterLabels(outputOptions);
    }


    ///* options */


    protected String[][] getRegisterLabels() {
        return TxCPUState.REG_LABEL;
    }

    protected CodeStructure getCodeStructure(int start) {
        return new TxCodeStructure(start);
    }
}