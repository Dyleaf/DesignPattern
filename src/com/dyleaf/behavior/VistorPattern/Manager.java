package behavior.VistorPattern;

import java.util.Random;

public class Manager extends Staff {
    public Manager(String _name) {
        super(_name);
    }

    @Override public void accept(Visitor _visitor) {
        _visitor.visit(this);
    }

    public int getProducts() {
        return new Random().nextInt(10);
    }
}
