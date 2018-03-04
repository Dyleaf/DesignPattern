package create.FactoryMethodPattern;

public abstract class Factory {

    public abstract Computer createProduct(Character type);
}

// 具体工厂类
class ConcreteFactory extends Factory {
    @Override
    public Computer createProduct(Character type) {
        switch (type){
            case 'A':
                return new AsusComputer();
            case 'H':
                return new HPComputer();
        }
        return null;
    }
}
