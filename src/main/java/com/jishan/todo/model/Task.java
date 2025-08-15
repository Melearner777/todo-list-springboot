package com.jishan.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private boolean done;

    public Task() {
    }
    public Task(String title) {
        this.title = title;
        this.done = false;
    }
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public boolean isDone() {
        return done;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDone(boolean done) {
        this.done = done;
    }
}
