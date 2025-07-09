package com.nrmyw.hud_data_lib.type.speed;

public enum HudSpeedingShowBJType {
    //直接发送指令
    NONE((byte)0x00),//无背景
    RED((byte)0x01),//红色背景
    ;
    byte type;
    HudSpeedingShowBJType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }


}
