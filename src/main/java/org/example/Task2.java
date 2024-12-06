package org.example;

public class Task2 {

    public static int calcSumArray(int[] arr) {
        int result = 0;
        //replacing 1 -> 0 for debugging should work
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
}
