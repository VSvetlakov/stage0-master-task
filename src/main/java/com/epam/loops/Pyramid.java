package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {

        if (cathetusLength == 0)
            return;

        for (int i = 0; i < cathetusLength; i++) {

            String line = null;

            for (int j = 0; j < cathetusLength; j++) {

                if (j == 0)
                    line = String.valueOf(1);
                else if (j > i)
                    line = " " + line;
                else
                    line = (j+1) + line + (j+1);

            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
