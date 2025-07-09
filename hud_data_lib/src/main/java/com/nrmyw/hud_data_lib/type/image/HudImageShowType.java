package com.nrmyw.hud_data_lib.type.image;

public enum HudImageShowType {
    //直接发送指令
    HIDE((byte)0x00),//关闭
    SHOW((byte)0x01),//显示

    ;
    byte type;
    HudImageShowType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }


}
