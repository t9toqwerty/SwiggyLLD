package me.rahulkjha;

import me.rahulkjha.entities.Customer;
import me.rahulkjha.entities.Dish;
import me.rahulkjha.entities.Restaurant;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Restaurant punjabiAffairs = new Restaurant("Punjabi Affairs");
        Dish vegBiryani = new Dish("Veg Biryani");
        Dish chickenBiryani = new Dish("Chicken Biryani");
        Dish muttonBiryani = new Dish("Mutton Biryani");
        ArrayList<Dish> dishes = new ArrayList<>();
        dishes.add(vegBiryani);
        dishes.add(chickenBiryani);
        dishes.add(muttonBiryani);
        punjabiAffairs.setDishes(dishes);
        Restaurant paradiseBiryani = new Restaurant("Paradise Biryani");
        Restaurant hiTechBawarchi = new Restaurant("HiTech Bawarchi");
        Restaurant greenBawarchi = new Restaurant("Green Bawarchi");

        Customer rahul = new Customer("Rahul");
        Customer vipul = new Customer("Vipul");
        ArrayList<Dish> orderDishes = new ArrayList<>();
        rahul.placeNewOrder(punjabiAffairs, orderDishes);
    }
}
