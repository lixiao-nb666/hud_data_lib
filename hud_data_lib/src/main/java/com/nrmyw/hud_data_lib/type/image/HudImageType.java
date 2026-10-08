package com.nrmyw.hud_data_lib.type.image;

public enum HudImageType {
    //直接发送指令
    IMAGE((byte)0x00),//关闭
    PROGRESS_BAR((byte)0x01),//显示

    ;
    byte type;
    HudImageType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }
}
