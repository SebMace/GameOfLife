package org.example;

import java.util.ArrayList;
import java.util.List;

public class LifeBoard {

    int rowSize;
    int columnSize;

    List<List<LifeCell>> boardCells = new ArrayList<>();

    public LifeBoard(int rowSize, int columnSize) {
        this.rowSize=rowSize;
        this.columnSize=columnSize;
        for (int i=0;i<rowSize;i++)
        {
            List<LifeCell> rowCells = new ArrayList<>();
            boardCells.add(rowCells);
            for (int j=0; j<columnSize;j++) {
                LifeCell currentLifeCell = new LifeCell(i,j);
                boardCells.get(i).add(currentLifeCell);
            }
        }
    }

    public int getRowSize() {
        return rowSize;
    }

    public int getColumnSize() {
        return columnSize;
    }

    public LifeCell getCell(int row, int column) {
        return boardCells.get(row).get(column);
    }


    public List<LifeCell> getRow(int row) {
        return boardCells.get(row);
    }

    public String draw() {
        String result="";
        for (int i=0; i<rowSize; i++)
        {
            for (int j=0; j<columnSize; j++ )
            {
                result+= getCell(i,j).drawCell();
            }
            result+="\n";
        }
        return result;
    }
}

