package com.dyleaf.create.FactoryMethodPattern;

public class ConcreteFactory extends Factory {
    @Override public Product createProduct() {
        return new ConcreteProductA();
    }
}