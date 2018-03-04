package behavior.StatePattern;


public class WalkState implements IState {
    @Override
    public void execute(StateContext context) {
        System.out.println("walking。。。");
        context.setState(new DriveState());
    }
}
