package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {

        String[] seasons = new String[4];
        seasons[0] = "winter";
        seasons[1] = "spring";
        seasons[2] = "summer";
        seasons[3] = "autumn";

        return seasons;
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {

        int[] ints = new int[length];

        for (int i = 0; i < length; i++) {
            ints[i] = i+1;
        }

        return ints;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }

        return result;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == number)
               return i;

        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {

        String[] result = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[arr.length - i - 1] = arr[i];
        }

        return result;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {

        int[] temp = new int[arr.length];

        int positiveCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                temp[positiveCount++] = arr[i];
            }
        }

        int[] result = new int[positiveCount];

        for (int i = 0; i < positiveCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {

        //int[][] result = new int[arr.length][];

        arr = sortArrByLength(arr);

        for (int i = 0; i < arr.length; i++) {
            sortArray(arr[i]);
        }
        return arr;
    }

    private int[][] sortArrByLength(int[][] arr){

        if (arr.length == 0)
            return null;

        for (int i = 0; i < arr.length; i++) {

            int minLenght = arr[i].length;

            for (int j = i+1; j < arr.length; j++) {
                if (minLenght > arr[j].length) {

                    int[] temp = arr[i];
                    arr[i] = arr[j];
                    minLenght = arr[j].length;
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    private void sortArray(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int minInt = arr[i];

            for (int j = i; j < arr.length; j++) {

                if (minInt > arr[j]) {

                    int tempInt = minInt;
                    arr[i] = arr[j];
                    arr[j] = tempInt;
                    minInt = arr[j];
                }
            }
        }
    }

}
