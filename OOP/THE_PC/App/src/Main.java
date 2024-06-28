import DTO.*;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("1920 x 1080", "LCD", "Desktop", "Dell", 2300000, 12.4F, 9.4F, 3.2F);
        KeyBoard keyBoard = new KeyBoard("Black", true, "Mechanical Keyboard", "ASUS", 1200000, 14.2F, 5.4F, 2.3F);
        CPU cpu = new CPU("Intel 11th", 3.0F, 2, 4, "Intel CPU", "Intel", 1200000, 23.3F, 34.2F, 4.3F);
        GPU gpu = new GPU("Intel UHD", 3200F, "GPU Intel", "Intel", 320000, 2.3F, 3.2F, 4F);
        MotherBoard motherBoard = new MotherBoard(2, 3200, 2, 2, 1, 2, cpu, gpu, "", "SAMSUNG", 1200000, 5.5F, 6.3F, 2.3F);
        ComputerCase computerCase = new ComputerCase("Metal", "Blue", motherBoard, "SSS", "G.A", 2300000, 24.4F, 13.4F, 4.3F);
        PersionalComputer persionalComputer = new PersionalComputer(monitor, computerCase, keyBoard);
        persionalComputer.show();
    }
}