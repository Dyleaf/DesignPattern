package behavior.InterpreterPattern;

public abstract class Colleague {

    protected Mediator mMediator;//每一个同事都该知道其中介者

    public Colleague(Mediator _mediator){
        this.mMediator = _mediator;
    }
}