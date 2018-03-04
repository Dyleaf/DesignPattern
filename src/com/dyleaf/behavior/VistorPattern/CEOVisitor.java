package com.dyleaf.behavior.VistorPattern;

public class CEOVisitor implements Visitor {

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师 : " + engineer.name + ",kpi : " + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理 : " + manager.name + ",kpi : "
                + manager.kpi + ",新产品数 : " + manager.getProducts());
    }
}
