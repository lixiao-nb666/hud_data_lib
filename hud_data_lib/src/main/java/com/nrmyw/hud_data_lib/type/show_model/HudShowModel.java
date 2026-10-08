package com.nrmyw.hud_data_lib.type.show_model;

public enum HudShowModel {
    NAVI((byte)0x00),
    TRANSLATE((byte)0x01),
    HINT_BAR((byte)0x02),
    FUNCTIONS((byte)0x03)
    ;
    byte type;
    HudShowModel(byte type){
        this.type=type;
    }

    public byte getType() {
        return type;
    }


}
