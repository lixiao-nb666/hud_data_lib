package com.nrmyw.hud_data_lib.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HudLaneHiPassCountBean implements Serializable {
    private List<Integer> laneList;
    private int index;

    public List<Integer> getLaneList() {
        if(null==laneList){
            laneList=new ArrayList<>();
        }
        return laneList;
    }

    public void add(int type){
        if(null==laneList){
            laneList=new ArrayList<>();
        }
        if(laneList.size()>=8){
            return;
        }
        laneList.add(type);
    }

    public int getIndex() {
        return index;
    }

    public void setLaneList(List<Integer> laneList) {
        this.laneList = laneList;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "HudLaneHiPassCountBean{" +
                "laneList=" + laneList +
                ", index=" + index +
                '}';
    }
}
