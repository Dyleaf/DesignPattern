package create.PrototypePattern;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cell prototypeCell = new Cell(888);
        for(int i = 0; i < 10; i++){
            Cell copyCell = (Cell) prototypeCell.clone();
            System.out.println(copyCell.hashCode() + ":" + copyCell.getCellId());
        }
    }
}
