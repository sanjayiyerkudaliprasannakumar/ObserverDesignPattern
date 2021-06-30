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
    public
    void register ( Observer observer ) {
        if ( observer == null ) {
            throw new NullPointerException ( );
        }
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
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
