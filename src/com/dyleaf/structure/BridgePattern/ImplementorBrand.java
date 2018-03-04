package com.dyleaf.structure.BridgePattern;

public interface ImplementorBrand {
    public void sale();
}
class  ConcreteImplementorAcer implements ImplementorBrand{

    @Override
    public void sale() {
        System.out.println("宏碁品牌");
    }
}

class ConcreteImplementorApple implements ImplementorBrand{
    @Override
    public void sale() {
        System.out.println("苹果品牌");
    }
}

class ConcreteImplementorDell implements ImplementorBrand{
    @Override
    public void sale() {
        System.out.println("戴尔品牌");
    }
}