package com.nrmyw.hud_data_lib.type.turn;

public enum HudTurnBjType {
    DEF((byte) 0x00),
    STYLE_1((byte) 0x01),
    STYLE_2((byte) 0x02),
    STYLE_3((byte) 0x03),
    STYLE_4((byte) 0x04),
    STYLE_5((byte) 0x05),
    STYLE_6((byte) 0x06),
    STYLE_7((byte) 0x07),
    STYLE_8((byte) 0x08),
    STYLE_9((byte) 0x09),
    STYLE_10((byte) 0x0A),
    STYLE_11((byte) 0x0B),
    STYLE_12((byte) 0x0C),
    STYLE_13((byte) 0x0D),
    STYLE_14((byte) 0x0E),
    STYLE_15((byte) 0x0F),;
    byte type;

    HudTurnBjType(byte type){

        this.type=type;
    }

    public byte getType() {
        return type;
    }

    }
