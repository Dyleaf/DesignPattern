package create.FactoryMethodPattern;

public class Test {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Computer product = factory.createProduct('A');
        product.method();
        factory.createProduct('H');

    }
}
