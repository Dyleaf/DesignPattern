package com.dyleaf.create.FactoryMethodPattern;

// 抽象工厂类
abstract class MoreMethodFactory {
    public abstract Product createProducA();
    public abstract Product createProductB();
}

public class MoreMethodConcreteFactory extends MoreMethodFactory {

    @Override
    public  Product createProducA() {
        return new ConcreteProductA();
    }

    @Override
    public Product createProductB() {
        return new ConcreteProductB();
    }
}
