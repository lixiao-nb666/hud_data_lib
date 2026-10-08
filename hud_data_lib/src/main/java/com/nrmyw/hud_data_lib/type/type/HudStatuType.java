package com.nrmyw.hud_data_lib.type.type;

public enum HudStatuType {
    //直接发送指令
    CLOSE((byte)0x00),//关闭
    OPEN((byte)0x01),//打开
    ;
    byte type;
    HudStatuType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }


}
