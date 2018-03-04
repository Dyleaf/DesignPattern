package behavior.InterpreterPattern;

public class Test {
    public static void main(String[] args) {
        MainBoard mainBoard = new MainBoard();
        Cpu cpu = new Cpu(mainBoard);
        SoundCard soundCard = new SoundCard(mainBoard);

        mainBoard.setCpu(cpu);
        mainBoard.setSoundCard(soundCard);

        cpu.load();
    }
}
