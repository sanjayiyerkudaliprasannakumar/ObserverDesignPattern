package com.java.observerDesignPattern;

public interface Subject {
    //register an observer to a subject
    void register(Observer observer);

    //unregister an observer from a subject
    void unregister(Observer observer);

    //notify all observers for the change in subject's state
    void notifyObservers();

    //method to get update from the subject by the observer
    Object getUpdate();

    //post message to observers
    void postMessage(String message);
}
