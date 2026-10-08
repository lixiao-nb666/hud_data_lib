package com.nrmyw.hud_data_lib.type.set;

public enum HudBrightnessMoldType {
    //直接发送指令
    AUTO((byte)0x00),//自动
    HAND((byte)0x01),//手动

    ;
    byte type;
    HudBrightnessMoldType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }


}
