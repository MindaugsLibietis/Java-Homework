package com.rcs.Homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int size;
        do {
            System.out.println("ievadiet masīva izmēru [20;40] : ");
            size = sc.nextInt();
        } while (size < 20 || size > 40);
        sc.close();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(90) + 10;
        }
        System.out.print("Random array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i < arr.length - 1) ? ", " : "\n"));
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted array : ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ((i< arr.length - 1) ? ", " : ""));
        }

    }
}
