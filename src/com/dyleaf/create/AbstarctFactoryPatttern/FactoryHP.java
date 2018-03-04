package create.AbstarctFactoryPatttern;

public class FactoryHP extends AbstractFactory{
    @Override
    public Screen createScreen() {
        return new HPComputerScreen();
    }

    @Override
    public Host createHost() {
        return new HPComputerHost();
    }
}
