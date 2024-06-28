package DTO;

import java.util.Scanner;

public class Product {
    private String model;
    private String brand;
    private double price;
    private float width;
    private float height;
    private float depth;

    public Product() {
        this(null, null, 0);
    }

    public Product(String model, String brand, double price) {
        this(model, brand, 0, 0, 0, 0);
    }

    public Product(String model, String brand, double price, float width, float height, float depth) {
        this.model = model;
        this.brand = brand;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Model: ");
        model = scanner.nextLine();
        System.out.println("Input brand: ");
        brand = scanner.nextLine();
        System.out.println("Input price: ");
        price = scanner.nextDouble();
        System.out.println("Input width: ");
        width = scanner.nextFloat();
        System.out.println("Input height: ");
        height = scanner.nextFloat();
        System.out.println("Input depth: ");
        depth = scanner.nextFloat();
    }

    public void show() {
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Price: VND " + price);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Depth: " + depth);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }
}
