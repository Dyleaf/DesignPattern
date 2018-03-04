package com.dyleaf.create.FactoryMethodPattern;

public class Test {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct();

    }
}
