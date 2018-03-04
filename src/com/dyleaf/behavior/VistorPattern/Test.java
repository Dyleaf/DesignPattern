package behavior.VistorPattern;

public class Test {
    public static void main(String[] args) {
        BusinessReport businessReport = new BusinessReport();

        System.out.println("给CEO看报表 ");
        businessReport.showReport(new CEOVisitor());

    }
}
