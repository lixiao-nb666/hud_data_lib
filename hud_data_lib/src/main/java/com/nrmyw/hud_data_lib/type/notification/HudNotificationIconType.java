package com.nrmyw.hud_data_lib.type.notification;

public enum HudNotificationIconType {
    HIDE((byte)0x00),
    EXIT((byte)0x01),
    ;

    byte type;
    HudNotificationIconType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }
}
