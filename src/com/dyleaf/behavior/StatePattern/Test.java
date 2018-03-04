package com.dyleaf.behavior.StatePattern;

public class Test {
    public static void main(String[] args) {
        StateContext stateContext = new StateContext(new WalkState());
        stateContext.execute();
        stateContext.execute();
        stateContext.execute();
        stateContext.execute();
        stateContext.execute();
    }
}
