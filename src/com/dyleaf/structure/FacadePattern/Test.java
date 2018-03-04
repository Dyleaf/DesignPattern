package structure.FacadePattern;

public class Test {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Light light = new Light();
        TV tv = new TV();
        HomeTheater homeTheater = new HomeTheater(amp, light, tv);
        homeTheater.WatchMove();
    }
}
