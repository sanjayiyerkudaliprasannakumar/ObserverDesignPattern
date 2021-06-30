package com.java.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class SubjectDemo implements Subject{
    private List<Observer> observerList = null;
    private String message;

    private SubjectDemo(){
        observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {

    }

    @Override
    public void unregister(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }

    @Override
    public Object getUpdate() {
        return null;
    }

    @Override
    public void postMessage(String message) {

    }
}
