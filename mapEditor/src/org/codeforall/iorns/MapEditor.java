package org.codeforall.iorns;

import org.codeforall.iorns.grid.Cell;
import org.codeforall.iorns.grid.Cursor;
import org.codeforall.iorns.utils.Saver;

public class MapEditor {

    private Grid grid;
    private Cursor cursor;


    public MapEditor(int rows, int cols) {
        grid = new Grid(rows, cols);
        cursor = new Cursor();
    }

    public void moveCursor(Cursor.Moving moving) {

        if (cursorLimits(moving)) {
            return;
        }

        switch (moving) {
            case UP:
                cursor.up();
                break;
            case DOWN:
                cursor.down();
                break;
            case LEFT:
                cursor.left();
                break;
            case RIGHT:
                cursor.right();
                break;
        }


    }

    public void paintInBlack() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (cell.isPainted() && cell.isBlack()) {
            cell.erase();
        } else {
            cell.setBlack();
        }
    }

    public void paintInBlue() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (cell.isPainted() && cell.isBlue()) {
            cell.erase();
        } else {
            cell.setBlue();
        }
    }

    public void paintInYellow() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (cell.isPainted() && cell.isYellow()) {
            cell.erase();
        } else {
            cell.setYellow();
        }
    }

    public void paintInRed() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (cell.isPainted() && cell.isRed()){
            cell.erase();
        } else {
            cell.setRed();
        }
    }

    public void paintInGreen() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (cell.isPainted() && cell.isGreen()) {
            cell.erase();
        } else {
            cell.setGreen();
        }
    }

    public void paintInOrange() {
        Cell cell = grid.getCell(cursor.getRow(), cursor.getCol());
        if (cell.isPainted() && cell.isOrange()) {
            cell.erase();
        } else {
            cell.setOrange();
        }
    }



    public void clear() {
        grid.clearGrid();
    }

    public void load() {
        grid.stringToGrid(Saver.readCells());
    }

    public void save() {
        Saver.writeCells(grid.toString());
    }



    private boolean cursorLimits(Cursor.Moving moving) {
        return moving == Cursor.Moving.UP && cursor.getRow() == 0 ||
                moving == Cursor.Moving.DOWN && cursor.getRow() == grid.getRows() - 1 ||
                moving == Cursor.Moving.LEFT && cursor.getCol() == 0 ||
                moving == Cursor.Moving.RIGHT && cursor.getCol() == grid.getCols() - 1;
    }

}
