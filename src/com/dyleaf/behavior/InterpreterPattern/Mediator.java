package behavior.InterpreterPattern;

public abstract class Mediator {
    /**
     * 同事对象改变时通知中介者的方法
     * 在同事对象改变时由中介者去通知其他同事对象
     */
    public abstract void changed(Colleague _colleague);
}