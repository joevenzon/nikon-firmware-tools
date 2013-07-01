package com.nikonhacker.gui.component.memoryMapped;

import com.nikonhacker.Constants;
import com.nikonhacker.Format;
import com.nikonhacker.disassembly.CPUState;
import com.nikonhacker.emu.memory.DebuggableMemory;
import com.nikonhacker.emu.memory.listener.MemoryActivityListener;
import com.nikonhacker.emu.memory.listener.RangeAccessLoggerActivityListener;
import com.nikonhacker.gui.EmulatorUI;
import com.nikonhacker.gui.swing.DocumentFrame;
import com.nikonhacker.gui.swing.PrintWriterArea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EnumSet;
import java.util.Set;


public class CustomMemoryRangeLoggerFrame extends DocumentFrame implements ActionListener {
    private static final int ROWS = 60;
    private static final int COLUMNS = 80;

    private DebuggableMemory memory;
    private CPUState cpuState;
    private MemoryActivityListener listener;
    private final JTextField minAddressField, maxAddressField;
    private final PrintWriterArea textArea;

    // By default, only log code access
    private final Set<DebuggableMemory.AccessSource> selectedAccessSource = EnumSet.of(DebuggableMemory.AccessSource.CODE);

    public CustomMemoryRangeLoggerFrame(String title, String imageName, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable, int chip, EmulatorUI ui, DebuggableMemory memory, CPUState cpuState) {
        super(title, imageName, resizable, closable, maximizable, iconifiable, chip, ui);
        this.memory = memory;
        this.cpuState = cpuState;

        textArea = new PrintWriterArea(ROWS, COLUMNS);
        textArea.setAutoScroll(true);
        textArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 10));

        JPanel selectionPanel = new JPanel();
        selectionPanel.add(new JLabel("0x"));
        minAddressField = new JTextField(8);
        selectionPanel.add(minAddressField);
        minAddressField.addActionListener(this);

        selectionPanel.add(new JLabel("- 0x"));
        maxAddressField = new JTextField(8);
        selectionPanel.add(maxAddressField);
        maxAddressField.addActionListener(this);

        for (final DebuggableMemory.AccessSource accessSource : DebuggableMemory.AccessSource.selectableAccessSource) {
            final JCheckBox checkBox = new JCheckBox(accessSource.name());
            checkBox.setSelected(selectedAccessSource.contains(accessSource));
            checkBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (checkBox.isSelected()) {
                        selectedAccessSource.add(accessSource);
                    }
                    else {
                        selectedAccessSource.remove(accessSource);
                    }
                }
            });
            selectionPanel.add(checkBox);
        }

        final JButton goButton = new JButton("Go");
        goButton.addActionListener(this);
        selectionPanel.add(goButton);

        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.add(selectionPanel, BorderLayout.NORTH);
        contentPanel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        getContentPane().add(contentPanel);
    }

    public void actionPerformed(ActionEvent e) {
        int minAddress = Format.parseIntHexField(minAddressField);
        int maxAddress = Format.parseIntHexField(maxAddressField);
        if (listener != null) {
            memory.removeActivityListener(listener);
            textArea.getPrintWriter().println("Stopping previous listener");
        }
        listener = new RangeAccessLoggerActivityListener(textArea.getPrintWriter(), minAddress, maxAddress, cpuState, selectedAccessSource);
        memory.addActivityListener(listener);
        textArea.getPrintWriter().println("Starting listener for " + Constants.CHIP_LABEL[chip] + " range 0x" + Format.asHex(minAddress, 8) + " - 0x" + Format.asHex(maxAddress, 8));
    }

    public void dispose() {
        if (listener != null) {
            memory.removeActivityListener(listener);
        }
        super.dispose();
    }
}
