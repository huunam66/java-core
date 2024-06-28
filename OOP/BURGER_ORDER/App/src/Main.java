import DTO.ITEM;
import DTO.MEAL_ORDER;

public class Main {
    public static void main(String[] args) {
//        BURGER burger = new BURGER("Burger maison", "LARGE");
//        burger.addToppings("Feta Sauce", "LARGE", 1.8);
//        burger.addToppings("Onion Rings", "MEDIUM", 1.6);
        ITEM drink = new ITEM("Coca Cola", "MEDIUM", 1);
        ITEM side = new ITEM("French fries", "LARGE", 1.5);
        MEAL_ORDER MEALORDER = new MEAL_ORDER("Maison", "LARGE", "DELUXE", drink, side);
        MEALORDER.printer();
    }
}