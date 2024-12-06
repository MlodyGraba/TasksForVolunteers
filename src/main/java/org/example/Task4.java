package org.example;

import java.util.Arrays;

public class Task4 {
    public int largestFamiliaNumber(int n) {
        if (n < 0 || n > 10_000) {
            throw new IllegalArgumentException("Number must be between 0 and 10_000");
        }
                String number = Integer.toString(n);
                char[] chars = number.toCharArray();
                Arrays.sort(chars);
                StringBuilder result = new StringBuilder(new String(chars)).reverse();
                return Integer.parseInt(result.toString());
            }
        }

