package structure.CompositePattern;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("leaf no child to add");
    }

    @Override
    public void remove(Component c) {
        System.out.println("leaf no child to remove");
    }

    @Override
    public void display(int depth) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <depth ; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString()+name);
    }
}
