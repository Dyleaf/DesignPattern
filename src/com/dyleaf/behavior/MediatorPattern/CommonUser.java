package behavior.MediatorPattern;

public class CommonUser extends User{

    public CommonUser(String name) {
        super(name);
    }
    @Override
    protected void sendMessage(String msg) {
        this.mediator.operation(this, msg);
    }

    @Override
    protected void getMessage(String msg) {
        System.out.println(this.getName() +  " get msg:"+msg);
    }


}