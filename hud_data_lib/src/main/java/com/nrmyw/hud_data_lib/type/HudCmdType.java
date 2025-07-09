package com.nrmyw.hud_data_lib.type;




public enum HudCmdType {
    //直接发送指令
    TIME((byte)0x01),//发送时间
    SPEED((byte)0x02),//发送当前速度
    SPEEDING((byte)0x1B),//超速
    INTERVAL_SPEED((byte)0x03),//发送区间速度
    WARNING_POINT((byte)0x04),//发送警示信息
    BIG_WARNING_POINT((byte)0x0E),//发送大号警示信息
    REACH_INFO((byte)0x05),//到达信息
    LANE_INFORMATION((byte)0x06),//车道信息显示
    TURN_TYPE((byte)0x07),//转向信息显示
    Next_LANE_NAME((byte)0x08),//道路名称
    NOW_LANE_STR((byte)0x14),//道路名称
    GPS((byte)0x09),//GPS
    SET_GPS_SPEED((byte)0x0D),//GPS
    QUERY_GPS_SPEED((byte)0xFD),//查询GPS速度比例值
    SET_BRIGHTNESS((byte)0x0A),//设置亮度
    QUERY_BRIGHTNESS((byte)0xFA),//查询亮度
    QUERY_SN((byte)0xFB),//查询亮度
    REWRITE_SN((byte)0x0C),//重写SN码
    QUERY_DEVICE_VERSION((byte)0xFC),//获得设备版本信息
    SET_SOUND((byte)0xA1),//设置声音
    QUERY_SOUND((byte)0xA2),//查询声音
    READY_SEND_IMAGE((byte)0x10),//发送图片
    SHOW_IMAGE((byte)0x11),//显隐实景图
    YELLOW_STATU((byte)0x12),//显隐实景图
    RETRUN_IMAGE((byte)0x55),
    ICON_FLICKER((byte)0x13),//闪烁图标
    FACTORY_SET((byte)0x15),//工厂设置
    SET_DEVICE_SOUND_STATU((byte)0x16),//设置设备声音开关
    QUERY_DEVICE_SOUND_STATU((byte)0x17),//查询设备声音开关
    SET_DAYLIGHTING_SHOW_STATU((byte)0x18),//设置采光值开关
    YELLOW_STATU_STR((byte)0x60),//设置黄色状态栏的值
    WARNING_POINT_1_T_STR((byte)0x61),
    WARNING_POINT_1_B_STR((byte)0x62),
    WARNING_POINT_2_T_STR((byte)0x63),
    WARNING_POINT_2_B_STR((byte)0x64),
    ;
    private byte title;

    HudCmdType(byte title){
        this.title=title;
    }


    public byte getTitle() {
        return title;
    }
}
