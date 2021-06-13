package me.rahulkjha.entities;

import me.rahulkjha.handlers.OrderPlaceObserver;

import java.util.ArrayList;
import java.util.List;

public class Order implements Subject{
    private Restaurant restaurant;

    private Customer customer;

    private DeliveryPerson deliveryPerson;

    private List<Dish> dishes;

    private List<Observer> observers;

    public Order() {
        this.observers = new ArrayList<Observer>();
        this.registerObserver(new OrderPlaceObserver());
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Order setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public Order setDishes(List<Dish> dishes) {
        this.dishes = dishes;
        return this;
    }

    public DeliveryPerson getDeliveryPerson() {
        return deliveryPerson;
    }

    public void setDeliveryPerson(DeliveryPerson deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            ob.update(this);
        }
    }

    public Order place(){
        this.notifyObservers();
        return this;
    }
}
