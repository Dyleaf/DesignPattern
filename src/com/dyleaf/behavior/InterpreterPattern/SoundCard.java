package behavior.InterpreterPattern;

public class SoundCard extends Colleague {
    private static final String TAG = "SoundCard";

    public SoundCard(Mediator _mediator) {
        super(_mediator);
    }

    public void soundPlay(String data) {
        System.out.println( "soundPlay: -->" + data);
    }
}