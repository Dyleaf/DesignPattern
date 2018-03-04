package behavior.StrategyPattern;

public class Test {
    public static void main(String[] args) {
        Context context = null;
        context = new Context(new WalkStrategy());
        context.execute();
        context = new Context(new DriveStrategy());
        context.execute();
    }
}
