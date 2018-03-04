package behavior.Observer;

public class Police implements Watcher{
    @Override
    public void update() {
        System.out.println("运输车行动，警察保护");
    }
}
