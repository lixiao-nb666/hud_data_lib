package com.nrmyw.hud_data_lib.type.time;

public enum HudTimeType {
    NONE((byte)0x00),
    AM((byte)0x01),
    PM((byte)0x02),
    ;
    byte type;
    HudTimeType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }
}
