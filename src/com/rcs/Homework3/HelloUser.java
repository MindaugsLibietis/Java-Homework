package com.rcs.Homework3;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Lūdzu ievadiet vārdu un uzvārdu : ");
        String fullName = sc.nextLine();
        String[] splitString = fullName.split(" ");
        String firstLetter = splitString[0].substring(0 ,1);
        String remainingLetters = splitString[0].substring(1, splitString[0].length());
        firstLetter = firstLetter.toUpperCase();
        splitString[0] = firstLetter + remainingLetters;
        System.out.println("'" + splitString[0] + "'");
        System.out.println("'" + splitString[1].toUpperCase() + "'");
    }
}
