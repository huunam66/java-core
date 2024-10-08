package com.set_and_map.StockMap;

public class StockItem implements Comparable<StockItem> {
    private String name;
    private double price;

    private int quantity;

    public StockItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int adjustQuantity(int quantity) {
        this.quantity += quantity;
        return this.quantity;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || (obj.getClass() != this.getClass())) return false;

        String name = ((StockItem) obj).getName();
        return this.name.equalsIgnoreCase(name);
    }

    @Override
    public int compareTo(StockItem o) {
        if (this == o) return 0;

        if (o == null || (this.getClass() != o.getClass())) return -1;

        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return String.format("%5s %s: price is (%.2f$). ", "\u2022", this.name, this.price);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
