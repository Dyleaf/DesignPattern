package behavior.StatePattern;

public class DriveState implements IState {
    @Override
    public void execute(StateContext context) {
        System.out.println("driving。。。");
        context.setState(new WalkState());
    }
}
