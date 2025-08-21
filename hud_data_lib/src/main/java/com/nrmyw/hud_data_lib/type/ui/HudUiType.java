package com.nrmyw.hud_data_lib.type.ui;

public enum HudUiType {
    UI_1((byte) 0x00),
    UI_2((byte) 0x00),
    UI_3((byte) 0x00),
    UI_4((byte) 0x00),
    UI_5((byte) 0x00),
    ;
    byte type;

    HudUiType(byte type){

        this.type=type;
    }

    public byte getType() {
        return type;
    }
}
