package com.dyleaf.behavior.VistorPattern;

public interface Visitor {

    void visit(Engineer _engineer);

    void visit(Manager _manager);
}