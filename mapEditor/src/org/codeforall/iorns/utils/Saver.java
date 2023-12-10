package org.codeforall.iorns.utils;

import java.io.*;

public class Saver {


    public static String readCells() {

        String line;
        BufferedReader bufferedReader;

        try {
            bufferedReader = new BufferedReader(new FileReader("resources/saved.txt"));
            line = bufferedReader.readLine();
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return line;
    }

    public static void writeCells(String file) {

        BufferedWriter bufferedWriter;

        try {

            bufferedWriter = new BufferedWriter(new FileWriter("resources/saved.txt"));
            bufferedWriter.write(file);
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
