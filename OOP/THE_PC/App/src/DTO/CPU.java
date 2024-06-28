package DTO;

public class CPU extends Product {
    private String chipName;
    private float baseSpeed;
    private int cores;
    private int logicalProcessors;

    public CPU() {
        this(null, 0, 0, 0);
    }

    public CPU(String chipName, float baseSpeed, int cores, int logicalProcessors) {
        this(chipName, baseSpeed, cores, logicalProcessors, null, null, 0);
    }

    public CPU(String chipName, float baseSpeed, int cores, int logicalProcessors, String model, String brand, double price) {
        this(chipName, baseSpeed, cores, logicalProcessors, model, brand, price, 0, 0, 0);
    }

    public CPU(String chipName, float baseSpeed, int cores, int logicalProcessors, String model, String brand, double price, float width, float height, float depth) {
        super(model, brand, price, width, height, depth);
        this.chipName = chipName;
        this.baseSpeed = baseSpeed;
        this.cores = cores;
        this.logicalProcessors = logicalProcessors;
    }

    @Override
    public void show() {
        System.out.println("============ CPU ============");
        super.show();
        System.out.println("Chip Name: " + chipName);
        System.out.println("Base Speed: " + baseSpeed);
        System.out.println("Cores: " + cores);
        System.out.println("Logical Processors: " + logicalProcessors);
    }

    public String getChipName() {
        return chipName;
    }

    public void setChipName(String chipName) {
        this.chipName = chipName;
    }

    public float getBaseSpeed() {
        return baseSpeed;
    }

    public void setBaseSpeed(float baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getLogicalProcessors() {
        return logicalProcessors;
    }

    public void setLogicalProcessors(int logicalProcessors) {
        this.logicalProcessors = logicalProcessors;
    }
}
