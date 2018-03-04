package com.dyleaf.create.BuilderPattern;

public class HPBuilder extends Builder{

    @Override
    public void buildCpu() {
        System.out.println("hp: build cpu start...");
        this.getComputer().setCpu("hp cpu");
        System.out.println("hp: build cpu end...");
    }

    @Override
    public void buildRam() {
        System.out.println("hp: build ram start...");
        this.getComputer().setRam("hp ram");
        System.out.println("hp: build ram end...");

    }

    @Override
    public void buildMonitor() {
        System.out.println("hp: build monitor start...");
        this.getComputer().setMonitor("hp monitor");
        System.out.println("hp: build monitor end...");

    }

}