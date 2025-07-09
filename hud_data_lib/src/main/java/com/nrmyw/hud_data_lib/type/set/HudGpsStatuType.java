package com.nrmyw.hud_data_lib.type.set;



public enum HudGpsStatuType {
    //直接发送指令
    CLOSE((byte)0x00),//关闭
    OPEN((byte)0x01),//开启
    LOST((byte)0x02),//丢失
    ;
    byte type;
    HudGpsStatuType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }


}
