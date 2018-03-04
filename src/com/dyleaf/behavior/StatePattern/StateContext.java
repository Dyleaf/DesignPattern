package behavior.StatePattern;

public class StateContext {
    IState state;

    public StateContext(IState state) {
        this.state = state;
    }

    public void execute() {
        this.state.execute(this);
    }

    /**
     * @return the state
     */
    public IState getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(IState state) {
        this.state = state;
    }
}
