package com.rcs.Homework3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lūdzu ievadiet vārdu un uzvārdu : ");
        String fullName = sc.nextLine();
        sc.close();
        /*versija 1 strādā ar vairākiem uzvārdiem, bet nestrādā ar vairākām atstarpēm*/
/*        String[] splitString = fullName.split(" ");
        String firstLetter = splitString[0].substring(0, 1);
        String remainingLetters = splitString[0].substring(1, splitString[0].length());
        firstLetter = firstLetter.toUpperCase();
        splitString[0] = firstLetter + remainingLetters;
        System.out.println("jusu ievaditais vards : " + fullName);
        System.out.println("jusu vards : " + "'" + splitString[0] + "'");
        System.out.println("jusu uzvards : " + "'" + splitString[1].toUpperCase() + "'");
        System.out.println("jusu otrais uzvards : " + "'" + splitString[2].toUpperCase() + "'");*/

        /*versija 2 strādā ar vairākām atstarpēm, bet nestrādā ar vairākiem uzvārdiem*/
        fullName = fullName.trim();
        String name = fullName.substring(0, fullName.indexOf(" "));
        String surname = fullName.substring(fullName.indexOf(" "));
        System.out.println("ievadītais vārds : " + fullName);
        System.out.println("jusu vards : " + "'" + name.substring(0, 1).toUpperCase() + name.substring(1) + "'");
        System.out.println("jusu uzvards : " + "'" + surname.trim().toUpperCase() + "'");
    }
}
