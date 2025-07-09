package com.nrmyw.hud_data_lib.bean;


import com.nrmyw.hud_data_lib.type.lane.HudLaneType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HudLaneCountBean implements Serializable {
    private List<HudLaneType> laneList;

    public List<HudLaneType> getLaneList() {
        return laneList;
    }

    public void add(HudLaneType type){
        if(null==type){
            return;
        }
        if(null==laneList){
            laneList=new ArrayList<>();
        }
        if(laneList.size()>=10){
            return;
        }
        laneList.add(type);
    }


    public void addByNumbUseNone(int needNumb){
        for(int i=0;i<needNumb;i++){
            add(HudLaneType.NONE);
        }

    }

    @Override
    public String toString() {
        return "LaneCountBean{" +
                "laneList=" + laneList +
                '}';
    }
}
