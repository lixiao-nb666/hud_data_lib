package com.nrmyw.hud_data_lib.type.ui;

public enum HudUiType {
    MAIN((byte) 0x00),
    TRANSLATION((byte) 0x01),
    HINT_STR((byte) 0x02),
    NANI((byte) 0x03),
    UI_5((byte) 0x04),
    ;
    byte type;

    HudUiType(byte type){

        this.type=type;
    }

    public byte getType() {
        return type;
    }
}
