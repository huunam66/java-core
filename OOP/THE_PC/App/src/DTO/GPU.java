package DTO;

public class GPU extends Product {

    private String gpuName;
    private float shareMemory;


    public GPU() {
        this(null, 0);
    }

    public GPU(String gpuName, float shareMemory) {
        this(gpuName, shareMemory, null, null, 0);
    }

    public GPU(String gpuName, float shareMemory, String model, String brand, double price) {
        this(gpuName, shareMemory, model, brand, price, 0, 0, 0);
    }

    public GPU(String gpuName, float shareMemory, String model, String brand, double price, float width, float height, float depth) {
        super(model, brand, price, width, height, depth);
        this.gpuName = gpuName;
        this.shareMemory = shareMemory;
    }

    @Override
    public void show() {
        System.out.println("============ GPU ============");
        super.show();
        System.out.println("GPU Name: " + gpuName);
        System.out.println("Share Memory: " + shareMemory);
    }

    public String getGpuName() {
        return gpuName;
    }

    public void setGpuName(String gpuName) {
        this.gpuName = gpuName;
    }

    public float getShareMemory() {
        return shareMemory;
    }

    public void setShareMemory(float shareMemory) {
        this.shareMemory = shareMemory;
    }

    @Override
    public String toString() {
        return "GPU{" + "gpuName='" + gpuName + '\'' + ", shareMemory=" + shareMemory + "} " + super.toString();
    }
}
