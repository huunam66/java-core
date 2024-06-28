package DTO;

public class ComputerCase extends Product {

    private String type;
    private String color;

    private MotherBoard motherBoard;

    public ComputerCase() {
        this(null, null, null);
    }

    public ComputerCase(String type, String color, MotherBoard motherBoard) {
        this(type, color, motherBoard, null, null, 0);
    }

    public ComputerCase(String type, String color, MotherBoard motherBoard, String model, String brand, double price) {
        this(type, color, motherBoard, model, brand, price, 0, 0, 0);
    }

    public ComputerCase(String type, String color, MotherBoard motherBoard, String model, String brand, double price, float width, float height, float depth) {
        super(model, brand, price, width, height, depth);
        this.motherBoard = motherBoard;
        this.type = type;
        this.color = color;
    }


    @Override
    public void show() {
        System.out.println("============ COMPUTER CASE ============");
        super.show();
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        motherBoard.show();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    @Override
    public String toString() {
        return "ComputerCase{" + "type='" + type + '\'' + ", color='" + color + '\'' + ", motherBoard=" + motherBoard + "} " + super.toString();
    }
}
