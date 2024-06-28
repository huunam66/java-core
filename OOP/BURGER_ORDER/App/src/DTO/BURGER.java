package DTO;

public class BURGER extends ITEM {

    private static final String BURGER = "BURGER";
    private static final String TOPPING = "TOPPING";
    private static final double PriceDefault = 5.0;

    private ITEM extra1;
    private ITEM extra2;
    private ITEM extra3;


    public BURGER(String name, String size) {
        this(null, null, null, name, BURGER, size, PriceDefault);
    }

    public BURGER(ITEM extra1, String name, String size) {
        this(extra1, null, null, name, BURGER, size, PriceDefault);
    }

    public BURGER(ITEM extra1, String name, String size, double price) {
        this(extra1, null, null, name, BURGER, size, price);
    }

    public BURGER(ITEM extra1, ITEM extra2, String name, String size) {
        this(extra1, extra2, null, name, BURGER, size, PriceDefault);
    }

    public BURGER(ITEM extra1, ITEM extra2, String name, String size, double price) {
        this(extra1, extra2, null, name, BURGER, size, price);
    }

    public BURGER(ITEM extra1, ITEM extra2, ITEM extra3, String name, String size) {
        this(extra1, extra2, extra3, name, BURGER, size, PriceDefault);
    }

    public BURGER(ITEM extra1, ITEM extra2, ITEM extra3, String name, String type, String size, double price) {
        super(name, type, size, price);
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
    }

    public void addToppings(String name, String size, double price) {
        ITEM extra = new ITEM(name, TOPPING, size, price);
        addToppings(extra);
    }

    public void addToppings(ITEM extra) {
        if (extra1 != null && extra2 != null && extra3 != null) {
            System.out.println("\nAre full toppings !");
            return;
        }

        if (extra1 == null) {
            extra1 = extra;
            return;
        }
        if (extra2 == null) {
            extra2 = extra;
            return;
        }

        extra3 = extra;
    }

    public double getTotalPrice() {
        return super.getAdjustPrice() + (extra1 != null ? extra1.getAdjustPrice() : 0) + (extra2 != null ? extra2.getAdjustPrice() : 0) + (extra3 != null ? extra3.getAdjustPrice() : 0);
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    @Override
    public void printItem() {
        super.printItem();
        printToppings();
    }

    public void printToppings() {
        if (extra1 == null && extra2 == null && extra3 == null) return;
        System.out.println("\n" + "-".repeat(60));
        System.out.println("TOPPINGS:");
        if (extra1 != null) extra1.printItem();
        if (extra2 != null) extra2.printItem();
        if (extra3 != null) extra3.printItem();
    }

    public ITEM getExtra1() {
        return extra1;
    }

    public void setExtra1(ITEM extra1) {
        this.extra1 = extra1;
    }

    public ITEM getExtra2() {
        return extra2;
    }

    public void setExtra2(ITEM extra2) {
        this.extra2 = extra2;
    }

    public ITEM getExtra3() {
        return extra3;
    }

    public void setExtra3(ITEM extra3) {
        this.extra3 = extra3;
    }
}
