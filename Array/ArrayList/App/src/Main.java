import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Object[] groceryItem = new Object[3];

        System.out.println("\ngrocery Item:");
        GroceryItem[] groceryItem = new GroceryItem[3];
        groceryItem[0] = new GroceryItem("milk");
        groceryItem[1] = new GroceryItem("apples", "fruit");
        groceryItem[2] = new GroceryItem("candy chip", "candy", 100);
//        groceryItem[2] = "hello";

        System.out.println(Arrays.toString(groceryItem));
        System.out.println(groceryItem[0]);
        List<GroceryItem> groceryItemList = new ArrayList<>();
        groceryItemList.add(new GroceryItem("milk"));
        groceryItemList.add(new GroceryItem("apples", "fruit"));
        groceryItemList.add(new GroceryItem("candy chip", "candy", 100));

        System.out.println("\ngrocery Item List:");
        System.out.println(groceryItemList);

        groceryItemList.sort(Comparator.comparing(GroceryItem::count));
        System.out.println("\ngrocery Item List sorted:");
        System.out.println(groceryItemList);
        groceryItemList.sort(Comparator.comparing(GroceryItem::count).reversed());
        System.out.println("\ngrocery Item List reversed:");
        System.out.println(groceryItemList);


        List<String> strings = new ArrayList<>(List.of("milk", "apples", "candy chip"));
        strings.sort(Comparator.comparing(String::toString));
        System.out.println("\ngrocery Item List sorted:");
        System.out.println(strings);
        strings.sort(Comparator.comparing(String::toString).reversed());
        System.out.println("\ngrocery Item List reversed:");
        System.out.println(strings);

//        int s = 1;
//        Integer boxInt = Integer.parseInt("123");
        Integer boxInteger = 123;
        int boxInt = boxInteger;
        System.out.println(boxInteger); // 123
        System.out.println(boxInteger.getClass().getSimpleName()); // Integer
        System.out.println(boxInteger.getClass().getName()); // java.lang.Integer
        System.out.println(boxInt); // 123

    }
}