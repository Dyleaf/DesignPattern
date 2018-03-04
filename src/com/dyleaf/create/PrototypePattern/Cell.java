package com.dyleaf.create.PrototypePattern;

public class Cell implements Cloneable {
    private int cellId;

    public int getCellId() {
        return cellId;
    }

    public void setCellId(int cellId) {
        this.cellId = cellId;
    }

    public Cell(int id) {
        this.cellId = id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("clone a cell obj.");
        return (Cell) super.clone();
    }
}