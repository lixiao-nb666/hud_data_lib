package com.nrmyw.hud_data_lib.type.notification;

public enum NotificationIconType {
    HIDE((byte)0x00),
    EXIT((byte)0x01),
    ;

    byte type;
    NotificationIconType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }
}
