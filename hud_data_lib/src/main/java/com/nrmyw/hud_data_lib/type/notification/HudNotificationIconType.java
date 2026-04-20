package com.nrmyw.hud_data_lib.type.notification;

public enum HudNotificationIconType {
    HIDE((byte)0x00),
    EXIT((byte)0x01),
    E1((byte)0x02),
    EX((byte)0x03),
    GS((byte)0x04),
    HD((byte)0x05),
    NH((byte)0x06),
    OK((byte)0x07),
    SK((byte)0x08),
    SOIL((byte)0x09),
    STATION((byte)0x0A),

    ;

    byte type;
    HudNotificationIconType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }
}
