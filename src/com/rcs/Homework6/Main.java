package com.rcs.Homework6;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoItems list = new ToDoItems();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please name your To-Do list: ");
        String toDoName = sc.nextLine();
        while (true) {
            System.out.println("What do you wish to do? ");
            System.out.println("1. Add To-Do Items");
            System.out.println("2. Mark Task as completed");
            System.out.println("3. Display all To-Do Items");
            System.out.println("4. Display uncompleted To-Do Items");
            System.out.println("5. Display completed To-Do Items");
            int toDo = sc.nextInt();
            sc.nextLine();
            int counter = 1;
            switch (toDo) {
                case 1:
                    while (true) {
                            System.out.printf("Adding item #%d to list '%s'\n", counter, toDoName);
                            System.out.println("Enter description: ");
                            String descritption = sc.nextLine();
                            System.out.println("Enter priority: ");
                            Priority priority = Priority.valueOf(sc.nextLine().toUpperCase());
                            ToDoItem item = new ToDoItem(descritption, priority);
                            item.setDescription(descritption);
                            item.setPriority(priority);
                            list.addItem(item);
                            System.out.println("Press enter to continue or 'q' to stop adding items...");
                            String action = sc.nextLine();
                            if (action.equalsIgnoreCase("Q")) {
                                break;
                            }
                            counter++;
                        }
                    break;
                case 2:
                    while (true) {
                        System.out.println("Enter To-Do item number: ");
                        int itemNumber = sc.nextInt();
                        System.out.println("Enter true if task is completed - false if not: ");
                        boolean taskCompleted = sc.nextBoolean();
                        list.markCompletion(itemNumber, taskCompleted);
                        sc.nextLine();
                        System.out.println("Press enter to continue or 'q' to stop adding items...");
                        String action = sc.nextLine();
                        if (action.equalsIgnoreCase("Q")) {
                            break;
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        list.displayItems();
                        System.out.println("Press enter to continue or 'q' to stop adding items...");
                        String action = sc.nextLine();
                        if (action.equalsIgnoreCase("Q")) {
                            break;
                        }
                    }
                    break;
                case 4:
                    while (true) {
                        list.displayUncompletedItems();
                        System.out.println("Press enter to continue or 'q' to stop adding items...");
                        String action = sc.nextLine();
                        if (action.equalsIgnoreCase("Q")) {
                            break;
                        }
                    }
                    break;
                case 5:
                    while (true) {
                        list.displayCompletedItems();
                        System.out.println("Press enter to continue or 'q' to stop adding items...");
                        String action = sc.nextLine();
                        if (action.equalsIgnoreCase("Q")) {
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Nothing was chosen");
                    break;
            }
        }
    }
}
