package behavior.MediatorPattern;

public class ChatRoomMediator extends Mediator {

    @Override
    public void operation(User user, String msg) {
        System.out.println(user.getName() + "send a msg : " + msg);
        for(User userTmp : this.userList){
            userTmp.getMessage(msg);
        }
    }
}