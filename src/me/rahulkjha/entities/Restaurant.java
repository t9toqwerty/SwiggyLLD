package me.rahulkjha.entities;

import java.util.List;

public class Restaurant {
    private String name;

    private List<Dish> dishes;

    private List<Order> orders;

    public Restaurant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Order addNewOrder(Customer customer, List<Dish> dishes){
        return new Order().setCustomer(customer).setDishes(dishes).place();
    }
}
