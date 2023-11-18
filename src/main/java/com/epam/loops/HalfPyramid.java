package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {

        for (int i = 0; i < cathetusLength; i++) {

            String line = "";

            for (int j = 0; j < cathetusLength; j++) {

                if (j <= i)
                    line = line + "*";
                else
                    line = " " + line;

            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
