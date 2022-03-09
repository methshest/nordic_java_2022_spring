package com.company.shop;

import java.util.Objects;

public class ProductAtShop extends Product {
    private long id;
    private static long idCounter = 0;
    private double cost;
    private int count;

    public ProductAtShop(String name, double weight, ProductTypeEnum type, double cost, int count) {
        super(name, weight, type);
        this.id = ++idCounter;
        this.cost = cost;
        this.count = count;
    }

    public boolean compare(long id) {
        return this.id == id;
    }

    public double getCost() {
        return cost;
    }

    public int getCount() {
        return count;
    }

    public long getId() {
        return id;
    }

    public void buy() {
        if (this.count > 0) {
            this.count--;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductAtShop that = (ProductAtShop) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "\nProductAtShop{ " +
                super.toString() +
                ", id=" + id +
                ", cost=" + cost +
                ", count=" + count +
                " }";
    }
}
