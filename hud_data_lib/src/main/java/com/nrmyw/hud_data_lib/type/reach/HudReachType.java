package com.nrmyw.hud_data_lib.type.reach;

public enum HudReachType {
//    NONE,
//    AM,
//    PM,

    NONE((byte)0x00),//默认样式
    AM((byte)0x01),//早上的样式
    PM((byte)0x02),//下午的样式
    ARRIVAL((byte)0x03),//到达时间的样式
    ARRIVAL_AM((byte)0x04),//到达时间的样式
    ARRIVAL_PM((byte)0x05),//到达时间的样式

    HIDE((byte)0x09),//到达时间的样式
    ;
    byte type;
    HudReachType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }
}
