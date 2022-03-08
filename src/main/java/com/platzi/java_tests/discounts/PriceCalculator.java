package com.platzi.java_tests.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<Double>();
    private List<Integer> discounts = new ArrayList<Integer>();

    public double getTotal() {
        double total = 0;

        for (double price : prices) {
            total += price;
        }
        for (double discount : discounts) {
            total *= (100 - discount) / 100;
        }

        return total;
    }

    public void addPrice(double price) {
        prices.add(price);
    }
    public void addDiscount(int discount) {
        discounts.add(discount);
    }

    public List<Double> getPrices() {
        return prices;
    }

    public void setPrices(List<Double> prices) {
        this.prices = prices;
    }

    public List<Integer> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<Integer> discounts) {
        this.discounts = discounts;
    }
}
