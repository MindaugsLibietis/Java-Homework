package com.rcs.Homework1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x, y, c, z, v;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Farenheits:");
        x = sc.nextDouble();
        y = (5 * (x - 32)) / 9;
        double rounded = Math.round(y * 100) / 100.0;
        System.out.println("Temperature in celsius = " + y);
        System.out.println("Temperature in celsius rounded = " + rounded);
        System.out.println("Would you wish to convert c to f? y or n :");
        z = sc.next().charAt(0);
        if (z == 'y') {
            System.out.println("Enter temperature in celsius: ");
            c = sc.nextDouble();
            sc.close();
            v = (c * 9 / 5 + 32);
            System.out.println("Temperature in farenheit = " + v);
            System.out.printf("Temperature in farenheit rounded = %.2f" + "\n", v);
        } else if (z == 'n') {
            System.out.println("End of this programm");
        } else {
            System.out.println("bad operator");
        }
    }

}

