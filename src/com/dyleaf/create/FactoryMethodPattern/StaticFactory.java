package com.dyleaf.create.FactoryMethodPattern;



public class StaticFactory{
    public static  Product createProducA(){
        return new ConcreteProductA();
    }

    public static Product createProductB(){
        return new ConcreteProductB();
    }
}
