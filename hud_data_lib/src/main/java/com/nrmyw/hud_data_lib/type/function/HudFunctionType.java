package com.nrmyw.hud_data_lib.type.function;

public enum HudFunctionType {
    NONE((byte)0x00),
    TRANSLATION((byte)0x01),
    HINT((byte)0x02),
    NANI((byte)0x03),
    RECORD_VIDEO((byte)0x04),
    TAKE_PHOTO((byte)0x05),
    ;

    private byte title;
    HudFunctionType(byte title){
        this.title=title;
    }
    public byte getTitle() {
        return title;
    }
}
