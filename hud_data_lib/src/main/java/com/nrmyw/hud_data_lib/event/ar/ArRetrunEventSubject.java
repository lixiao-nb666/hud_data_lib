package com.nrmyw.hud_data_lib.event.ar;


import com.nrmyw.hud_data_lib.type.ar_mold.ArMoldType;

public interface ArRetrunEventSubject {
    /**
     * 增加订阅者
     *
     * @param observer
     */
    public void attach(ArRetrunEventObserver observer);

    /**
     * 删除订阅者
     *
     * @param observer
     */
    public void detach(ArRetrunEventObserver observer);


    public void getNowMold(ArMoldType arMoldType);



}
