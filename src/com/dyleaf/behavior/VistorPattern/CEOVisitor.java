package behavior.VistorPattern;

public class CEOVisitor implements Visitor {

    @Override
    public void visit(Engineer _engineer) {
        System.out.println("visit: -->" + "工程师 : " + _engineer.name + ",kpi : " + _engineer.kpi);
    }

    @Override
    public void visit(Manager _manager) {
        System.out.println("visit: -->"
                + "经理 : "
                + _manager.name
                + ",kpi : "
                + _manager.kpi
                + ",新产品数 : "
                + _manager.getProducts());
    }
}
//.