package behavior.StrategyPattern;

public class DriveStrategy implements IStrategy {
    @Override
    public void execute() {
        System.out.println("driving。。。");
    }
}
