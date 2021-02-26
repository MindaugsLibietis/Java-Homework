package com.rcs.Homework2;

import java.util.Scanner;

public class Home2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lūdzu ievadi x koordināti : ");
        int x = sc.nextInt();
        System.out.println("Lūdzu ievadi y koordināti : ");
        int y = sc.nextInt();
        sc.close();
        if (x > -2 && x < 3 && y > -4 && y < 1) {
            System.out.println("you are in target");
        } else if (x >= -2 && x <= 3 && y >= -4 && y <= 1) {
            System.out.println("right on edge");
        } else {
            System.out.println("out of bounds");
        }

    }

}
