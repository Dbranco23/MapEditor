package org.codeforall.iorns.grid;

import org.codeforall.iorns.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    int row;
    int col;
    Rectangle rectangle;
    private boolean isPainted;
    private boolean isBlack;
    private boolean isRed;
    private boolean isBlue;
    private boolean isYellow;
    private boolean isOrange;
    private boolean isGreen;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        rectangle = new Rectangle(col * Grid.CELL_SIZE + Grid.PADDING, row * Grid.CELL_SIZE + Grid.PADDING, Grid.CELL_SIZE, Grid.CELL_SIZE);
        rectangle.draw();
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean isPainted() {
        return isPainted;
    }

    public boolean isBlack() {
        return isBlack;
    }

    public void setBlack() {
        rectangle.setColor(Color.BLACK);
        rectangle.draw();
        rectangle.fill();
        isPainted = true;
        isBlack =true;
    }

    public boolean isRed() {
        return isRed;
    }

    public void setRed() {
        rectangle.setColor(Color.RED);
        rectangle.draw();
        rectangle.fill();
        isPainted = true;
        isRed = true;
    }

    public boolean isBlue() {
        return isBlue;
    }

    public void setBlue() {
        rectangle.setColor(Color.BLUE);
        rectangle.draw();
        rectangle.fill();
        isPainted = true;
        isBlue = true;
    }

    public boolean isYellow() {
        return isYellow;
    }

    public void setYellow() {
        rectangle.setColor(Color.YELLOW);
        rectangle.draw();
        rectangle.fill();
        isPainted = true;
        isYellow = true;
    }

    public boolean isOrange() {
        return isOrange;
    }

    public void setOrange() {
        rectangle.setColor(Color.ORANGE);
        rectangle.draw();
        rectangle.fill();
        isPainted = true;
        isOrange = true;
    }

    public boolean isGreen() {
        return isGreen;
    }

    public void setGreen() {
        rectangle.setColor(Color.GREEN);
        rectangle.draw();
        rectangle.fill();
        isPainted = true;
        isGreen = true;
    }


    public void erase() {
        isPainted = false;
        rectangle.setColor(Color.BLACK);
        rectangle.draw();
    }


    @Override
    public String toString() {
        return isPainted ? "1" : "0";
    }
}
