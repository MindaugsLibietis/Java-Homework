package com.rcs.Homework5;

import java.util.Random;
import java.util.Scanner;

public class SortArray2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random rnd = new Random();
        System.out.println("ievadiet rindas izmēru [5;15] ");
        int izm = sc.nextInt();
        sc.close();
        int izm2 = rnd.nextInt(12)+3;
        int[][] array = new int [izm][izm2];
        if (izm >= 5 && izm <= 15){

            for (int i = 0; i > array.length; i++) {
                for (int j = 0; j > array[i].length; j++) {
                    array[i][j]= rnd.nextInt(900)+100;
                    System.out.printf("%5d", array[i][j]);
                }
                System.out.println();
            }
        } else{
            System.out.println("nepareiza ievade");
        }
    }
}
