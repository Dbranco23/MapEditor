package org.codeforall.iorns.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;

import static org.codeforall.iorns.Grid.CELL_SIZE;

public class Cursor extends Cell {

    public enum Moving {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public Cursor() {
        super(0, 0);
        rectangle.setColor(Color.DARK_GRAY);
        rectangle.fill();
    }

    public void up() {
        row--;
        rectangle.translate(0, -CELL_SIZE);
    }

    public void down() {
        row++;
        rectangle.translate(0, CELL_SIZE);
    }

    public void left() {
        col--;
        rectangle.translate(-CELL_SIZE, 0);

    }

    public void right() {
        col++;
        rectangle.translate(CELL_SIZE, 0);
    }

}
