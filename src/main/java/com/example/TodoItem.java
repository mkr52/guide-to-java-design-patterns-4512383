package com.example;

public class TodoItem implements Completeable {

    private final String description;
    private boolean completed = false;

    public TodoItem(String description) {
        this.description = description;
    }

    public void complete() {
        completed = true;
    }

    @Override
    public void isCompleted() {
        System.out.println("Todo item \'" + description + "\' is completed: " + 
        completed);
    }

}
