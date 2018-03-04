package com.dyleaf.create.AbstarctFactoryPatttern;

public class FactoryAsus extends AbstractFactory {

    @Override
    public Screen createScreen() {
        return new AsusComputerScreen();
    }

    @Override
    public Host createHost() {
        return new AsusComputerHost();
    }
}
