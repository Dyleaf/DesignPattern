package com.dyleaf.behavior.MediatorPattern;

public class VIPUser extends User{
    public VIPUser(String name) {
        super(name);
    }

    @Override
    protected void sendMessage(String msg) {
        this.mediator.operation(this, msg);
    }

    @Override
    protected void getMessage(String msg) {
        System.out.println(this.getName() + " get msg:"+msg);
    }

}