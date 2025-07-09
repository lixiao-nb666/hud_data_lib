package com.nrmyw.hud_data_lib.type.lane;

public enum HudNowLaneStrType {
    none((byte)0x00),
    destination((byte)0x01),
    location((byte)0x02),
    roadName((byte)0x03),
    def((byte)0x04),
    ;
    byte type;
    HudNowLaneStrType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }


}
