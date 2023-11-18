package com.epam.loops;

import java.util.Scanner;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%s x %s = %s",i,numberTableToPrint,i*numberTableToPrint));
        }
    }

}
