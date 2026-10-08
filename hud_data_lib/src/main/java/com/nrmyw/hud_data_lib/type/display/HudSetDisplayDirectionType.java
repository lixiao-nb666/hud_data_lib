package com.nrmyw.hud_data_lib.type.display;

public enum HudSetDisplayDirectionType {
    //直接发送指令
    TOP((byte)0x00),//关闭
    BOTTOM((byte)0x01),//显示
    ;
    byte type;
    HudSetDisplayDirectionType(byte type){
        this.type=type;
    }
    public byte getType() {
        return type;
    }
}
