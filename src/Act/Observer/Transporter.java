package Act.Observer;


import java.util.ArrayList;
import java.util.List;

public class Transporter implements Watched {
    private List<Watcher> list = new ArrayList<>();
    @Override
    public void addWatcher(Watcher watcher) {
        list.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        list.remove(watcher);
    }

    @Override
    public void notifyWatcher() {
        for (Watcher watcher:list) {
            watcher.update();
        }
    }
}
