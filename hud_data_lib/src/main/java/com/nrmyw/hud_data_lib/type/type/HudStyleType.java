package com.nrmyw.hud_data_lib.type.type;

public enum HudStyleType {
    NUMB_0((byte) 0x00),
    NUMB_1((byte) 0x01),
    NUMB_2((byte) 0x02),
    NUMB_3((byte) 0x03),
    NUMB_4((byte) 0x04),
    NUMB_5((byte) 0x05),
    NUMB_6((byte) 0x06),
    NUMB_7((byte) 0x07),
    NUMB_8((byte) 0x08),
    NUMB_9((byte) 0x09),
    NUMB_10((byte) 0x0A),
    NUMB_11((byte) 0x0B),
    NUMB_12((byte) 0x0C),
    NUMB_13((byte) 0x0D),
    NUMB_14((byte) 0x0E),
    NUMB_15((byte) 0x0F),;
    byte type;

    HudStyleType (byte type){

        this.type=type;
    }

    public byte getType() {
        return type;
    }

    }
