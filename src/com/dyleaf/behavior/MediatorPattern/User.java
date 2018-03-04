package behavior.MediatorPattern;

public abstract class User {
    protected Mediator mediator;

    protected String name;

    public User(String name) {
        this.name = name;
    }

    protected void setMediator(Mediator mediator){
        this.mediator = mediator;
    }
    protected abstract void sendMessage(String msg);

    protected abstract void getMessage(String msg);
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}