package create.AbstarctFactoryPatttern;

public class Test {
    public static void main(String[] args) {
        FactoryAsus factoryAsus = new FactoryAsus();
        factoryAsus.createHost();
        factoryAsus.createScreen();

        FactoryHP factoryHP = new FactoryHP();
        factoryHP.createHost();
        factoryHP.createScreen();
    }
}
