package com.dyleaf.create.AbstarctFactoryPatttern;

public interface  Screen {
}

class AsusComputerScreen implements Screen{

    public AsusComputerScreen() {
        System.out.println("制造华硕显示屏");
    }
}


class HPComputerScreen implements Screen{

    public HPComputerScreen() {
        System.out.println("制造惠普显示屏");
    }
}

