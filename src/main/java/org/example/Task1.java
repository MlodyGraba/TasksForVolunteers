package org.example;

public class Task1 {

    public String replacewithChar(int n) {
        StringBuilder wordWithChar = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                wordWithChar.append("+");
            } else {
                wordWithChar.append("-");
            }
        }
        return wordWithChar.toString();
    }
}