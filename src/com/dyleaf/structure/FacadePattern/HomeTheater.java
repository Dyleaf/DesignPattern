package com.dyleaf.structure.FacadePattern;

public class HomeTheater {
    Amplifier amp;
    Light light;
    TV tv;

    public HomeTheater(Amplifier amp, Light light, TV tv) {
        this.amp = amp;
        this.light = light;
        this.tv = tv;
    }

    public void WatchMove() {
        amp.on();
        light.adjust();
        tv.on();
    }
}
