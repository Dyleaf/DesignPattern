package behavior.InterpreterPattern;

//主板,中介者角色
public class MainBoard extends Mediator {
    private Cpu mCpu;
    private SoundCard mSoundCard;

    @Override public void changed(Colleague _colleague) {
        if (_colleague == mCpu) {
            handleCpu((Cpu) _colleague);
        }
    }

    private void handleCpu(Cpu _colleague) {
        mSoundCard.soundPlay(_colleague.getDataSound());
    }

    public void setCpu(Cpu _cpu) {
        mCpu = _cpu;
    }

    public void setSoundCard(SoundCard _soundCard) {
        mSoundCard = _soundCard;
    }
}
