package behavior.StrategyPattern;

public class WalkStrategy implements IStrategy {
    @Override
    public void execute() {
        System.out.println("Walking。。。");
    }
}
