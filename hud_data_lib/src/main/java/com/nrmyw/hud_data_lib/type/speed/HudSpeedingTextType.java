package com.nrmyw.hud_data_lib.type.speed;

public enum HudSpeedingTextType {
    //直接发送指令
    WRITE((byte)0x00),//正常白色
    RED((byte)0x01),//警告红色
    PINK((byte)0x02),//粉色
    YELLOW((byte)0x03),//黄色
    ;
    byte type;
    HudSpeedingTextType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }


}
