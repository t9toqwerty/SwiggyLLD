package me.rahulkjha.entities;

import java.util.List;

public class DeliveryPerson implements Person{
    private String name;

    private List<Order> orders;

    public DeliveryPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
