package DTO;

import java.util.Scanner;

public class SSD extends Product {

    private String ssdName;
    private String capacity;

    public SSD() {
        this(null, null);
    }

    public SSD(String ssdName, String capacity) {
        this(ssdName, capacity, null, null, 0);
    }

    public SSD(String ssdName, String capacity, String model, String brand, double price) {
        this(ssdName, capacity, model, brand, price, 0, 0, 0);
    }

    public SSD(String ssdName, String capacity, String model, String brand, double price, float width, float height, float depth) {
        super(model, brand, price, width, height, depth);
        this.ssdName = ssdName;
        this.capacity = capacity;
    }

    @Override
    public void show() {
        System.out.println("============ SSD ============");
        super.show();
        System.out.println("SSD Name: " + ssdName);
        System.out.println("Capacity: " + capacity + " GB");
    }

    @Override
    public void Input() {
        super.Input();
        System.out.println("-------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input SSD Name: ");
        ssdName = scanner.nextLine();
        System.out.println("Input capacity: ");
        capacity = scanner.nextLine();
    }

    public String getSsdName() {
        return ssdName;
    }

    public void setSsdName(String ssdName) {
        this.ssdName = ssdName;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "SSD{" + "ssdName='" + ssdName + '\'' + ", capacity='" + capacity + '\'' + "} " + super.toString();
    }
}
