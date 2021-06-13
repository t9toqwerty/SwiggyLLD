package me.rahulkjha.handlers;

import me.rahulkjha.entities.Observer;
import me.rahulkjha.entities.Subject;

public class OrderPlaceObserver implements Observer {

    @Override
    public Boolean update(Subject subject) {
        //Assign Nearest Delivery Person
        System.out.println("Assign Nearest Delivery Person");
        return true;
    }
}
