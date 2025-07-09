package com.nrmyw.hud_data_lib.type;

public enum HudCmdRetrunType {
    //直接发送指令
    NONE((byte)0x00),//找不到
    GET_BRIGHTNESS((byte)0xFA),//返回亮度值
    GET_SN((byte)0xFB),//返回SN码
    GET_DEVICE_VERSION((byte)0xFC),//返回版本信息
    GET_SOUND((byte)0xA2),//返回声音值
    GET_GPS_SPEED((byte)0xFD),//GPS速度比例值
    GET_ACK_SIZE((byte)0x55),//获得包的大小
    GET_DEVICE_SOUND_STATU((byte)0x17),//获得包的大小
    ;
    byte type;
    HudCmdRetrunType(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }

    public static HudCmdRetrunType useByteGetRetrunType(byte checkByte){
        for(HudCmdRetrunType t800CmdRetrunType: HudCmdRetrunType.values()){
            if(checkByte==t800CmdRetrunType.type){
                return t800CmdRetrunType;
            }
        }
        return NONE;

    }

}
