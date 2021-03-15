package com.rcs.Homework5;

import java.util.Random;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int n = rnd.nextInt(4) + 3;
        int[][] array = new int[n][n];
        System.out.println("Do you wish to fill array manualy? (yes - y ; no - n):");
        char mor = sc.next().charAt(0);
        if (mor == 'y') {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.printf("Matrix [%d] [%d]", i , j);
                    array[i][j] = sc.nextInt();
                }
                System.out.println();
            }
            sc.close();
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.printf("%5d", array[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == j) {
                        System.out.printf("%5d", array[i][j]);
                    } else {
                        System.out.printf("%5d", 0);
                    }
                }
                System.out.println();
            }
        } else if (mor == 'n') {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = rnd.nextInt(100) + 1;
                    System.out.printf("%5d", array[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == j) {
                        System.out.printf("%5d", array[i][j]);
                    } else {
                        System.out.printf("%5d", 0);
                    }
                }
                System.out.println();
            }

        } else {
            System.out.println("Wrong input");
        }
    }
}
