package DTO;

public class MEAL_ORDER {

    private static final String SIDE = "SIDE";
    private static final String DRINK = "DRINK";
    private static final String NORMAL = "NORMAL";
    private static final String DELUXE = "DELUXE";
    private String burgerType;
    private ITEM drink;
    private ITEM side;
    private BURGER burger;


    public MEAL_ORDER(String burgerName, String burgerSize, String burgerType, ITEM drink, ITEM side) {
        this.burgerType = burgerType;
        this.drink = drink;
        this.side = side;
        if (burgerType.toUpperCase().equals(NORMAL)) {
            burger = new BURGER(burgerName, burgerSize);
            burger.addToppings("Feta Sauce", "LARGE", 1.8);
            burger.addToppings("Onion Rings", "MEDIUM", 1.6);
        }
        if (burgerType.toUpperCase().equals(DELUXE)) {
            burger = new DELUXE_BURGER(burgerName, burgerSize);
            burger.addToppings("Feta Sauce", "LARGE", 1.8);
            burger.addToppings("Onion Rings", "MEDIUM", 1.6);
            burger.addToppings("Feta Sauce 1", "LARGE", 1.8);
            burger.addToppings("Onion Rings 2", "MEDIUM", 1.6);
            burger.addToppings("Onion Rings 3", "MEDIUM", 1.6);
        }
    }


    public MEAL_ORDER(DELUXE_BURGER deluxeBurger) {
        this(deluxeBurger, DELUXE, null, null);
    }

    public MEAL_ORDER(BURGER burger) {
        this(burger, NORMAL, null, null);
    }

    public MEAL_ORDER(BURGER burger, String burgerType, ITEM drink, ITEM side) {
        this.burgerType = burgerType;
        if (burgerType.toUpperCase().equals(DELUXE_BURGER.class.getSimpleName().toUpperCase()) && !(burger instanceof DELUXE_BURGER)) {
            this.burgerType = NORMAL;
        }
        if (burgerType.toUpperCase().equals(BURGER.class.getSimpleName().toUpperCase()) && burger instanceof DELUXE_BURGER) {
            this.burgerType = DELUXE;
        }
        if (drink != null) drink.setType(DRINK);
        if (side != null) side.setType(SIDE);
        this.drink = drink;
        this.side = side;
        this.burger = burger;
    }

    public void printer() {
        if (burger == null) {
            System.out.println("BURGER NOT FOUND !");
            return;
        }
        System.out.println();
        System.out.printf("\n%30s\t%-10s\t%-10s\n", "NAME:", "SIZE:", "PRICE:");
        burger.printItem();
        System.out.println("\n" + "-".repeat(60));
        if (drink != null) drink.printItem();
        if (side != null) side.printItem();
        System.out.println("\n" + "-".repeat(60));
        TotalBill();
    }

    public void TotalBill() {
        System.out.printf("%-30s\t\t$%-10.2f", "TOTAL:", getTotalBill());
    }

    public double getTotalBill() {
        return (burger != null ? burger.getTotalPrice() : 0) + (drink != null ? drink.getAdjustPrice() : 0) + (side != null ? side.getAdjustPrice() : 0);
    }


    public ITEM getDrink() {
        return drink;
    }

    public void setDrink(ITEM drink) {
        this.drink = drink;
    }

    public ITEM getSide() {
        return side;
    }

    public void setSide(ITEM side) {
        this.side = side;
    }

    public BURGER getBurger() {
        return burger;
    }

    public void setBurger(BURGER burger) {
        this.burger = burger;
    }
}
