package DTO;

import java.util.Scanner;

public class RAM extends Product {

    private String capacity;
    private int bus;

    public RAM() {
        this(null, 0);
    }

    public RAM(String capacity, int bus) {
        this(capacity, bus, null, null, 0);
    }

    public RAM(String capacity, int bus, String model, String brand, double price) {
        this(capacity, bus, model, brand, price, 0, 0, 0);
    }

    public RAM(String capacity, int bus, String model, String brand, double price, float width, float height, float depth) {
        super(model, brand, price, width, height, depth);
        this.capacity = capacity;
        this.bus = bus;
    }

    @Override
    public void show() {
        System.out.println("============ RAM ============");
        super.show();
        System.out.println("Capacity: " + capacity + " GB");
        System.out.println("Bus: " + bus + " Mhz");
    }

    @Override
    public void Input() {
        super.Input();
        System.out.println("-------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input capacity: ");
        capacity = scanner.nextLine();
        System.out.println("Input bus: ");
        bus = scanner.nextInt();
    }


    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public int getBus() {
        return bus;
    }

    public void setBus(int bus) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "RAM{" + "capacity='" + capacity + '\'' + ", bus=" + bus + "} " + super.toString();
    }
}
