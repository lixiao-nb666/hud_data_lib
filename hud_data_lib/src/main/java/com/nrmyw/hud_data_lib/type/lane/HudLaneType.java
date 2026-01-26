package com.nrmyw.hud_data_lib.type.lane;

public enum HudLaneType {
    NONE("none",(byte)0x00),//空格
    BUS_Y("busa",(byte)0x01),//巴士选择
    BUS_N_B("busb",(byte)0x02),//巴士未选择
    BUS_N_D("busd",(byte)0x03),//巴士未选择，右边带条线
    HIGH_Y("higha",(byte)0x04),//high选择
    HIGH_N("highb",(byte)0x05),//hige未选择
    L_N("20",(byte)0x06),//左转未选择
    L_Y("21",(byte)0x07),//左转选择
    LF_N("30",(byte)0x08),//左前未选择
    LF_Y("31",(byte)0x09),//左前选择
    F_N("40",(byte)0x0A),//直行未选择
    F_Y("41",(byte)0x0B),//直行选择
    RF_N("50",(byte)0x0C),//右前未选择
    RF_Y("51",(byte)0x0D),//右前选择
    R_N("60",(byte)0x0E),//右拐未选择
    R_Y("61",(byte)0x0F),//右拐选择
    L_T_N("1200",(byte)0x10),//可左拐调头未选择
    L_T_Y_T("1201",(byte)0x11),//可左拐调头选择调头
    L_T_Y_L("1210",(byte)0x12),//可左拐调头选择左拐
    L_T_Y("1211",(byte)0x13),//可左拐调头都行
    LF_T_N("1300",(byte)0x14),//可左前调头未选择
    LF_T_Y_T("1301",(byte)0x15),//可左前调头选择调头
    LF_T_Y_LF("1310",(byte)0x16),//可左前调头选择左前
    LF_T_Y("1311",(byte)0x17),//可左前调头都行
    F_LT_N("1400",(byte)0x18),//可直行调头未选择
    F_LT_Y_T("1401",(byte)0x19),//可直行调头选择调头
    F_LT_Y_F("1410",(byte)0x1A),//可直行调头选择直行
    F_LT_Y("1411",(byte)0x1B),//可直行调头都行
    LT_RF_N("1500",(byte)0x1C),//可左掉头右前未选择
    LT_RF_Y_LT("1501",(byte)0x1D),//可左掉头右前选择调头
    LT_RF_Y_RF("1510",(byte)0x1E),//可左掉头右前选择右前
    LT_RF_Y("1511",(byte)0x1F),//可左掉头右前都行
    R_T_N("1600",(byte)0x20),//可右拐调头未选择
    R_T_Y_T("1601",(byte)0x21),//可右拐调头选择调头
    R_T_Y_R("1610",(byte)0x22),//可右拐调头选择右拐
    R_T_Y("1611",(byte)0x23),//可右拐调头都行
    L_LF_N("2300",(byte)0x24),//可左拐左前未选择
    L_LF_Y_L("2301",(byte)0x25),//可左拐左前选择左拐
    L_LF_Y_LF("2310",(byte)0x26),//可左拐左前选择左前
    L_LF_Y("2311",(byte)0x27),//可左拐左前都行
    L_F_N("2400",(byte)0x28),//可左拐直行未选择
    L_F_Y_L("2401",(byte)0x29),//可左拐直行选择左拐
    L_F_Y_F("2410",(byte)0x2A),//可左拐直行选择直行
    L_F_Y("2411",(byte)0x2B),//可左拐直行都行
    L_RF_N("2500",(byte)0x2C),//可左拐右前未选择
    L_RF_Y_L("2501",(byte)0x2D),//可左拐右前选择左拐
    L_RF_Y_RF("2510",(byte)0x2E),//可左拐右前选择右前
    L_RF_Y("2511",(byte)0x2F),//可左拐右前都行
    L_R_N("2600",(byte)0x30),//可左拐右拐未选择
    L_R_Y_L("2601",(byte)0x31),//可左拐右拐选择左拐
    L_R_Y_R("2610",(byte)0x32),//可左拐右拐选择右拐
    L_R_Y("2611",(byte)0x33),//可左拐右拐都行
    LF_F_N("3400",(byte)0x34),//可左前直行未选择
    LF_F_Y_LF("3401",(byte)0x35),//可左前直行选择左前
    LF_F_Y_F("3410",(byte)0x36),//可左前直行选择直行
    LF_F_Y("3411",(byte)0x37),//可左前直行都行
    LF_RF_N("3500",(byte)0x38),//可左前右前未选择
    LF_RF_Y_LF("3501",(byte)0x39),//可左前右前选择左前
    LF_RF_Y_RF("3510",(byte)0x3A),//可左前右前选择右前
    LF_RF_Y("3511",(byte)0x3B),//可左前右前都行
    LF_R_N("3600",(byte)0x3C),//可左前右拐未选择
    LF_R_Y_LF("3601",(byte)0x3D),//可左前右拐选择左前
    LF_R_Y_R("3610",(byte)0x3E),//可左前右拐选择右拐
    LF_R_Y("3611",(byte)0x3F),//可左前右拐都行
    RF_F_N("4500",(byte)0x40),//可直行右前未选择
    RF_F_Y_F("4501",(byte)0x41),//可直行右前选择直行
    RF_F_Y_RF("4510",(byte)0x42),//可直行右前选择右前
    RF_F_Y("4511",(byte)0x43),//可直行右前都行
    R_F_N("4600",(byte)0x44),//可直行右拐未选择
    R_F_Y_F("4601",(byte)0x45),//可直行右拐选择直行
    R_F_Y_R("4610",(byte)0x46),//可直行右拐选择右拐
    R_F_Y("4611",(byte)0x47),//可直行右拐都行
    R_RF_N("5600",(byte)0x48),//可右前右拐未选择
    R_RF_Y_RF("5601",(byte)0x49),//可右前右拐选择右前
    R_RF_Y_R("5610",(byte)0x4A),//可右前右拐选择右拐
    R_RF_Y("5611",(byte)0x4B),//可右前右拐都行
    D_Y("1",(byte)0x4C),//地下直行选择
    D_N("2",(byte)0x4D),//地下直行未选择
    LT_N("10",(byte)0x4E),//左调头未选择
    LT_Y("11",(byte)0x4F),//左调头选择
    //----分割线
    C_LT_Y("c_11",(byte)0x50),//左调头选择
    C_L_Y("c_21",(byte)0x51),//左转选择
    C_LF_Y("c_31",(byte)0x52),//左前选择
    C_F_Y("c_41",(byte)0x53),//直行选择
    C_RF_Y("c_51",(byte)0x54),//右前选择
    C_R_Y("c_61",(byte)0x55),//右拐选择
    C_L_T_Y_T("c_1201",(byte)0x56),//可左拐调头选择调头
    C_L_T_Y_L("c_1210",(byte)0x57),//可左拐调头选择左拐
    C_L_T_Y("c_1211",(byte)0x58),//可左拐调头都行
    C_LF_T_Y_T("c_1301",(byte)0x59),//可左前调头选择调头
    C_LF_T_Y_LF("c_1310",(byte)0x5A),//可左前调头选择左前
    C_LF_T_Y("c_1311",(byte)0x5B),//可左前调头都行
    C_F_LT_Y_T("c_1401",(byte)0x5C),//可直行调头选择调头
    C_F_LT_Y_F("c_1410",(byte)0x5D),//可直行调头选择直行
    C_F_LT_Y("c_1411",(byte)0x5E),//可直行调头都行
    C_LT_RF_Y_LT("c_1501",(byte)0x5F),//可左掉头右前选择调头
    C_LT_RF_Y_RF("c_1510",(byte)0x60),//可左掉头右前选择右前
    C_LT_RF_Y("c_1511",(byte)0x61),//可左掉头右前都行
    C_R_T_Y_T("c_1601",(byte)0x62),//可右拐调头选择调头
    C_R_T_Y_R("c_1610",(byte)0x63),//可右拐调头选择右拐
    C_R_T_Y("c_1611",(byte)0x64),//可右拐调头都行
    C_L_LF_Y_L("c_2301",(byte)0x65),//可左拐左前选择左拐
    C_L_LF_Y_LF("c_2310",(byte)0x66),//可左拐左前选择左前
    C_L_LF_Y("c_2311",(byte)0x67),//可左拐左前都行
    C_L_F_Y_L("c_2401",(byte)0x68),//可左拐直行选择左拐
    C_L_F_Y_F("c_2410",(byte)0x69),//可左拐直行选择直行
    C_L_F_Y("c_2411",(byte)0x6A),//可左拐直行都行
    C_L_RF_Y_L("c_2501",(byte)0x6B),//可左拐右前选择左拐
    C_L_RF_Y_RF("c_2510",(byte)0x6C),//可左拐右前选择右前
    C_L_RF_Y("c_2511",(byte)0x6D),//可左拐右前都行
    C_L_R_Y_L("c_2601",(byte)0x6E),//可左拐右拐选择左拐
    C_L_R_Y_R("c_2610",(byte)0x6F),//可左拐右拐选择右拐
    C_L_R_Y("c_2611",(byte)0x70),//可左拐右拐都行
    C_LF_F_Y_LF("c_3401",(byte)0x71),//可左前直行选择左前
    C_LF_F_Y_F("c_3410",(byte)0x72),//可左前直行选择直行
    C_LF_F_Y("c_3411",(byte)0x73),//可左前直行都行
    C_LF_RF_Y_LF("c_3501",(byte)0x74),//可左前右前选择左前
    C_LF_RF_Y_RF("c_3510",(byte)0x75),//可左前右前选择右前
    C_LF_RF_Y("c_3511",(byte)0x76),//可左前右前都行
    C_LF_R_Y_LF("c_3601",(byte)0x77),//可左前右拐选择左前
    C_LF_R_Y_R("c_3610",(byte)0x78),//可左前右拐选择右拐
    C_LF_R_Y("c_3611",(byte)0x79),//可左前右拐都行
    C_RF_F_Y_F("c_4501",(byte)0x7A),//可直行右前选择直行
    C_RF_F_Y_RF("c_4510",(byte)0x7B),//可直行右前选择右前
    C_RF_F_Y("c_4511",(byte)0x7C),//可直行右前都行
    C_R_F_Y_F("c_4601",(byte)0x7D),//可直行右拐选择直行
    C_R_F_Y_R("c_4610",(byte)0x7E),//可直行右拐选择右拐
    C_R_F_Y("c_4611",(byte)0x7F),//可直行右拐都行
    C_R_RF_Y_RF("c_5601",(byte)0x80),//可右前右拐选择右前
    C_R_RF_Y_R("c_5610",(byte)0x81),//可右前右拐选择右拐
    C_R_RF_Y("c_5611",(byte)0x82),//可右前右拐都行
    C_HIGH_Y("c_higha",(byte)0x83),//high选择




