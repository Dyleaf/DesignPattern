package com.dyleaf.create.AbstarctFactoryPatttern;

public interface Host {
}

class AsusComputerHost implements Host{

    public AsusComputerHost() {
        System.out.println("制造华硕主机");
    }
}


class HPComputerHost implements Host{

    public HPComputerHost() {
        System.out.println("制造惠普主机");
    }
}
