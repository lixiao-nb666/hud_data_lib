package com.nrmyw.hud_data_lib.type.turn;

public enum HudTurnType {
    none((byte) 0x00),
    numb_154((byte) 0x01),//高速收费口
    numb_200((byte) 0x02),//出发
    numb_201((byte) 0x03),//到达
    tbt11((byte) 0x04),//直行,g_t33
    tbt12((byte) 0x05),//左拐,g_t34
    tbt13((byte) 0x06),//右拐,g_t35
    tbt14((byte) 0x07),//左转调头，g_t41
    tbt15((byte) 0x08),//进入绕一圈左出来
    tbt16((byte) 0x09),//左后方,g_t36
    tbt17((byte) 0x0A),//左前方,g_t38
    tbt18((byte) 0x0B),//右前方,g_t39
    tbt19((byte) 0x0C),//右后方,g_t37
    tbt43((byte) 0x0D),//右前方然后直行
    tbt44((byte) 0x0E),//左前方然后直行
    tbt46((byte) 0x0F),//向左进入环岛然后右出来
    tbt47((byte) 0x10),//向右进入环岛然后左出来
    tbt48((byte) 0x11),//前行进入向右弯道，半圈然后直行出来
    tbt74((byte) 0x12),//右拐然后左拐出来直行
    tbt75((byte) 0x13),//左拐然后右拐出来直行
    tbt101((byte) 0x14),//直行和右前2条道路，向右前方 in
    tbt102((byte) 0x15),//直行和左前2条道路，向左前方 in，g_t7
    tbt103((byte) 0x16),//直行 in
    tbt104((byte) 0x17),//直行和右前2条道路，向右前方 out
    tbt105((byte) 0x18),//直行和左前2条道路，向左前方 out
    tbt106((byte) 0x19),//直行 out
    tbt119((byte) 0x1A),//进入桥洞？
    tbt120((byte) 0x1B),//上桥？？？
    tbt121((byte) 0x1C),//进隧道
    tbt123((byte) 0x1D),//前面有桥向右前方换道
    tbt124((byte) 0x1E),//向右前方换道
    tbt132((byte) 0x1F),//进入环岛第2个出口出来，g_t28
    tbt133((byte) 0x20),//进入环岛第1个出口右拐出来，g_t20
    tbt134((byte) 0x21),//进入环岛第1个出口右后方出来，g_t24
    tbt136((byte) 0x22),//进入环岛转一圈出来,调头出来
    tbt138((byte) 0x23),//进入环岛最后一个出口左后方出来，g_t22
    tbt139((byte) 0x24),//进入环岛最后一个出口左方出来，g_t18
    tbt140((byte) 0x25),//进入环岛倒数第2个出口左前方出来，g_t26
    tbt142((byte) 0x26),//进入环岛直行出来，g_t30
    tbt152((byte) 0x27),//到达服务区
    tbt160((byte) 0x28),//充电的位置?？？
    tbt185((byte) 0x29),//加油的位置？？？
    tbt186((byte) 0x2A),//加油的位置？？？
    tbt250((byte) 0x2B),//过船？？？
    undera((byte) 0x2C),//地下选中
    underb((byte) 0x2D),//地下未选中


    //中文新增图标
    c_154((byte) 0x60),//地下未选中
    c_200((byte) 0x61),//地下未选中
    c_201((byte) 0x62),//地下未选中
    c_800((byte) 0x63),//地下未选中
    //英文新增图标
    e_200((byte) 0x80),//地下未选中
    e_201((byte) 0x81),//地下未选中

    g_t1((byte) 0xA1),//谷歌1号图标
    g_t2((byte) 0xA2),//谷歌2号图标
    g_t3((byte) 0xA3),//谷歌3号图标
    g_t4((byte) 0xA4),//谷歌4号图标
    g_t6((byte) 0xA6),//谷歌6号图标
    g_t7((byte) 0xA7),//谷歌7号图标
    g_t8((byte) 0xA8),//谷歌8号图标
    g_t9((byte) 0xA9),//谷歌9号图标
    g_t10((byte) 0xAA),//谷歌10号图标
    g_t11((byte) 0xAB),//谷歌11号图标
    g_t12((byte) 0xAC),//谷歌12号图标
    g_t13((byte) 0xAD),//谷歌13号图标
    g_t14((byte) 0xAE),//谷歌14号图标
    g_t15((byte) 0xAF),//谷歌15号图标
    g_t16((byte) 0xB0),//谷歌16号图标
    g_t17((byte) 0xB1),//谷歌17号图标
    g_t19((byte) 0xB3),//谷歌19号图标
    g_t21((byte) 0xB5),//谷歌21号图标
    g_t23((byte) 0xB7),//谷歌23号图标
    g_t25((byte) 0xB9),//谷歌25号图标
    g_t27((byte) 0xBB),//谷歌27号图标
    g_t29((byte) 0xBD),//谷歌29号图标
    g_t31((byte) 0xBF),//谷歌31号图标
    g_t32((byte) 0xC0),//谷歌32号图标
    g_t40((byte) 0xC8),//谷歌40号图标



//    g_t5((byte) 0xA5),//谷歌5号图标
//    g_t18((byte) 0xB2),//谷歌18号图标
//    g_t20((byte) 0xB4),//谷歌20号图标
//    g_t22((byte) 0xB6),//谷歌22号图标
//    g_t24((byte) 0xB8),//谷歌24号图标
//    g_t26((byte) 0xBA),//谷歌26号图标
//    g_t28((byte) 0xBC),//谷歌28号图标
//    g_t30((byte) 0xBE),//谷歌30号图标
    //    g_t33((byte) 0xC1),//谷歌33号图标
//    g_t34((byte) 0xC2),//谷歌34号图标
//    g_t35((byte) 0xC3),//谷歌35号图标
//    g_t36((byte) 0xC4),//谷歌36号图标
//    g_t37((byte) 0xC5),//谷歌37号图标
//    g_t38((byte) 0xC6),//谷歌38号图标
//    g_t39((byte) 0xC7),//谷歌39号图标
//    g_t41((byte) 0xC9),//谷歌41号图标
    ;

    byte type;

    HudTurnType(byte type){

        this.type=type;
    }

    public byte getType() {
        return type;
    }



}
