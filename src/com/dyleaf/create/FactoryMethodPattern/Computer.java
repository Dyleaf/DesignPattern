package create.FactoryMethodPattern;

//抽象产品类
public abstract class Computer {

    public abstract void method();
}

//具体产品类
class AsusComputer extends Computer {


    @Override
    public void method() {
        System.out.println("method: -->我是华硕电脑");
    }
}

class HPComputer extends Computer {

    @Override
    public void method() {
        System.out.println("method: -> 我是惠普电脑");
    }
}