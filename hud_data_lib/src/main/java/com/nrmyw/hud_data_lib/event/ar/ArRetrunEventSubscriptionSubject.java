package com.nrmyw.hud_data_lib.event.ar;



import com.nrmyw.hud_data_lib.event.retrun.HudRetrunEventObserver;
import com.nrmyw.hud_data_lib.event.retrun.HudRetrunEventSubject;
import com.nrmyw.hud_data_lib.type.ar_mold.ArMoldType;

import java.util.ArrayList;
import java.util.List;


public class ArRetrunEventSubscriptionSubject implements ArRetrunEventSubject {

    private List<ArRetrunEventObserver> observers;
    private static ArRetrunEventSubscriptionSubject subscriptionSubject;

    private ArRetrunEventSubscriptionSubject() {
        observers = new ArrayList<>();
    }

    public static ArRetrunEventSubscriptionSubject getInstence() {
        if (subscriptionSubject == null) {
            synchronized (ArRetrunEventSubscriptionSubject.class) {
                if (subscriptionSubject == null)
                    subscriptionSubject = new ArRetrunEventSubscriptionSubject();
            }
        }
        return subscriptionSubject;

    }


    @Override
    public void attach(ArRetrunEventObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(ArRetrunEventObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void getNowMold(ArMoldType arMoldType) {
        for (ArRetrunEventObserver observer:observers){
            observer.getNowMold(arMoldType);
        }
    }
}
