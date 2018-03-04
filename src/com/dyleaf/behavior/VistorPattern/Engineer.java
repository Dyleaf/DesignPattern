package behavior.VistorPattern;

import java.util.Random;

public class Engineer extends Staff {
    public Engineer(String _name) {
        super(_name);
    }

    @Override public void accept(Visitor _visitor) {
        _visitor.visit(this);
    }

    public int getProducts() {
        return new Random().nextInt(10*1000);
    }
}
