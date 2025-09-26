package com.nrmyw.hud_data_lib.type.speed;

public enum SpeedType {
    DEF((byte)0x00),//正常速度
    NO_DESTINATION((byte)0x01),//无目的地速度
    ;
    byte type;
    SpeedType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }
}
