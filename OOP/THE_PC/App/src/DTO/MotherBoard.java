package DTO;

import java.util.Arrays;

public class MotherBoard extends Product {
    private int ramSlot;
    private int ramBusDefault;
    private int ramUsed;
    private int ssdSlot;
    private int ssdUsed;
    private int fan;

    private CPU cpu;
    private GPU gpu;
    private SSD[] ssds;
    private RAM[] rams;

    public MotherBoard() {
        this(0, 0, 0, 0, 0, 0);
    }

    public MotherBoard(int ramSlot, int ramBusDefault, int ramUsed, int ssdSlot, int ssdUsed, int fan) {
        this(ramSlot, ramBusDefault, ramUsed, ssdSlot, ssdUsed, fan, null, null, null, null);
    }

    public MotherBoard(int ramSlot, int ramBusDefault, int ramUsed, int ssdSlot, int ssdUsed, int fan, CPU cpu, GPU gpu, SSD[] ssds, RAM[] rams) {
        this(ramSlot, ramBusDefault, ramUsed, ssdSlot, ssdUsed, fan, cpu, gpu, ssds, rams, null, null, 0);
    }

    public MotherBoard(int ramSlot, int ramBusDefault, int ramUsed, int ssdSlot, int ssdUsed, int fan, CPU cpu, GPU gpu, SSD[] ssds, RAM[] rams, String model, String brand, double price) {
        this(ramSlot, ramBusDefault, ramUsed, ssdSlot, ssdUsed, fan, cpu, gpu, ssds, rams, model, brand, price, 0, 0, 0);
    }

    public MotherBoard(int ramSlot, int ramBusDefault, int ramUsed, int ssdSlot, int ssdUsed, int fan, CPU cpu, GPU gpu, SSD[] ssds, RAM[] rams, String model, String brand, double price, float width, float height, float depth) {
        super(model, brand, price, width, height, depth);
        this.ramSlot = ramSlot;
        this.ramUsed = ramUsed;
        this.ssdUsed = ssdUsed;
        this.ramBusDefault = ramBusDefault;
        this.ssdSlot = ssdSlot;
        this.fan = fan;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ssds = ssds;
        this.rams = rams;
        setTotalPrice();
    }

    public MotherBoard(int ramSlot, int ramBusDefault, int ramUsed, int ssdSlot, int ssdUsed, int fan, CPU cpu, GPU gpu, String model, String brand, double price, float width, float height, float depth) {
        this(ramSlot, ramBusDefault, ramUsed, ssdSlot, ssdUsed, fan, cpu, gpu, null, null, model, brand, price, width, height, depth);
        Input_RAM();
        Input_SSD();
        setTotalPrice();
    }


    public void Input_RAM() {
        rams = new RAM[ramSlot];
        for (int i = 0; i < ramUsed; i++) {
            if (rams[i] != null) continue;

            rams[i] = new RAM();
            rams[i].Input();
        }
    }

    public void Input_SSD() {
        ssds = new SSD[ssdSlot];
        for (int i = 0; i < ssdUsed; i++) {
            if (ssds[i] != null) continue;

            ssds[i] = new SSD();
            ssds[i].Input();
        }
    }


    public void setTotalPrice() {
        double totalSSD_RAM_Price = 0;
        if (ssds != null) {
            for (int i = 0; i < ramUsed; i++) {
                totalSSD_RAM_Price += rams[i].getPrice();
            }
        }
        if (rams != null) {
            for (int i = 0; i < ssdUsed; i++) {
                totalSSD_RAM_Price += ssds[i].getPrice();
            }
        }
        super.setPrice(super.getPrice() + cpu.getPrice() + totalSSD_RAM_Price);
    }

    @Override
    public void show() {
        System.out.println("============ Mother Board ============");
        super.show();
        System.out.println("Ram Slot: " + ramSlot);
        System.out.println("Ram Bus Default: " + ramBusDefault + " Mhz");
        System.out.println("Ram Used: " + ramUsed);
        System.out.println("SSD Slot: " + ssdSlot);
        System.out.println("SSD Used: " + ssdUsed);
        System.out.println("FAN: " + fan);
        cpu.show();
        gpu.show();
        for (int i = 0; i < rams.length; i++) {
            rams[i].show();
        }
        for (int i = 0; i < ssds.length; i++) {
            ssds[i].show();
        }
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public void setRamSlot(int ramSlot) {
        this.ramSlot = ramSlot;
    }

    public int getRamBusDefault() {
        return ramBusDefault;
    }

    public void setRamBusDefault(int ramBusDefault) {
        this.ramBusDefault = ramBusDefault;
    }

    public int getSsdSlot() {
        return ssdSlot;
    }

    public void setSsdSlot(int ssdSlot) {
        this.ssdSlot = ssdSlot;
    }

    public int getFan() {
        return fan;
    }

    public void setFan(int fan) {
        this.fan = fan;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public SSD[] getSsds() {
        return ssds;
    }

    public void setSsds(SSD[] ssds) {
        this.ssds = ssds;
    }

    public RAM[] getRams() {
        return rams;
    }

    public void setRams(RAM[] rams) {
        this.rams = rams;
    }

    public int getRamUsed() {
        return ramUsed;
    }

    public void setRamUsed(int ramUsed) {
        this.ramUsed = ramUsed;
    }

    public int getSsdUsed() {
        return ssdUsed;
    }

    public void setSsdUsed(int ssdUsed) {
        this.ssdUsed = ssdUsed;
    }


    @Override
    public String toString() {
        return "MotherBoard{" + "ramSlot=" + ramSlot + ", ramBusDefault=" + ramBusDefault + ", ramUsed=" + ramUsed + ", ssdSlot=" + ssdSlot + ", ssdUsed=" + ssdUsed + ", fan=" + fan + ", cpu=" + cpu + ", gpu=" + gpu + ", ssds=" + Arrays.toString(ssds) + ", rams=" + Arrays.toString(rams) + "} " + super.toString();
    }
}
