package com.rcs.Homework1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x, y, c, v;
        char z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Farenheits:");
        x = sc.nextDouble();
        y = (5 * ( x - 32 ) ) / 9;
        double rounded = Math.round (y * 100)/100.0;
        System.out.println("Temperature in celsius = " + y);
        System.out.println("Temperature in celsius rounded = " + rounded);
        //System.out.printf("Temperature in celsius rounded = %.2f" + "\n", y);
        }

    }
}
