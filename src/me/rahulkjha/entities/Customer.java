package me.rahulkjha.entities;

import java.util.List;

public class Customer implements Person{
    private String name;

    private String address;

    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Order placeNewOrder(Restaurant restaurant, List<Dish> dishes){
        return restaurant.addNewOrder(this, dishes);
    }
}
