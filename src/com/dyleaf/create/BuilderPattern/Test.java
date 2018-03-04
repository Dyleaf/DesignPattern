package com.dyleaf.create.BuilderPattern;

public class Test {
    public static void main(String[] args) {
        Builder hpBuilder = new HPBuilder();
        Director director = new Director(hpBuilder);
        Computer hpPC = director.construct();
        System.out.println(hpPC.toString());

        Builder lenovoBuilder = new LenovoBuilder();
        director.setBuilder(lenovoBuilder);
        Computer lenovoPC = director.construct();
        System.out.println(lenovoPC.toString());

    }
}
