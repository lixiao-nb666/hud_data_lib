package com.nrmyw.hud_data_lib.type.speed;

public enum HudSpeedingShowType {
    //直接发送指令
    WRITE((byte)0x00),//正常白色
    RED((byte)0x01),//警告红色
    ;
    byte type;
    HudSpeedingShowType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }


}
