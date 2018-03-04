package behavior.InterpreterPattern;

public class Cpu extends Colleague {
    private String dataSound;

    public Cpu(Mediator _mediator) {
        super(_mediator);
    }

    public String getDataSound() {
        return dataSound;
    }

    public void load(){
        dataSound = "sound_play_from_cpu";

        mMediator.changed(this);
    }
}