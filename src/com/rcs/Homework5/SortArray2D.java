package com.rcs.Homework5;

import java.util.Random;
import java.util.Scanner;

public class SortArray2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random rnd = new Random();
        int n = rnd.nextInt(12)+4;
        int m;
        do {
            System.out.println("ievadiet rindas izmēru [5;15] ");
            m = sc.nextInt();
        } while (m < 5 || m > 15);
        sc.close();
        int[][] array = new int [m][n];
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]= rnd.nextInt(900)+100;
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++){
            for (int j = 0;j < array[i].length; j++){
                for (int k = 0; k < array[i].length - j - 1; k++){
                    if (array[i][k] < array[i][k+1]){
                        int t = array[i][k];
                        array[i][k] = array[i][k + 1];
                        array[i][k + 1] = t;
                    }
                }
            }
        }
            int[] t = array[0];
            array[0] = array[m - 1];
            array[m - 1] = t;
        for(int[] row : array){
            for (int column : row){
                System.out.printf("%5d", column);
            }
            System.out.println();
        }
    }
}
