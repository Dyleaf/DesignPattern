package com.dyleaf.structure.BridgePattern;

public class AbstractionComputer {
    protected ImplementorBrand brand;

    public AbstractionComputer(ImplementorBrand brand){
        this.brand=brand;
    }

    public void sale(){
        brand.sale();
    }
}

/**
 * 扩展部分
 */
class RefinedAbstractionDesktop extends AbstractionComputer{
    public RefinedAbstractionDesktop(ImplementorBrand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        //添加自己的特性,实际业务。
        paly();
        super.sale();
    }

    public void paly(){
        System.out.println("我台式机抗摔打");
    }
}

class RefinedAbstractionLaptop extends AbstractionComputer{
    public RefinedAbstractionLaptop(ImplementorBrand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        //添加自己的特性,实际业务。
        lighting();
        super.sale();
    }

    public void lighting(){
        System.out.println("我笔记本电脑充电5分钟，续航5小时");
    }
}

class RefinedAbstractionPad extends AbstractionComputer{
    public RefinedAbstractionPad(ImplementorBrand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        //添加自己的特性,实际业务。
        weighting();
        super.sale();
    }

    public void weighting(){
        System.out.println("我平板电脑便于携带");
    }
}