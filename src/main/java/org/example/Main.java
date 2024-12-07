package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userChoice = 0;
        System.out.println("Choose task: ");
        userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("Task 1: ");
                Task1 task1 = new Task1();
                System.out.println(task1.replacewithChar(10));
                System.out.println(task1.replacewithChar(6));
                System.out.println(task1.replacewithChar(3));
                break;

//                System.out.println();

            case 2:
                System.out.println("Task 2: ");
                Task2 task2 = new Task2();
                System.out.println("The sum of the numbers in the array is: "
                        + Task2.calcSumArray(new int[]{0, 1, 2, 3, 4}));
                System.out.println("The sum of the numbers in the array is: "
                        + Task2.calcSumArray(new int[]{5, 8, 3, 1, 3}));
                System.out.println("The sum of the numbers in the array is: "
                        + Task2.calcSumArray(new int[]{2, 5, 3}));
                break;

//                System.out.println();

            case 3:
                System.out.println("Task 3: ");
                Task3 task3 = new Task3();
                System.out.println(Arrays.toString(Task3.sum(10)));
                System.out.println(Arrays.toString(Task3.sum(5)));
                System.out.println(Arrays.toString(Task3.sum(3)));
                break;

//                System.out.println();

            case 4:
                System.out.println("Task 4: ");
                Task4 task4 = new Task4();
                System.out.println(task4.largestFamiliaNumber(467));
                System.out.println(task4.largestFamiliaNumber(593));
                System.out.println(task4.largestFamiliaNumber(810));
                break;

//                System.out.println();

            case 5:
                System.out.println("Task 5: ");
                Task5 task5 = new Task5();
                System.out.println(Task5.repFirstChar("Pomidor"));
                System.out.println(Task5.repFirstChar("kot"));
                System.out.println(Task5.repFirstChar("***"));
                System.out.println(Task5.repFirstChar("111"));
                break;

            default:
                System.out.println("Unknown task");
        }
    }
}