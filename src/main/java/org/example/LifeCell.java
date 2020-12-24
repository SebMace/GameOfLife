package org.example;

public class LifeCell {
    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public LifeCell(int row, int column) {
        this.row = row;
        this.column = column;
    }

    int row;
    int column;
    StateCell stateCell = StateCell.DEAD;

    public boolean isAlive() {
        if (stateCell==StateCell.ALIVE) return true;
        return false;
    }
    public  String drawCell()
    {
        return stateCell==StateCell.ALIVE ? "*" : ".";
    }
}
