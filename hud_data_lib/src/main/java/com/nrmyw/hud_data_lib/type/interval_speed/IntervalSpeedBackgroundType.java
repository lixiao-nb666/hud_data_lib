package com.nrmyw.hud_data_lib.type.interval_speed;

public enum IntervalSpeedBackgroundType {
    DEF_C15((byte) 0x00),
    C01((byte) 0x01),
    C02((byte) 0x02),
    C04((byte) 0x03),
    C05((byte) 0x04),
    C16((byte) 0x05),
    C18((byte) 0x06),
    ;
    private byte type;
    IntervalSpeedBackgroundType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }
}
