import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static String optionString = """
            0. Exit
            1. Insert
            2. Delete
            3. Update
            4. Search
            Your option:
            """;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Object> objectsArray = new ArrayList<>();
        menu(objectsArray);
    }

    public static void menu(List<Object> objectsArray) {
        while (true) {
            System.out.println(objectsArray);
            System.out.print("\n" + optionString);
            switch (scanner.nextLine()) {
                case "0" -> {
                    return;
                }
                case "1" -> add(objectsArray);
                case "2" -> {
                    System.out.print("\nInput value you want to delete: ");
                    System.out.println(delete(objectsArray, scanner.nextLine()));
                }
                case "3" -> {
                    System.out.print("\nInput value you want to update: ");
                    String oldVal = scanner.nextLine();
                    System.out.print("\nInput new value: ");
                    String newVal = scanner.nextLine();
                    System.out.println(update(objectsArray, oldVal, newVal));
                }
                case "4" -> {
                    System.out.print("\nSearch: ");
                    String searchVal = scanner.nextLine();
                    String searchResult = search(objectsArray, searchVal);
                    if (searchResult == null) {
                        System.out.println("Value is not existing !");
                        break;
                    }
                    if (!searchResult.toString().equalsIgnoreCase(searchVal)) {
                        System.out.println(searchVal.toString());
                        break;
                    }

                    System.out.println(searchResult);
                }
                default -> System.out.println("Not accept!");
            }
        }
    }

    public static void add(List<Object> objectsArray) {
        if (objectsArray == null) objectsArray = new ArrayList<>();

        System.out.print("\nInput once or multiple value: ");
        Object[] inputs = scanner.nextLine().split(",");
        for (Object o : inputs) {
            String search = search(objectsArray, o.toString().trim());
            System.out.println(search);
            if (search != null) if (search.trim().equalsIgnoreCase(o.toString().trim())) continue;

            objectsArray.add(o);
        }
    }

    public static String search(List<Object> objectsArray, String val) {
        if (objectsArray == null) return "Array is null !";
        if (objectsArray.size() <= 0) return "Array is empty !";

        for (Object o : objectsArray) {
            if (o.toString().trim().equalsIgnoreCase(val.trim())) {
                return o.toString();
            }
        }

        return null;
    }

    public static String update(List<Object> objectsArray, String oldVal, String newVal) {
        if (objectsArray == null) return "Array is null !";
        if (objectsArray.size() <= 0) return "Array is empty !";

        Object searchVal = search(objectsArray, oldVal);
        if (searchVal == null) return "Value is not existing !";
        if (!searchVal.toString().trim().equalsIgnoreCase(oldVal.trim())) return searchVal.toString();


        int index = objectsArray.indexOf(searchVal);
        objectsArray.set(index, newVal);
//        LinkedList<Integer> s = new LinkedList<>();
//        Queue<Integer> q = new LinkedList<>();
//        Stack<Integer> st = new Stack<>();

        return "Update successfully !";


    }

    public static String delete(List<Object> objectsArray, String val) {
        if (objectsArray == null) return "Array is null !";
        if (objectsArray.size() <= 0) return "Array is empty !";

        Object searchVal = search(objectsArray, val);
        if (searchVal == null) return "Value is not existing !";
        if (!searchVal.toString().trim().equalsIgnoreCase(val.trim())) return searchVal.toString();

        objectsArray.remove(searchVal);
        return "Delete successfully !";
    }

}