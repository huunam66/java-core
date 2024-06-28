import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int len = 12;
        int min_ran = 3;
        int max_ran = 100;

        int[] randomArray = getRandomArray(len, min_ran, max_ran);
        int[] sortedRandomArray = sorted(randomArray);

        String sortedRandomArrayToString = Arrays.stream(sortedRandomArray).mapToObj(String::valueOf).collect(Collectors.joining(", ")).toString();
        String randomArrayToString = Arrays.stream(randomArray).mapToObj(String::valueOf).collect(Collectors.joining(", ")).toString();

        System.out.println(randomArrayToString);
        System.out.println(sortedRandomArrayToString);
    }

    public static int[] sorted(int[] insArray) {
        if (insArray.length <= 1) return insArray;

        int[] insArrayClone = insArray.clone();
        int len = insArray.length;
        for (int i = 0; i < len - 1; i++) {
            int[] arrayCopy = Arrays.copyOfRange(insArrayClone, i, len);
            int[] index_w_min = Min(arrayCopy);
            int index = index_w_min[0] + i;
            int min = index_w_min[1];

            if (i == index || insArrayClone[i] == min) continue;

            int temp = insArrayClone[i];
            insArrayClone[i] = insArrayClone[index];
            insArrayClone[index] = temp;
        }

        return insArrayClone;
    }


    public static int[] getRandomArray(int len, int min_ran, int max_ran) {
        if (len <= 0) return new int[0];

        int[] insArray = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++)
            insArray[i] = random.nextInt(min_ran, max_ran);

        return insArray;
    }


    public static int[] Min(int[] intsArray) {
        if (intsArray == null) return null;
        if (intsArray.length == 0) return null;
        if (intsArray.length == 1) return intsArray[0];

        int min = intsArray[0];
        int index = 0;
        for (int i = 1; i < intsArray.length; i++) {
            if (intsArray[i] < min) {
                index = i;
                min = intsArray[i];
            }
        }

        return new int[]{index, min};
    }
}