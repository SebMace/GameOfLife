package org.example;

import org.example.LifeBoard;
import org.example.LifeCell;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    LifeBoard lifeBoard;

    @Before
    public void setUp() throws Exception {
        lifeBoard = new LifeBoard(8,10);
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testCreateLifeCells() {
        LifeCell lifeCell = new LifeCell(3,4);
        assertEquals(3,lifeCell.getRow());
        assertEquals(4,lifeCell.getColumn());
    }

    @Test
    public void testCreateLifeBoard() {
        assertEquals(8,lifeBoard.getRowSize());
        assertEquals(10,lifeBoard.getColumnSize());
    }

    @Test
    public void testGetCellFromBoard() {
        LifeCell lifeCell = lifeBoard.getCell(3,4);
        assertNotNull(lifeCell);
        assertEquals(3,lifeCell.getRow());
        assertEquals(4,lifeCell.getColumn());
        assertFalse(lifeCell.isAlive());
    }

    @Test
    public void testDrawRow() {
        String drawedBoard = lifeBoard.draw();
        System.out.println(drawedBoard);
        assertEquals(repeatString(8,repeatString(10,".")+"\n"),
                drawedBoard);

    }
    String repeatString (int nbRepeat, String stringToRepeat)
    {
        String result="";
        for (int cpt=0; cpt<nbRepeat;cpt++)
            result+=stringToRepeat;
        return result;
    }
}



