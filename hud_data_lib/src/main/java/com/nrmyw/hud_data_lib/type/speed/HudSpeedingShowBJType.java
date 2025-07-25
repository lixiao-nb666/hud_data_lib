package com.nrmyw.hud_data_lib.type.speed;

public enum HudSpeedingShowBJType {
    //直接发送指令
    NONE((byte)0x00),//无背景

    RED_40((byte)0x01),//超速百分之40红色背景
    RED_55((byte)0x02),//超速百分之55红色背景
    RED_80((byte)0x03),//超速百分之80红色背景
    RED_100((byte)0x04),//超速百分之100红色背景
    YELLOW_15((byte)0x04),//超速百分之15黄色背景
    YELLOW_30((byte)0x04),//超速百分之30黄色背景

    ;
    byte type;
    HudSpeedingShowBJType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }


}
