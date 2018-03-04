package behavior.MediatorPattern;

public class Test {
    public static void main(String[] args) {
        CommonUser user1 = new CommonUser("小王");
        CommonUser user2 = new CommonUser("小陈");
        VIPUser vipUser = new VIPUser("小张");

        Mediator chatRoom = new ChatRoomMediator();
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(vipUser);

        user2.sendMessage("hello everybody~");

    }
}
