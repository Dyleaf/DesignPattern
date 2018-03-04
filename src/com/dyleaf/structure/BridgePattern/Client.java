package structure.BridgePattern;

public class Client {

    public static void main(String[] args) {
        //品牌纬度-实现部分接口
        ImplementorBrand brand=new ConcreteImplementorApple();
        //机器类型纬度
        AbstractionComputer computer=new RefinedAbstractionLaptop(brand);

        computer.sale();
    }
}