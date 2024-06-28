package DTO;

public class ITEM {

    private static final String LARGE = "LARGE";
    private static final String SMALL = "SMALL";

    private String name;
    private String type;
    private String size;
    private double price;

    public ITEM(String name, String size, double price) {
        this(name, "", size, price);
    }

    public ITEM(String name, String type, String size, double price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
        this.size = size.toUpperCase();
    }

    public double getAdjustPrice() {
        return switch (size) {
            case SMALL -> price - (price * 0.5);
            case LARGE -> price + (price * 0.8);
            default -> price;
        };
    }

    public void printItem() {
        System.out.printf("\n%30s\t%-10s\t$%-10.2f", getName(), getSize(), getAdjustPrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
