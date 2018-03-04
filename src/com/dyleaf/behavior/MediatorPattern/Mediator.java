package behavior.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {

    protected List<User> userList;
    public Mediator() {
        userList = new ArrayList<User>();
    }
    public void addUser(User user){
        user.setMediator(this);
        this.userList.add(user);
    }

    public abstract void operation(User user, String msg);
}