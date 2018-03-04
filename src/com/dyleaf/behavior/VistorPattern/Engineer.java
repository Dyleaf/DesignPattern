package com.dyleaf.behavior.VistorPattern;

import java.util.Random;

public class Engineer extends Staff {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getLineCode() {
        return new Random().nextInt(10 * 1000);
    }
}
