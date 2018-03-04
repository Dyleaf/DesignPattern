package com.dyleaf.behavior.VistorPattern;

import java.util.Random;

public abstract class Staff {

    public String name;
    public int kpi;

    public Staff(String _name) {
        name = _name;
        kpi = new Random().nextInt(10);
    }

    public abstract void accept(Visitor _visitor);
}