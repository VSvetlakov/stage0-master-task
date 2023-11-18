package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("%s x %s = %s".formatted(i, numberTableToPrint, i*numberTableToPrint));
        }
    }

}
