package com.nikonhacker.emu.peripherials.ioPort.tx;

@SuppressWarnings("UnusedDeclaration")
public interface TxPinout {
    /* **************** Constants by pin name **************** */
    public static final int PIN_A1  = 0; // NC
    public static final int PIN_A2  = 1; // P84/AINC4
    public static final int PIN_A3  = 2; // P81/AINC1
    public static final int PIN_A4  = 3; // P83/AINC3
    public static final int PIN_A5  = 4; // VREFHC
    public static final int PIN_A6  = 5; // PF3/KEY19/DACK4
    public static final int PIN_A7  = 6; // PE6/KEY14
    public static final int PIN_A8  = 7; // PE1/KEY09
    public static final int PIN_A9  = 8; // PD4/TBCOUT
    public static final int PIN_A10 = 9; // PD0/HTXD2
    public static final int PIN_A11 = 10; // PA4/INT4/TB6IN0
    public static final int PIN_A12 = 11; // BVCC3
    public static final int PIN_A13 = 12; // XT2
    public static final int PIN_A14 = 13; // XT1
    public static final int PIN_A15 = 14; // X2
    public static final int PIN_A16 = 15; // X1
    public static final int PIN_A17 = 16; // NC
    public static final int PIN_B1  = 17; // P85/AINC5
    public static final int PIN_B2  = 18; // VREFLC
    public static final int PIN_B3  = 19; // P82/AINC2
    public static final int PIN_B4  = 20; // P80/AINC0
    public static final int PIN_B5  = 21; // AVCC3C
    public static final int PIN_B6  = 22; // PF4/KEY20/TCOUT4
    public static final int PIN_B7  = 23; // PE7/KEY15
    public static final int PIN_B8  = 24; // PE2/KEY10
    public static final int PIN_B9  = 25; // PD5/TBDOUT
    public static final int PIN_B10 = 26; // PD2/HSCLK2/HCTS2
    public static final int PIN_B11 = 27; // PA5/INT5/TB6IN1
    public static final int PIN_B12 = 28; // PA1/INT1/PHC0IN1
    public static final int PIN_B13 = 29; // PA0/INT0/PHC0IN0
    public static final int PIN_B14 = 30; // DVCC3
    public static final int PIN_B15 = 31; // REGTEST2
    public static final int PIN_B16 = 32; // CVSS
    public static final int PIN_B17 = 33; // TRST
    public static final int PIN_C1  = 34; // P86/AINC6/INT8
    public static final int PIN_C2  = 35; // P71/AINA1
    public static final int PIN_C3  = 36; // AVSSA
    public static final int PIN_C4  = 37; // P87/AINC7/INT9
    public static final int PIN_C5  = 38; // DVCC3
    public static final int PIN_C6  = 39; // PF5/KEY21/TCOUT5
    public static final int PIN_C7  = 40; // PF0/KEY16/DREQ0
    public static final int PIN_C8  = 41; // PE3/KEY11
    public static final int PIN_C9  = 42; // PD6/KEY31/ADTRGA
    public static final int PIN_C10 = 43; // PD1/HRXD2
    public static final int PIN_C11 = 44; // PA6/PHC2IN0
    public static final int PIN_C12 = 45; // PA2/INT2/PHC1IN0
    public static final int PIN_C13 = 46; // PH7/INT1F/TBDIN1
    public static final int PIN_C14 = 47; // PH6/INT1E/TBDIN0
    public static final int PIN_C15 = 48; // DVSS
    public static final int PIN_C16 = 49; // PH5/INT1D/TBBIN1
    public static final int PIN_C17 = 50; // TDI/RXD0
    public static final int PIN_D1  = 51; // P73/INT11/AINA3
    public static final int PIN_D2  = 52; // P72/INT10/AINA2
    public static final int PIN_D3  = 53; // P70/AINA0
    public static final int PIN_D4  = 54; // AVSSC
    public static final int PIN_D5  = 55; // DVSS
    public static final int PIN_D6  = 56; // PF6/KEY22/TCOUT6
    public static final int PIN_D7  = 57; // PF1/KEY17/DACK0
    public static final int PIN_D8  = 58; // PE4/KEY12
    public static final int PIN_D9  = 59; // PD7/ADTRGB
    public static final int PIN_D10 = 60; // PD3/TBBOUT
    public static final int PIN_D11 = 61; // PA7/PHC2IN1
    public static final int PIN_D12 = 62; // PA3/INT3/PHC1IN1
    public static final int PIN_D13 = 63; // PH4/INT1C/TBBIN0
    public static final int PIN_D14 = 64; // TEST4
    public static final int PIN_D15 = 65; // PH3/INT1B/TBAIN1
    public static final int PIN_D16 = 66; // RESET
    public static final int PIN_D17 = 67; // TDO/TXD0
    public static final int PIN_E1  = 68; // P75/AINB1
    public static final int PIN_E2  = 69; // P74/AINB0
    public static final int PIN_E3  = 70; // AVCC3B
    public static final int PIN_E4  = 71; // AVCC3A
    public static final int PIN_E5  = 72; // VREFLA
    public static final int PIN_E6  = 73; // PF7/KEY23/TCOUT7
    public static final int PIN_E7  = 74; // PF2/KEY18/DREQ4
    public static final int PIN_E8  = 75; // PE5/KEY13
    public static final int PIN_E9  = 76; // PE0/KEY08
    public static final int PIN_E10 = 77; // DVSS
    public static final int PIN_E11 = 78; // REGTEST0
    public static final int PIN_E12 = 79; // DVCC3
    public static final int PIN_E13 = 80; // DVSS
    public static final int PIN_E14 = 81; // PH2/INT1A/TBAIN0
    public static final int PIN_E15 = 82; // PH1/INT19/TB9IN1
    public static final int PIN_E16 = 83; // PH0/INT18/TB9IN0
    public static final int PIN_E17 = 84; // TMS
    public static final int PIN_F1  = 85; // P77/AINB3/INT13
    public static final int PIN_F2  = 86; // P76/AINB2/INT12
    public static final int PIN_F3  = 87; // VREFHB
    public static final int PIN_F4  = 88; // VREFHA
    public static final int PIN_F5  = 89; // NC
    public static final int PIN_F6  = 90; // NC
    public static final int PIN_F13 = 91; // NC
    public static final int PIN_F14 = 92; // PI7/ADTRGSNC
    public static final int PIN_F15 = 93; // PI6/TB11OUT
    public static final int PIN_F16 = 94; // PI5/TB10OUT
    public static final int PIN_F17 = 95; // TCK
    public static final int PIN_G1  = 96; // VREFLB
    public static final int PIN_G2  = 97; // AVSSB
    public static final int PIN_G3  = 98; // DVSS
    public static final int PIN_G4  = 99; // P90/HTXD0
    public static final int PIN_G5  = 100; // NC
    public static final int PIN_G13 = 101; // NC
    public static final int PIN_G14 = 102; // PI4/ADTRGC
    public static final int PIN_G15 = 103; // PI3/PHC5IN1
    public static final int PIN_G16 = 104; // PI2/PHC5IN0
    public static final int PIN_G17 = 105; // DINT
    public static final int PIN_H1  = 106; // DVCC3
    public static final int PIN_H2  = 107; // P91/HRXD0
    public static final int PIN_H3  = 108; // P92/HSCLK0/HCTS0
    public static final int PIN_H4  = 109; // P93/TB9OUT
    public static final int PIN_H5  = 110; // NC
    public static final int PIN_H13 = 111; // NC
    public static final int PIN_H14 = 112; // NC
    public static final int PIN_H15 = 113; // PI1/PHC4IN1
    public static final int PIN_H16 = 114; // PI0/PHC4IN0
    public static final int PIN_H17 = 115; // EJE
    public static final int PIN_J1  = 116; // P94/TXD2
    public static final int PIN_J2  = 117; // P95/RXD2
    public static final int PIN_J3  = 118; // P96/SCLK2/CTS2
    public static final int PIN_J4  = 119; // P97/TBAOUT
    public static final int PIN_J5  = 120; // DVCC3
    public static final int PIN_J13 = 121; // DVCC3
    public static final int PIN_J14 = 122; // PG7/KEY07
    public static final int PIN_J15 = 123; // PG6/KEY06
    public static final int PIN_J16 = 124; // PG5/KEY05
    public static final int PIN_J17 = 125; // DVCC3
    public static final int PIN_K1  = 126; // PB2/TB6OUT
    public static final int PIN_K2  = 127; // PB4/HTXD1
    public static final int PIN_K3  = 128; // PB3/TB7OUT
    public static final int PIN_K4  = 129; // PB1/PHC3IN1
    public static final int PIN_K5  = 130; // NC
    public static final int PIN_K13 = 131; // NC
    public static final int PIN_K14 = 132; // PG4/KEY04
    public static final int PIN_K15 = 133; // PG3/KEY03
    public static final int PIN_K16 = 134; // PG2/KEY02
    public static final int PIN_K17 = 135; // PG1/KEY01
    public static final int PIN_L1  = 136; // PB5/HRXD1
    public static final int PIN_L2  = 137; // PB7/TB8OUT
    public static final int PIN_L3  = 138; // PB6/HSCLK1/HCTS1
    public static final int PIN_L4  = 139; // PB0/PHC3IN0
    public static final int PIN_L5  = 140; // NC
    public static final int PIN_L13 = 141; // NC
    public static final int PIN_L14 = 142; // PG0/KEY00
    public static final int PIN_L15 = 143; // PJ7/INT7
    public static final int PIN_L16 = 144; // PJ6/INT6
    public static final int PIN_L17 = 145; // PJ5/INT17
    public static final int PIN_M1  = 146; // PC0/TBTIN/KEY30
    public static final int PIN_M2  = 147; // PC1/TCOUT0
    public static final int PIN_M3  = 148; // PC2/TCOUT1
    public static final int PIN_M4  = 149; // PC3/TCOUT2
    public static final int PIN_M5  = 150; // NC
    public static final int PIN_M13 = 151; // DVCC3
    public static final int PIN_M14 = 152; // PJ4/INT16
    public static final int PIN_M15 = 153; // PJ3/INT15
    public static final int PIN_M16 = 154; // PJ2/INT14
    public static final int PIN_M17 = 155; // PJ1/TB11IN1
    public static final int PIN_N1  = 156; // PC4/SO/SDA
    public static final int PIN_N2  = 157; // PC5/SI/SCL
    public static final int PIN_N3  = 158; // PC6/SCK
    public static final int PIN_N4  = 159; // DVCC3
    public static final int PIN_N5  = 160; // DVSS
    public static final int PIN_N6  = 161; // NC
    public static final int PIN_N7  = 162; // NC
    public static final int PIN_N8  = 163; // NC
    public static final int PIN_N9  = 164; // DVSS
    public static final int PIN_N10 = 165; // NC
    public static final int PIN_N11 = 166; // NC
    public static final int PIN_N12 = 167; // REGTEST3
    public static final int PIN_N13 = 168; // DVSS
    public static final int PIN_N14 = 169; // PJ0/TB11IN0
    public static final int PIN_N15 = 170; // P67/A15/TB5OUT
    public static final int PIN_N16 = 171; // P66/A14/SCLK1/CTS1
    public static final int PIN_N17 = 172; // P65/A13/RXD1/INTB
    public static final int PIN_P1  = 173; // P30/RD
    public static final int PIN_P2  = 174; // P31/WR
    public static final int PIN_P3  = 175; // PC7/TCOUT3
    public static final int PIN_P4  = 176; // DVSS
    public static final int PIN_P5  = 177; // DVCC3
    public static final int PIN_P6  = 178; // P11/D9/AD9/A9
    public static final int PIN_P7  = 179; // P15/D13/AD13/A13
    public static final int PIN_P8  = 180; // P21/A17/A1/TB1IN1
    public static final int PIN_P9  = 181; // P24/A20/A4/TB3IN0
    public static final int PIN_P10 = 182; // DVCC3
    public static final int PIN_P11 = 183; // DVCC3
    public static final int PIN_P12 = 184; // BOOT
    public static final int PIN_P13 = 185; // REGTEST1
    public static final int PIN_P14 = 186; // TEST2
    public static final int PIN_P15 = 187; // P64/A12/TXD1
    public static final int PIN_P16 = 188; // P63/A11/TB4OUT
    public static final int PIN_P17 = 189; // P62/A10/SCLK0/CTS0
    public static final int PIN_R1  = 190; // P32/HWR/TC0IN
    public static final int PIN_R2  = 191; // P33/WAIT/RDY
    public static final int PIN_R3  = 192; // TEST0
    public static final int PIN_R4  = 193; // P02/D2/AD2
    public static final int PIN_R5  = 194; // P05/D5/AD5
    public static final int PIN_R6  = 195; // P10/D8/AD8/A8
    public static final int PIN_R7  = 196; // P14/D12/AD12/A12
    public static final int PIN_R8  = 197; // P20/A16/A0/TB1IN0
    public static final int PIN_R9  = 198; // P23/A19/A3/TB2IN1
    public static final int PIN_R10 = 199; // P27/A23/A7/TB5IN1
    public static final int PIN_R11 = 200; // P42/CS2/KEY26
    public static final int PIN_R12 = 201; // P45/BUSMD
    public static final int PIN_R13 = 202; // P50/A0/INTC
    public static final int PIN_R14 = 203; // P53/A3/INTF
    public static final int PIN_R15 = 204; // TEST3
    public static final int PIN_R16 = 205; // P61/A9/RXD0/INTA
    public static final int PIN_R17 = 206; // P60/A8/TXD0
    public static final int PIN_T1  = 207; // P34/BUSRQ/TBEOUT
    public static final int PIN_T2  = 208; // TEST1
    public static final int PIN_T3  = 209; // P36/RW/TC2IN
    public static final int PIN_T4  = 210; // P01/D1/AD1
    public static final int PIN_T5  = 211; // P04/D4/AD4
    public static final int PIN_T6  = 212; // P07/D7/AD7
    public static final int PIN_T7  = 213; // P13/D11/AD11/A11
    public static final int PIN_T8  = 214; // P17/D15/AD15/A15
    public static final int PIN_T9  = 215; // P22/A18/A2/TB2IN0
    public static final int PIN_T10 = 216; // P26/A22/A6/TB5IN0
    public static final int PIN_T11 = 217; // P41/CS1/KEY25
    public static final int PIN_T12 = 218; // P44/SCOUT
    public static final int PIN_T13 = 219; // P47/TBFOUT
    public static final int PIN_T14 = 220; // P52/A2/INTE
    public static final int PIN_T15 = 221; // P55/A5/TB1OUT
    public static final int PIN_T16 = 222; // DVSS
    public static final int PIN_T17 = 223; // P57/A7/TB3OUT/KEY29
    public static final int PIN_U1  = 224; // NC
    public static final int PIN_U2  = 225; // P35/BUSAK/TC1IN
    public static final int PIN_U3  = 226; // P37/ALE/TC3IN
    public static final int PIN_U4  = 227; // P00/D0/AD0
    public static final int PIN_U5  = 228; // P03/D3/AD3
    public static final int PIN_U6  = 229; // P06/D6/AD6
    public static final int PIN_U7  = 230; // P12/D10/AD10/A10
    public static final int PIN_U8  = 231; // P16/D14/AD14/A14
    public static final int PIN_U9  = 232; // DVSS
    public static final int PIN_U10 = 233; // P25/A21/A5/TB3IN1
    public static final int PIN_U11 = 234; // P40/CS0/KEY24
    public static final int PIN_U12 = 235; // P43/CS3/KEY27
    public static final int PIN_U13 = 236; // P46/ENDIAN
    public static final int PIN_U14 = 237; // P51/A1/INTD
    public static final int PIN_U15 = 238; // P54/A4/TB0OUT
    public static final int PIN_U16 = 239; // P56/A6/TB2OUT/KEY28
    public static final int PIN_U17 = 240; // NC

