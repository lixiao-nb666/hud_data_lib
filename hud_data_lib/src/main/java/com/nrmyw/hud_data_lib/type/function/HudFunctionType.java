package com.nrmyw.hud_data_lib.type.function;

public enum HudFunctionType {
    TRANSLATION((byte)0x00),
    HINT((byte)0x01),
    NANI((byte)0x02),
    RECORD_VIDEO((byte)0x03),
    TAKE_PHOTO((byte)0x04),

    
    ;

    private byte title;
    HudFunctionType(byte title){
        this.title=title;
    }
    public byte getTitle() {
        return title;
    }
}
