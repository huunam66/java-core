import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int[] ramdomArray = getRandomArray(12, 4, 50);
        int max = Max(ramdomArray);

        String ramdomArrayToString = Arrays.stream(ramdomArray).mapToObj(String::valueOf).collect(Collectors.joining(", "));
        System.out.println(ramdomArrayToString);
        System.out.println(max);

    }

    public static int[] getRandomArray(int len, int min_val, int max_val) {
        if (len <= 0) return new int[0];

        int[] randomArray = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++)
            randomArray[i] = random.nextInt(min_val, max_val);

        return randomArray;
    }

    public static int Max(int[] intsArray) {
        if (intsArray == null) return 0;
        if (intsArray.length == 0) return 0;
        if (intsArray.length == 1) return intsArray[0];

        int max = intsArray[0];
        for (int i = 0; i < intsArray.length; i++) {
            if (intsArray[i] > max) {
                max = intsArray[i];
            }
        }
        return max;
    }

}