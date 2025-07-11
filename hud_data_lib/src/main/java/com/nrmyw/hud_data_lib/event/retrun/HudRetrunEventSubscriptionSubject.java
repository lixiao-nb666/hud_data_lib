package com.nrmyw.hud_data_lib.event.retrun;



import java.util.ArrayList;
import java.util.List;


public class HudRetrunEventSubscriptionSubject implements HudRetrunEventSubject {

    private List<HudRetrunEventObserver> observers;
    private static HudRetrunEventSubscriptionSubject subscriptionSubject;

    private HudRetrunEventSubscriptionSubject() {
        observers = new ArrayList<>();
    }

    public static HudRetrunEventSubscriptionSubject getInstence() {
        if (subscriptionSubject == null) {
            synchronized (HudRetrunEventSubscriptionSubject.class) {
                if (subscriptionSubject == null)
                    subscriptionSubject = new HudRetrunEventSubscriptionSubject();
            }
        }
        return subscriptionSubject;

    }

    @Override
    public void attach(HudRetrunEventObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(HudRetrunEventObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void none(byte[] bytes) {
        for (HudRetrunEventObserver observer:observers){
            observer.none(bytes);
        }
    }

    @Override
    public void getBrightnessV(int mode, int autoV, int handV) {
        for (HudRetrunEventObserver observer:observers){
            observer.getBrightnessV(mode,autoV,handV);
        }
    }



    @Override
    public void getSoundV(int v) {
        for (HudRetrunEventObserver observer:observers){
            observer.getSoundV(v);
        }
    }

    @Override
    public void getDeviceSoundStatu(int deviceSoundStatu) {
        for (HudRetrunEventObserver observer:observers){
            observer.getDeviceSoundStatu(deviceSoundStatu);
        }
    }

    @Override
    public void getSN(String sn) {
        for (HudRetrunEventObserver observer:observers){
            observer.getSN(sn);
        }
    }

    @Override
    public void getDeviceVersion(String deviceVersion) {
        for (HudRetrunEventObserver observer:observers){
            observer.getDeviceVersion(deviceVersion);
        }
    }

    @Override
    public void getGPSSpeed(int v) {
        for (HudRetrunEventObserver observer:observers){
            observer.getGPSSpeed(v);
        }
    }


}
