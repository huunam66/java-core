package DTO;

import java.util.Arrays;
import java.util.Random;

public class Monitor extends Product {
    private String pixelDensity;
    private String screenTechnology;
    private String[][] screen;

    public Monitor() {
        this(null, null);
    }

    public Monitor(String pixelDensity, String screenTechnology) {
        this(pixelDensity, screenTechnology, null, null, 0);
    }

    public Monitor(String pixelDensity, String screenTechnology, String model, String brand, double price) {
        this(pixelDensity, screenTechnology, model, brand, price, 0, 0, 0);
    }

    public Monitor(String pixelDensity, String screenTechnology, String model, String brand, double price, float width, float height, float depth) {
        super(model, brand, price, width, height, depth);
        this.pixelDensity = pixelDensity;
        this.screenTechnology = screenTechnology;
        setColorPixel();
    }

    private void setColorPixel() {
        String[] color = new String[]{"Red", "Green", "Blue", "Pink", "Cyan", "Magenta", "Yellow", "Mint", "Purple", "Orange"};
        int[] pixelDensity_SplitX = Arrays.stream(pixelDensity.split("x")).mapToInt(item -> Integer.parseInt(item.trim())).toArray();
        int sizeX = pixelDensity_SplitX[0];
        int sizeY = pixelDensity_SplitX[1];
        this.screen = new String[sizeX][sizeY];
        Random randomInt = new Random();
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                int colorIndex = randomInt.nextInt(color.length);
                this.screen[i][j] = color[colorIndex];
            }
        }
    }

    public void showScreen() {
        int[] pixelDensity_SplitX = Arrays.stream(pixelDensity.split("x")).mapToInt(item -> Integer.parseInt(item.trim())).toArray();
        int sizeX = pixelDensity_SplitX[0];
        int sizeY = pixelDensity_SplitX[1];
        for (int i = 0; i < sizeX; i++) {
            System.out.println();
            System.out.print("|");
            for (int j = 0; j < sizeY; j++) {
                System.out.printf("%10s |", screen[i][j].toUpperCase());
            }
        }
    }

    @Override
    public void show() {
        System.out.println("============ MONITOR ============");
        super.show();
        System.out.println("Pixel Density: " + pixelDensity);
        System.out.println("Screen Technology: " + screenTechnology);
        showScreen();
    }

    public String[][] getScreen() {
        return screen;
    }

    public void setScreen(String[][] screen) {
        this.screen = screen;
    }

    public String getPixelDensity() {
        return pixelDensity;
    }

    public void setPixelDensity(String pixelDensity) {
        this.pixelDensity = pixelDensity;
    }

    public String getScreenTechnology() {
        return screenTechnology;
    }

    public void setScreenTechnology(String screenTechnology) {
        this.screenTechnology = screenTechnology;
    }

    @Override
    public String toString() {
        return "Monitor{" + "pixelDensity='" + pixelDensity + '\'' + ", screenTechnology='" + screenTechnology + '\'' + ", screen=" + Arrays.toString(screen) + "} " + super.toString();
    }
}
