package DTO;

public class KeyBoard extends Product {

    private String color;
    private boolean mechanicalKeyboard;

    public KeyBoard() {
        this(null, false);
    }

    public KeyBoard(String color, boolean mechanicalKeyboard) {
        this(color, mechanicalKeyboard, null, null, 0);
    }

    public KeyBoard(String color, boolean mechanicalKeyboard, String model, String brand, double price) {
        this(color, mechanicalKeyboard, model, brand, price, 0, 0, 0);
    }

    public KeyBoard(String color, boolean mechanicalKeyboard, String model, String brand, double price, float width, float height, float depth) {
        super(model, brand, price, width, height, depth);
        this.color = color;
        this.mechanicalKeyboard = mechanicalKeyboard;
    }

    @Override
    public void show() {
        System.out.println("============ KEY BOARD ============");
        super.show();
        System.out.println("Color: " + color);
        System.out.println("Mechanical Keyboard: " + mechanicalKeyboard);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMechanicalKeyboard() {
        return mechanicalKeyboard;
    }

    public void setMechanicalKeyboard(boolean mechanicalKeyboard) {
        this.mechanicalKeyboard = mechanicalKeyboard;
    }

    @Override
    public String toString() {
        return "KeyBoard{" + "color='" + color + '\'' + ", mechanicalKeyboard=" + mechanicalKeyboard + "} " + super.toString();
    }
}
