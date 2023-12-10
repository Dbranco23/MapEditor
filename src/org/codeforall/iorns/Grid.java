package org.codeforall.iorns;

import org.codeforall.iorns.grid.Cell;

public class Grid {

    public static final int PADDING = 10;
    public static final int CELL_SIZE = 20;
    private int rows;
    private int cols;

    private Cell[][] cells;

    public Grid(int rows, int cols) {

        this.rows = rows;
        this.cols = cols;

        cells = new Cell[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                cells[row][col] = new Cell(row, col);
            }
        }
    }

    public Cell getCell(int row, int col) {
        return cells[row][col];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }


    public void stringToGrid(String grid) {

        int index = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                Cell lastGrid = cells[row][col];

                switch (grid.charAt(index)) {
                    case '0':
                        lastGrid.erase();
                        break;
                    case '1':
                        lastGrid.setBlack();
                        break;
                    case '2':
                        lastGrid.setRed();
                        break;
                    case '3':
                        lastGrid.setBlue();
                        break;
                    case '4':
                        lastGrid.setYellow();
                        break;
                    case '5':
                        lastGrid.setOrange();
                        break;
                    case '6':
                        lastGrid.setGreen();


                }
                index++;
            }

        }
    }

    public void clearGrid() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                cells[row][col].erase();
            }
        }
    }


    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (cells[row][col].isPainted() && cells[row][col].isBlack()) {
                    str.append("1");
                } else if (cells[row][col].isPainted() && cells[row][col].isRed()) {
                    str.append("2");
                } else if (cells[row][col].isPainted() && cells[row][col].isBlue()) {
                    str.append("3");
                } else if (cells[row][col].isPainted() && cells[row][col].isYellow()) {
                    str.append("4");
                } else if (cells[row][col].isPainted() && cells[row][col].isOrange()) {
                    str.append("5");
                } else if (cells[row][col].isPainted() && cells[row][col].isGreen()) {
                    str.append("6");
                } else {
                    str.append("0");
                }
            }
        }
        return str.toString();


    }
}
