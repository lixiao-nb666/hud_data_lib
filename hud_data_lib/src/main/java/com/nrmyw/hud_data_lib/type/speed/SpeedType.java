package com.nrmyw.hud_data_lib.type.speed;

public enum SpeedType {

    DEF((byte)0x00),//正常白色
    NO_DESTINATION((byte)0x01),//警告红色
    ;
    byte type;
    SpeedType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }
}
