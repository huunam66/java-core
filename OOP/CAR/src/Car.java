public class Car {

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 4;
    private boolean convertible = true;

    public void describeCar() {
        System.out.println("Make: " + make + ", Model: " + model + ", Color: " + color + ", Doors: " + doors + (convertible ? ". Convertible !" : "."));
    }


}
