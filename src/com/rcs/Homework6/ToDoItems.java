package com.rcs.Homework6;

import java.util.ArrayList;
import java.util.List;

public class ToDoItems {
    private String title;
    private List<ToDoItem> toDoItems = new ArrayList<>();

    public ToDoItems(String title, List<ToDoItem> toDoItems) {
        this.title = title;
        this.toDoItems = toDoItems;
    }

    public void addItem(ToDoItem item) {
        toDoItems.add(item);
    }

    public void displayItems() {
        for (ToDoItem item : toDoItems) {
            System.out.println(item.toString());
        }
    }

    public void displayCompletedItems() {

        List<ToDoItem> completedList = new ArrayList<ToDoItem>();

        for (ToDoItem item : toDoItems) {
            if (item.isCompleted()) {
                completedList.add(item);
            }
        }
        System.out.println(completedList);
    }

    public void displayUncompletedItems() {

        List<ToDoItem> uncompletedList = new ArrayList<ToDoItem>();

        for (ToDoItem item : toDoItems) {
            if (!item.isCompleted()) {
                uncompletedList.add(item);
            }
        }
        System.out.println(uncompletedList);
    }

    public void markCompletion(int toDoItemNum,boolean bool) {
        this.toDoItems.get(toDoItemNum-1).markCompletion(bool);
    }
}
