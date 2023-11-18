package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {

        String intString = String.valueOf(number);

        int result = 0;

        char[] charArray = intString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            result = result + Integer.parseInt(String.valueOf(charArray[i]));
        }

        System.out.println(result);
    }

}
