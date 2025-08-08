package com.nrmyw.hud_data_lib.bean;


import com.nrmyw.hud_data_lib.type.lane.HudLaneType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HudLaneCountBean implements Serializable {
    private List<HudLaneType> laneList;
    private int leftIndex;
    private int rightIndex;

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

    public int getLeftIndex() {
        return leftIndex;
    }

    public void setLeftIndex(int leftIndex) {
        this.leftIndex = leftIndex;
    }

    public int getRightIndex() {
        return rightIndex;
    }

    public void setRightIndex(int rightIndex) {
        this.rightIndex = rightIndex;
    }

    @Override
    public String toString() {
        return "HudLaneCountBean{" +
                "laneList=" + laneList +
                ", leftIndex=" + leftIndex +
                ", rightIndex=" + rightIndex +
                '}';
    }
}
