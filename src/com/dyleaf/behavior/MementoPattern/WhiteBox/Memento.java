package com.dyleaf.behavior.MementoPattern.WhiteBox;

public class Memento {

    private int state;

    public Memento() {
        super();
    }

    public Memento(int state) {
        this.state = state;
        System.out.println("备忘录 当前保存 状态：" + state);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

}
