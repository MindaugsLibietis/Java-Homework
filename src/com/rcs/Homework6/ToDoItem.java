package com.rcs.Homework6;

public class ToDoItem {
    private String description;
    private Priority priority;
    private boolean completed;

    public ToDoItem(String description, Priority priority, boolean completed) {
        this.description = description;
        this.priority = priority;
        this.completed = completed;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return this.priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void markCompletion(boolean completed) {
        this.completed = completed;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    @Override
    public String toString() {
        return String.format("Description: %s, Priority: %s, Completed: %s", this.description, this.priority, this.completed);
    }
}
