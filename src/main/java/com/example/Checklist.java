package com.example;

import java.util.ArrayList;
import java.util.List;

public class Checklist implements Completeable {

    List<TodoItem> todoItems = new ArrayList<>();

    public void addTodoItem(TodoItem todoItem) {
        todoItems.add(todoItem);
    }

    @Override
    public void isCompleted() {
        todoItems.forEach(TodoItem::isCompleted);
    }

}
