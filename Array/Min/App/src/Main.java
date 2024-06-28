import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int len = 12;
        int min_ran = 3;
        int max_ran = 100;

        int[] randomArray = getRandomArray(len, min_ran, max_ran);
        String randomArrayToString = Arrays.stream(randomArray).mapToObj(String::valueOf).collect(Collectors.joining(", ")).toString();
        System.out.println(randomArrayToString);
        int min = Min(randomArray);
        System.out.println(min);
    }


    public static int[] getRandomArray(int len, int min_ran, int max_ran) {
        if (len <= 0) return new int[0];

        int[] insArray = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++)
            insArray[i] = random.nextInt(min_ran, max_ran);

        return insArray;
    }

    public static int Min(int[] intsArray) {
        if (intsArray == null) return 0;
        if (intsArray.length == 0) return 0;
        if (intsArray.length == 1) return intsArray[0];

        int min = intsArray[0];
        for (int i = 1; i < intsArray.length; i++) {
            if (intsArray[i] < min) min = intsArray[i];
        }

        return min;
    }
}