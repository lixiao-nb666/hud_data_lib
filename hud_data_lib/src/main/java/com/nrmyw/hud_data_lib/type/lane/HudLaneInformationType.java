package com.nrmyw.hud_data_lib.type.lane;



public enum HudLaneInformationType {
    NONE((byte)0x00),//不显示
    DEF((byte)0x01),//默认普通车道
    HI_PASS((byte)0x02),//hi_pass车道
    ;
    byte type;
    HudLaneInformationType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }


}
