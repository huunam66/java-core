package DTO;

public class DELUXE_BURGER extends BURGER {

    private ITEM extra4;
    private ITEM extra5;


    public DELUXE_BURGER(String name, String size) {
        super(name, size);
    }

    @Override
    public void addToppings(ITEM extra) {
        ITEM extra1 = super.getExtra1();
        ITEM extra2 = super.getExtra2();
        ITEM extra3 = super.getExtra3();
        if (extra1 != null && extra2 != null && extra3 != null && extra4 != null && extra5 != null) {
            System.out.println("\nAre full toppings !");
            return;
        }

        if (extra1 == null) {
            super.setExtra1(extra);
            return;
        }
        if (extra2 == null) {
            super.setExtra2(extra);
            return;
        }
        if (extra3 == null) {
            super.setExtra3(extra);
            return;
        }
        if (extra4 == null) {
            extra4 = extra;
            return;
        }

        extra5 = extra;
    }


    @Override
    public void printToppings() {
        ITEM extra1 = super.getExtra1();
        ITEM extra2 = super.getExtra2();
        ITEM extra3 = super.getExtra3();
        if (extra1 == null && extra2 == null && extra3 == null && extra4 == null && extra5 == null) return;
        System.out.println("\n" + "-".repeat(60));
        System.out.println("TOPPINGS:");
        if (extra1 != null) extra1.printItem();
        if (extra2 != null) extra2.printItem();
        if (extra3 != null) extra3.printItem();
        if (extra4 != null) extra4.printItem();
        if (extra5 != null) extra5.printItem();
    }

    @Override
    public String getName() {
        return super.getName() + " " + this.getClass().getSimpleName().split("_")[0];
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice() + (extra4 != null ? extra4.getAdjustPrice() : 0) + (extra5 != null ? extra5.getAdjustPrice() : 0);
    }

}
