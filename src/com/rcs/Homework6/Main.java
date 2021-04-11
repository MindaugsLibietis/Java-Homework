package com.rcs.Homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please name your To-Do list: ");
        String toDoName = sc.nextLine();
        System.out.println("What do you wish to do? ");
        System.out.println("1. Add To-Do Items");
        System.out.println("2. Mark Task as completed");
        System.out.println("3. Display all To-Do Items");
        System.out.println("4. Display uncompleted To-Do Items");
        System.out.println("5. Display completed To-Do Items");
        int toDo = sc.nextInt();
        switch (toDo) {
            case 1:
                System.out.println("Enter title: ");
                String title = sc.nextLine();
                System.out.println("Enter priority: ");
                String priority = sc.nextLine();
            case 2:
                System.out.println("Mark Task as completed");
            case 3:
                System.out.println("Display all To-Do Items");
            case 4:
                System.out.println("Display uncompleted To-Do Items");
            case 5:
                System.out.println("Display completed To-Do Items");
        }
    }
}
