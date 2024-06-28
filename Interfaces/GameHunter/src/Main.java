import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Isaver isaver = new Monster();
        saver(isaver);
        loader(isaver);
    }

    public static List<String> input() {
        boolean stopLoop = false;
        List<String> lString = new ArrayList<>();
        while (!stopLoop) {
            System.out.println("0. Quit");
            System.out.println("1. Name");
            System.out.println("2. Type");
            System.out.println("3. Level");
            System.out.println("4. Weapon");
            System.out.print("\nYour option: ");
            int caseOption = Integer.parseInt(scanner.nextLine());

            switch (caseOption) {
                case 0: {
                    stopLoop = true;
                    break;
                }
                case 1: {
                    System.out.print("\nName: ");
                    lString.add(0, scanner.nextLine());
                    break;
                }
                case 2: {
                    System.out.print("\nType: ");
                    lString.add(1, scanner.nextLine());
                    break;
                }
                case 3: {
                    System.out.print("\nLevel: ");
                    lString.add(2, scanner.nextLine());
                    break;
                }
                case 4: {
                    System.out.print("\nWeapon: ");
                    lString.add(3, scanner.nextLine());
                    break;
                }

                default: {
                    System.out.println("Unknow !");
                    break;
                }
            }
        }

        return lString;
    }

    public static void saver(Isaver isaver) {
        List<String> lString = input();
        isaver.write(lString);
    }

    public static void loader(Isaver isaver) {
        isaver.read();
    }
}