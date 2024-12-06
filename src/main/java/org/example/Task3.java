package org.example;

public class Task3 {

    public static int[] sum(int n){
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = i + 1;
        }

        result[n-1] = -((n-1) * n) / 2;

        return result;
    }


}