    //----分割线
    D_LT_Y("d_11",(byte)0xA0),//左调头选择
    D_L_Y("d_21",(byte)0xA1),//左转选择
    D_LF_Y("d_31",(byte)0xA2),//左前选择
    D_F_Y("d_41",(byte)0xA3),//直行选择
    D_RF_Y("d_51",(byte)0xA4),//右前选择
    D_R_Y("d_61",(byte)0xA5),//右拐选择
    D_L_T_Y_T("d_1201",(byte)0xA6),//可左拐调头选择调头
    D_L_T_Y_L("d_1210",(byte)0xA7),//可左拐调头选择左拐
    D_L_T_Y("d_1211",(byte)0xA8),//可左拐调头都行
    D_LF_T_Y_T("d_1301",(byte)0xA9),//可左前调头选择调头
    D_LF_T_Y_LF("d_1310",(byte)0xAA),//可左前调头选择左前
    D_LF_T_Y("d_1311",(byte)0xAB),//可左前调头都行
    D_F_LT_Y_T("d_1401",(byte)0xAC),//可直行调头选择调头
    D_F_LT_Y_F("d_1410",(byte)0xAE),//可直行调头选择直行
    D_F_LT_Y("d_1411",(byte)0xAE),//可直行调头都行
    D_LT_RF_Y_LT("d_1501",(byte)0xAF),//可左掉头右前选择调头
    D_LT_RF_Y_RF("d_1510",(byte)0xB0),//可左掉头右前选择右前
    D_LT_RF_Y("d_1511",(byte)0xB1),//可左掉头右前都行
    D_R_T_Y_T("d_1601",(byte)0xB2),//可右拐调头选择调头
    D_R_T_Y_R("d_1610",(byte)0xB3),//可右拐调头选择右拐
    D_R_T_Y("d_1611",(byte)0xB4),//可右拐调头都行
    D_L_LF_Y_L("d_2301",(byte)0xB5),//可左拐左前选择左拐
    D_L_LF_Y_LF("d_2310",(byte)0xB6),//可左拐左前选择左前
    D_L_LF_Y("d_2311",(byte)0xB7),//可左拐左前都行
    D_L_F_Y_L("d_2401",(byte)0xB8),//可左拐直行选择左拐
    D_L_F_Y_F("d_2410",(byte)0xB9),//可左拐直行选择直行
    D_L_F_Y("d_2411",(byte)0xBA),//可左拐直行都行
    D_L_RF_Y_L("d_2501",(byte)0xBB),//可左拐右前选择左拐
    D_L_RF_Y_RF("d_2510",(byte)0xBC),//可左拐右前选择右前
    D_L_RF_Y("d_2511",(byte)0xB6D),//可左拐右前都行
    D_L_R_Y_L("d_2601",(byte)0xBE),//可左拐右拐选择左拐
    D_L_R_Y_R("d_2610",(byte)0xBF),//可左拐右拐选择右拐
    D_L_R_Y("d_2611",(byte)0xC0),//可左拐右拐都行
    D_LF_F_Y_LF("d_3401",(byte)0xC1),//可左前直行选择左前
    D_LF_F_Y_F("d_3410",(byte)0xC2),//可左前直行选择直行
    D_LF_F_Y("d_3411",(byte)0xC3),//可左前直行都行
    D_LF_RF_Y_LF("d_3501",(byte)0xC4),//可左前右前选择左前
    D_LF_RF_Y_RF("d_3510",(byte)0xC5),//可左前右前选择右前
    D_LF_RF_Y("d_3511",(byte)0xC6),//可左前右前都行
    D_LF_R_Y_LF("d_3601",(byte)0xC7),//可左前右拐选择左前
    D_LF_R_Y_R("d_3610",(byte)0xC8),//可左前右拐选择右拐
    D_LF_R_Y("d_3611",(byte)0xC9),//可左前右拐都行
    D_RF_F_Y_F("d_4501",(byte)0xCA),//可直行右前选择直行
    D_RF_F_Y_RF("d_4510",(byte)0xCB),//可直行右前选择右前
    D_RF_F_Y("d_4511",(byte)0xCC),//可直行右前都行
    D_R_F_Y_F("d_4601",(byte)0xCD),//可直行右拐选择直行
    D_R_F_Y_R("d_4610",(byte)0xCE),//可直行右拐选择右拐
    D_R_F_Y("d_4611",(byte)0xCF),//可直行右拐都行
    D_R_RF_Y_RF("d_5601",(byte)0xD0),//可右前右拐选择右前
    D_R_RF_Y_R("d_5610",(byte)0xD1),//可右前右拐选择右拐
    D_R_RF_Y("d_5611",(byte)0xD2),//可右前右拐都行
    D_HIGH_Y("d_higha",(byte)0xD3),//high选择
    ;
    String imageFileName;
    byte type;
    HudLaneType(String imageFileName, byte type){
        this.imageFileName=imageFileName;
        this.type=type;
    }

    public byte getType() {
        return type;
    }


    public HudLaneType getSelectType(){
        String needFileName="c_"+imageFileName;
        for(HudLaneType hudLaneType:values()){
            if(needFileName.equals(hudLaneType.imageFileName)){
                return hudLaneType;
            }
        }
        return null;
    }


}
