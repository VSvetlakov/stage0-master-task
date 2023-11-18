package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {

        StringBuilder stringBuilder = new StringBuilder(String.valueOf(number));
        number =  Integer.parseInt(stringBuilder.reverse().toString());
        System.out.println(number);
    }

}