    /* **************** Constants by signal name **************** */
    public static final int SIGNAL_A0_ON_PORT2    = 197;
    public static final int SIGNAL_A0_ON_PORT5    = 202;
    public static final int SIGNAL_A1_ON_PORT2    = 180;
    public static final int SIGNAL_A1_ON_PORT5    = 237;
    public static final int SIGNAL_A2_ON_PORT2    = 215;
    public static final int SIGNAL_A2_ON_PORT5    = 220;
    public static final int SIGNAL_A3_ON_PORT2    = 198;
    public static final int SIGNAL_A3_ON_PORT5    = 203;
    public static final int SIGNAL_A4_ON_PORT2    = 181;
    public static final int SIGNAL_A4_ON_PORT5    = 238;
    public static final int SIGNAL_A5_ON_PORT2    = 233;
    public static final int SIGNAL_A5_ON_PORT5    = 221;
    public static final int SIGNAL_A6_ON_PORT2    = 216;
    public static final int SIGNAL_A6_ON_PORT5    = 239;
    public static final int SIGNAL_A7_ON_PORT2    = 199;
    public static final int SIGNAL_A7_ON_PORT5    = 223;
    public static final int SIGNAL_A8             = 206;
    public static final int SIGNAL_A9             = 205;
    public static final int SIGNAL_A10            = 189;
    public static final int SIGNAL_A11            = 188;
    public static final int SIGNAL_A12            = 187;
    public static final int SIGNAL_A13            = 172;
    public static final int SIGNAL_A14            = 171;
    public static final int SIGNAL_A15            = 170;
    public static final int SIGNAL_A16            = 197;
    public static final int SIGNAL_A17            = 180;
    public static final int SIGNAL_A18            = 215;
    public static final int SIGNAL_A19            = 198;
    public static final int SIGNAL_A20            = 181;
    public static final int SIGNAL_A21            = 233;
    public static final int SIGNAL_A22            = 216;
    public static final int SIGNAL_A23            = 199;
    public static final int SIGNAL_AD0            = 227;
    public static final int SIGNAL_AD1            = 210;
    public static final int SIGNAL_AD2            = 193;
    public static final int SIGNAL_AD3            = 228;
    public static final int SIGNAL_AD4            = 211;
    public static final int SIGNAL_AD5            = 194;
    public static final int SIGNAL_AD6            = 229;
    public static final int SIGNAL_AD7            = 212;
    public static final int SIGNAL_AD8            = 195;
    public static final int SIGNAL_AD9            = 178;
    public static final int SIGNAL_AD10           = 230;
    public static final int SIGNAL_AD11           = 213;
    public static final int SIGNAL_AD12           = 196;
    public static final int SIGNAL_AD13           = 179;
    public static final int SIGNAL_AD14           = 231;
    public static final int SIGNAL_AD15           = 214;
    public static final int SIGNAL_ADTRGA         = 42;
    public static final int SIGNAL_ADTRGB         = 59;
    public static final int SIGNAL_ADTRGC         = 102;
    public static final int SIGNAL_ADTRGSNC       = 92;
    public static final int SIGNAL_AINA0          = 53;
    public static final int SIGNAL_AINA1          = 35;
    public static final int SIGNAL_AINA2          = 52;
    public static final int SIGNAL_AINA3          = 51;
    public static final int SIGNAL_AINB0          = 69;
    public static final int SIGNAL_AINB1          = 68;
    public static final int SIGNAL_AINB2          = 86;
    public static final int SIGNAL_AINB3          = 85;
    public static final int SIGNAL_AINC0          = 20;
    public static final int SIGNAL_AINC1          = 2;
    public static final int SIGNAL_AINC2          = 19;
    public static final int SIGNAL_AINC3          = 3;
    public static final int SIGNAL_AINC4          = 1;
    public static final int SIGNAL_AINC5          = 17;
    public static final int SIGNAL_AINC6          = 34;
    public static final int SIGNAL_AINC7          = 37;
    public static final int SIGNAL_ALE            = 226;
    public static final int SIGNAL_AVSSA          = 36;
    public static final int SIGNAL_AVSSB          = 97;
    public static final int SIGNAL_AVSSC          = 54;
    public static final int SIGNAL_BOOT           = 184;
    public static final int SIGNAL_BUSAK          = 225;
    public static final int SIGNAL_BUSMD          = 201;
    public static final int SIGNAL_BUSRQ          = 207;
    public static final int SIGNAL_BVCC3          = 11;
    public static final int SIGNAL_CS0            = 234;
    public static final int SIGNAL_CS1            = 217;
    public static final int SIGNAL_CS2            = 200;
    public static final int SIGNAL_CS3            = 235;
    public static final int SIGNAL_CTS2           = 118;
    public static final int SIGNAL_CVSS           = 32;
    public static final int SIGNAL_D0             = 227;
    public static final int SIGNAL_D1             = 210;
    public static final int SIGNAL_D2             = 193;
    public static final int SIGNAL_D3             = 228;
    public static final int SIGNAL_D4             = 211;
    public static final int SIGNAL_D5             = 194;
    public static final int SIGNAL_D6             = 229;
    public static final int SIGNAL_D7             = 212;
    public static final int SIGNAL_D8             = 195;
    public static final int SIGNAL_D9             = 178;
    public static final int SIGNAL_D10            = 230;
    public static final int SIGNAL_D11            = 213;
    public static final int SIGNAL_D12            = 196;
    public static final int SIGNAL_D13            = 179;
    public static final int SIGNAL_D14            = 231;
    public static final int SIGNAL_D15            = 214;
    public static final int SIGNAL_DACK0          = 57;
    public static final int SIGNAL_DACK4          = 5;
    public static final int SIGNAL_DINT           = 105;
    public static final int SIGNAL_DREQ0          = 40;
    public static final int SIGNAL_DREQ4          = 74;
    public static final int SIGNAL_EJE            = 115;
    public static final int SIGNAL_ENDIAN         = 236;
    public static final int SIGNAL_HCTS0          = 108;
    public static final int SIGNAL_HCTS1          = 138;
    public static final int SIGNAL_HCTS2          = 26;
    public static final int SIGNAL_HRXD0          = 107;
    public static final int SIGNAL_HRXD1          = 136;
    public static final int SIGNAL_HRXD2          = 43;
    public static final int SIGNAL_HSCLK0         = 108;
    public static final int SIGNAL_HSCLK1         = 138;
    public static final int SIGNAL_HSCLK2         = 26;
    public static final int SIGNAL_HTXD0          = 99;
    public static final int SIGNAL_HTXD1          = 127;
    public static final int SIGNAL_HTXD2          = 9;
    public static final int SIGNAL_HWR            = 190;
    public static final int SIGNAL_INT0           = 29;
    public static final int SIGNAL_INT1           = 28;
    public static final int SIGNAL_INT2           = 45;
    public static final int SIGNAL_INT3           = 62;
    public static final int SIGNAL_INT4           = 10;
    public static final int SIGNAL_INT5           = 27;
    public static final int SIGNAL_INT6           = 144;
    public static final int SIGNAL_INT7           = 143;
    public static final int SIGNAL_INT8           = 34;
    public static final int SIGNAL_INT9           = 37;
    public static final int SIGNAL_INTC           = 202;
    public static final int SIGNAL_INTD           = 237;
    public static final int SIGNAL_INTE           = 220;
    public static final int SIGNAL_INTF           = 203;
    public static final int SIGNAL_INT10          = 52;
    public static final int SIGNAL_INT11          = 51;
    public static final int SIGNAL_INT12          = 86;
    public static final int SIGNAL_INT13          = 85;
    public static final int SIGNAL_INT14          = 154;
    public static final int SIGNAL_INT15          = 153;
    public static final int SIGNAL_INT16          = 152;
    public static final int SIGNAL_INT17          = 145;
    public static final int SIGNAL_INT18          = 83;
    public static final int SIGNAL_INT19          = 82;
    public static final int SIGNAL_INT1A          = 81;
    public static final int SIGNAL_INT1B          = 65;
    public static final int SIGNAL_INT1C          = 63;
    public static final int SIGNAL_INT1D          = 49;
    public static final int SIGNAL_INT1E          = 47;
    public static final int SIGNAL_INT1F          = 46;
    public static final int SIGNAL_KEY00          = 142;
    public static final int SIGNAL_KEY01          = 135;
    public static final int SIGNAL_KEY02          = 134;
    public static final int SIGNAL_KEY03          = 133;
    public static final int SIGNAL_KEY04          = 132;
    public static final int SIGNAL_KEY05          = 124;
    public static final int SIGNAL_KEY06          = 123;
    public static final int SIGNAL_KEY07          = 122;
    public static final int SIGNAL_KEY08          = 76;
    public static final int SIGNAL_KEY09          = 7;
    public static final int SIGNAL_KEY10          = 24;
    public static final int SIGNAL_KEY11          = 41;
    public static final int SIGNAL_KEY12          = 58;
    public static final int SIGNAL_KEY13          = 75;
    public static final int SIGNAL_KEY14          = 6;
    public static final int SIGNAL_KEY15          = 23;
    public static final int SIGNAL_KEY16          = 40;
    public static final int SIGNAL_KEY17          = 57;
    public static final int SIGNAL_KEY18          = 74;
    public static final int SIGNAL_KEY19          = 5;
    public static final int SIGNAL_KEY20          = 22;
    public static final int SIGNAL_KEY21          = 39;
    public static final int SIGNAL_KEY22          = 56;
    public static final int SIGNAL_KEY23          = 73;
    public static final int SIGNAL_KEY24          = 234;
    public static final int SIGNAL_KEY25          = 217;
    public static final int SIGNAL_KEY26          = 200;
    public static final int SIGNAL_KEY27          = 235;
    public static final int SIGNAL_KEY30          = 146;
    public static final int SIGNAL_KEY31          = 42;
    public static final int SIGNAL_P00            = 227;
    public static final int SIGNAL_P01            = 210;
    public static final int SIGNAL_P02            = 193;
    public static final int SIGNAL_P03            = 228;
    public static final int SIGNAL_P04            = 211;
    public static final int SIGNAL_P05            = 194;
    public static final int SIGNAL_P06            = 229;
    public static final int SIGNAL_P07            = 212;
    public static final int SIGNAL_P10            = 195;
    public static final int SIGNAL_P11            = 178;
    public static final int SIGNAL_P12            = 230;
    public static final int SIGNAL_P13            = 213;
    public static final int SIGNAL_P14            = 196;
    public static final int SIGNAL_P15            = 179;
    public static final int SIGNAL_P16            = 231;
    public static final int SIGNAL_P17            = 214;
    public static final int SIGNAL_P20            = 197;
    public static final int SIGNAL_P21            = 180;
    public static final int SIGNAL_P22            = 215;
    public static final int SIGNAL_P23            = 198;
    public static final int SIGNAL_P24            = 181;
    public static final int SIGNAL_P25            = 233;
    public static final int SIGNAL_P26            = 216;
    public static final int SIGNAL_P27            = 199;
    public static final int SIGNAL_P30            = 173;
    public static final int SIGNAL_P31            = 174;
    public static final int SIGNAL_P32            = 190;
    public static final int SIGNAL_P33            = 191;
    public static final int SIGNAL_P34            = 207;
    public static final int SIGNAL_P35            = 225;
    public static final int SIGNAL_P36            = 209;
    public static final int SIGNAL_P37            = 226;
    public static final int SIGNAL_P40            = 234;
    public static final int SIGNAL_P41            = 217;
    public static final int SIGNAL_P42            = 200;
    public static final int SIGNAL_P43            = 235;
    public static final int SIGNAL_P44            = 218;
    public static final int SIGNAL_P45            = 201;
    public static final int SIGNAL_P46            = 236;
    public static final int SIGNAL_P47            = 219;
    public static final int SIGNAL_P50            = 202;
    public static final int SIGNAL_P51            = 237;
    public static final int SIGNAL_P52            = 220;
    public static final int SIGNAL_P53            = 203;
    public static final int SIGNAL_P54            = 238;
    public static final int SIGNAL_P55            = 221;
    public static final int SIGNAL_P56            = 239;
    public static final int SIGNAL_P57            = 223;
    public static final int SIGNAL_P60            = 206;
    public static final int SIGNAL_P61            = 205;
    public static final int SIGNAL_P62            = 189;
    public static final int SIGNAL_P63            = 188;
    public static final int SIGNAL_P64            = 187;
    public static final int SIGNAL_P65            = 172;
    public static final int SIGNAL_P66            = 171;
    public static final int SIGNAL_P67            = 170;
    public static final int SIGNAL_P70            = 53;
    public static final int SIGNAL_P71            = 35;
    public static final int SIGNAL_P72            = 52;
    public static final int SIGNAL_P73            = 51;
    public static final int SIGNAL_P74            = 69;
    public static final int SIGNAL_P75            = 68;
    public static final int SIGNAL_P76            = 86;
    public static final int SIGNAL_P77            = 85;
    public static final int SIGNAL_P80            = 20;
    public static final int SIGNAL_P81            = 2;
    public static final int SIGNAL_P82            = 19;
    public static final int SIGNAL_P83            = 3;
    public static final int SIGNAL_P84            = 1;
    public static final int SIGNAL_P85            = 17;
    public static final int SIGNAL_P86            = 34;
    public static final int SIGNAL_P87            = 37;
    public static final int SIGNAL_P90            = 99;
    public static final int SIGNAL_P91            = 107;
    public static final int SIGNAL_P92            = 108;
    public static final int SIGNAL_P93            = 109;
    public static final int SIGNAL_P94            = 116;
    public static final int SIGNAL_P95            = 117;
    public static final int SIGNAL_P96            = 118;
    public static final int SIGNAL_P97            = 119;
    public static final int SIGNAL_PA0            = 29;
    public static final int SIGNAL_PA1            = 28;
    public static final int SIGNAL_PA2            = 45;
    public static final int SIGNAL_PA3            = 62;
    public static final int SIGNAL_PA4            = 10;
    public static final int SIGNAL_PA5            = 27;
    public static final int SIGNAL_PA6            = 44;
    public static final int SIGNAL_PA7            = 61;
    public static final int SIGNAL_PB0            = 139;
    public static final int SIGNAL_PB1            = 129;
    public static final int SIGNAL_PB2            = 126;
    public static final int SIGNAL_PB3            = 128;
    public static final int SIGNAL_PB4            = 127;
    public static final int SIGNAL_PB5            = 136;
    public static final int SIGNAL_PB6            = 138;
    public static final int SIGNAL_PB7            = 137;
    public static final int SIGNAL_PC0            = 146;
    public static final int SIGNAL_PC1            = 147;
    public static final int SIGNAL_PC2            = 148;
    public static final int SIGNAL_PC3            = 149;
    public static final int SIGNAL_PC4            = 156;
    public static final int SIGNAL_PC5            = 157;
    public static final int SIGNAL_PC6            = 158;
    public static final int SIGNAL_PC7            = 175;
    public static final int SIGNAL_PD0            = 9;
    public static final int SIGNAL_PD1            = 43;
    public static final int SIGNAL_PD2            = 26;
    public static final int SIGNAL_PD3            = 60;
    public static final int SIGNAL_PD4            = 8;
    public static final int SIGNAL_PD5            = 25;
    public static final int SIGNAL_PD6            = 42;
    public static final int SIGNAL_PD7            = 59;
    public static final int SIGNAL_PE0            = 76;
    public static final int SIGNAL_PE1            = 7;
    public static final int SIGNAL_PE2            = 24;
    public static final int SIGNAL_PE3            = 41;
    public static final int SIGNAL_PE4            = 58;
    public static final int SIGNAL_PE5            = 75;
    public static final int SIGNAL_PE6            = 6;
    public static final int SIGNAL_PE7            = 23;
    public static final int SIGNAL_PF0            = 40;
    public static final int SIGNAL_PF1            = 57;
    public static final int SIGNAL_PF2            = 74;
    public static final int SIGNAL_PF3            = 5;
    public static final int SIGNAL_PF4            = 22;
    public static final int SIGNAL_PF5            = 39;
    public static final int SIGNAL_PF6            = 56;
    public static final int SIGNAL_PF7            = 73;
    public static final int SIGNAL_PG0            = 142;
    public static final int SIGNAL_PG1            = 135;
    public static final int SIGNAL_PG2            = 134;
    public static final int SIGNAL_PG3            = 133;
    public static final int SIGNAL_PG4            = 132;
    public static final int SIGNAL_PG5            = 124;
    public static final int SIGNAL_PG6            = 123;
    public static final int SIGNAL_PG7            = 122;
    public static final int SIGNAL_PH0            = 83;
    public static final int SIGNAL_PH1            = 82;
    public static final int SIGNAL_PH2            = 81;
    public static final int SIGNAL_PH3            = 65;
    public static final int SIGNAL_PH4            = 63;
    public static final int SIGNAL_PH5            = 49;
    public static final int SIGNAL_PH6            = 47;
    public static final int SIGNAL_PH7            = 46;
    public static final int SIGNAL_PHC0IN0        = 29;
    public static final int SIGNAL_PHC0IN1        = 28;
    public static final int SIGNAL_PHC1IN0        = 45;
    public static final int SIGNAL_PHC1IN1        = 62;
    public static final int SIGNAL_PHC2IN0        = 44;
    public static final int SIGNAL_PHC2IN1        = 61;
    public static final int SIGNAL_PHC3IN0        = 139;
    public static final int SIGNAL_PHC3IN1        = 129;
    public static final int SIGNAL_PHC4IN0        = 114;
    public static final int SIGNAL_PHC4IN1        = 113;
    public static final int SIGNAL_PHC5IN0        = 104;
    public static final int SIGNAL_PHC5IN1        = 103;
    public static final int SIGNAL_PI0            = 114;
    public static final int SIGNAL_PI1            = 113;
    public static final int SIGNAL_PI2            = 104;
    public static final int SIGNAL_PI3            = 103;
    public static final int SIGNAL_PI4            = 102;
    public static final int SIGNAL_PI5            = 94;
    public static final int SIGNAL_PI6            = 93;
    public static final int SIGNAL_PI7            = 92;
    public static final int SIGNAL_PJ0            = 169;
    public static final int SIGNAL_PJ1            = 155;
    public static final int SIGNAL_PJ2            = 154;
    public static final int SIGNAL_PJ3            = 153;
    public static final int SIGNAL_PJ4            = 152;
    public static final int SIGNAL_PJ5            = 145;
    public static final int SIGNAL_PJ6            = 144;
    public static final int SIGNAL_PJ7            = 143;
    public static final int SIGNAL_RD             = 173;
    public static final int SIGNAL_RDY            = 191;
    public static final int SIGNAL_REGTEST0       = 78;
    public static final int SIGNAL_REGTEST1       = 185;
    public static final int SIGNAL_REGTEST2       = 31;
    public static final int SIGNAL_REGTEST3       = 167;
    public static final int SIGNAL_RESET          = 66;
    public static final int SIGNAL_RW             = 209;
    public static final int SIGNAL_RXD0_ON_PORT_6 = 205;
    public static final int SIGNAL_RXD0_ON_TD0    = 50;
    public static final int SIGNAL_RXD1           = 172;
    public static final int SIGNAL_RXD2           = 117;
    public static final int SIGNAL_SCK            = 158;
    public static final int SIGNAL_SCL            = 157;
    public static final int SIGNAL_SCLK0          = 189;
    public static final int SIGNAL_SCLK1          = 171;
    public static final int SIGNAL_SCLK2          = 118;
    public static final int SIGNAL_SCOUT          = 218;
    public static final int SIGNAL_SDA            = 156;
    public static final int SIGNAL_SI             = 157;
    public static final int SIGNAL_SO             = 156;
    public static final int SIGNAL_TB0OUT         = 238;
    public static final int SIGNAL_TB1OUT         = 221;
    public static final int SIGNAL_TB2OUT         = 239;
    public static final int SIGNAL_TB3OUT         = 223;
    public static final int SIGNAL_TB4OUT         = 188;
    public static final int SIGNAL_TB5OUT         = 170;
    public static final int SIGNAL_TB6OUT         = 126;
    public static final int SIGNAL_TB7OUT         = 128;
    public static final int SIGNAL_TB8OUT         = 137;
    public static final int SIGNAL_TB9OUT         = 109;
    public static final int SIGNAL_TBAOUT         = 119;
    public static final int SIGNAL_TBBOUT         = 60;
    public static final int SIGNAL_TBCOUT         = 8;
    public static final int SIGNAL_TBDOUT         = 25;
    public static final int SIGNAL_TBEOUT         = 207;
    public static final int SIGNAL_TBFOUT         = 219;
    public static final int SIGNAL_TB10OUT        = 94;
    public static final int SIGNAL_TB11OUT        = 93;
    public static final int SIGNAL_TB6IN0         = 10;
    public static final int SIGNAL_TB6IN1         = 27;
    public static final int SIGNAL_TB9IN0         = 83;
    public static final int SIGNAL_TB9IN1         = 82;
    public static final int SIGNAL_TBAIN0         = 81;
    public static final int SIGNAL_TBAIN1         = 65;
    public static final int SIGNAL_TBBIN0         = 63;
    public static final int SIGNAL_TBBIN1         = 49;
    public static final int SIGNAL_TBDIN0         = 47;
    public static final int SIGNAL_TBDIN1         = 46;
    public static final int SIGNAL_TB11IN0        = 169;
    public static final int SIGNAL_TB11IN1        = 155;
    public static final int SIGNAL_TBTIN          = 146;
    public static final int SIGNAL_TC0IN          = 190;
    public static final int SIGNAL_TC1IN          = 225;
    public static final int SIGNAL_TC2IN          = 209;
    public static final int SIGNAL_TC3IN          = 226;
    public static final int SIGNAL_TCK            = 95;
    public static final int SIGNAL_TCOUT0         = 147;
    public static final int SIGNAL_TCOUT1         = 148;
    public static final int SIGNAL_TCOUT2         = 149;
    public static final int SIGNAL_TCOUT3         = 175;
    public static final int SIGNAL_TCOUT4         = 22;
    public static final int SIGNAL_TCOUT5         = 39;
    public static final int SIGNAL_TCOUT6         = 56;
    public static final int SIGNAL_TCOUT7         = 73;
    public static final int SIGNAL_TDI            = 50;
    public static final int SIGNAL_TDO            = 67;
    public static final int SIGNAL_TEST0          = 192;
    public static final int SIGNAL_TEST1          = 208;
    public static final int SIGNAL_TEST2          = 186;
    public static final int SIGNAL_TEST3          = 204;
    public static final int SIGNAL_TEST4          = 64;
    public static final int SIGNAL_TMS            = 84;
    public static final int SIGNAL_TRST           = 33;
    public static final int SIGNAL_TXD0_ON_PORT_6 = 206;
    public static final int SIGNAL_TXD0_ON_TD0    = 67;
    public static final int SIGNAL_TXD1           = 187;
    public static final int SIGNAL_TXD2           = 116;
    public static final int SIGNAL_VREFHA         = 88;
    public static final int SIGNAL_VREFHB         = 87;
    public static final int SIGNAL_VREFHC         = 4;
    public static final int SIGNAL_VREFLA         = 72;
    public static final int SIGNAL_VREFLB         = 96;
    public static final int SIGNAL_VREFLC         = 18;
    public static final int SIGNAL_WAIT           = 191;
    public static final int SIGNAL_WR             = 174;
    public static final int SIGNAL_X1             = 15;
    public static final int SIGNAL_X2             = 14;
    public static final int SIGNAL_XT1            = 13;
    public static final int SIGNAL_XT2            = 12;
}