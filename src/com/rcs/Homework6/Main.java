package com.rcs.Homework6;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoItems list = new ToDoItems();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please name your To-Do list: ");
        String toDoName = sc.nextLine();
        list.setTitle(toDoName);
        while (true) {
            System.out.println("What do you wish to do? ");
            System.out.println("1. Add To-Do Items");
            System.out.println("2. Mark Task as completed");
            System.out.println("3. Display all To-Do Items");
            System.out.println("4. Display uncompleted To-Do Items");
            System.out.println("5. Display completed To-Do Items");
            int counter = 1;
            String toDo = sc.nextLine();
            if (toDo.toUpperCase().equals("Q")) {
                break;
            }
            switch (toDo) {
                case "1":
                    while (true) {
                            System.out.printf("Adding item #%d to list '%s'\n", counter, list.getTitle());
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
                case "2":
                    while (true) {
                        System.out.println("Enter To-Do item number: ");
                        int itemNumber = sc.nextInt();
                        System.out.println("Enter true if task is completed - false if not: ");
                        boolean taskCompleted = sc.nextBoolean();
                        list.markCompletion(itemNumber, taskCompleted);
                        sc.nextLine();
                        System.out.println("Press enter to continue or 'q' to stop marking items...");
                        String action = sc.nextLine();
                        if (action.equalsIgnoreCase("Q")) {
                            break;
                        }
                    }
                    break;
                case "3":
                        list.displayItems();
                    break;
                case "4":
                        list.displayUncompletedItems();
                    break;
                case "5":
                        list.displayCompletedItems();
                    break;
                default:
                    System.out.println("Nothing was chosen");
                    break;
            }
        }
    }
}
