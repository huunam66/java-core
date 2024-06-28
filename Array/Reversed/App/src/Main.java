import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] randomArray = getRandomArray(24, 111, 1000);
        int[] randomArrayReversed = reversed(randomArray);

//        String randomArrayToString = Arrays.stream(randomArray).mapToObj(String::valueOf).collect(Collectors.joining(", "));
//        String randomArrayReversedToString = Arrays.stream(randomArrayReversed).mapToObj(String::valueOf).collect(Collectors.joining(", "));

        System.out.println(Arrays.toString(randomArray));
        System.out.println(Arrays.toString(randomArrayReversed));


        System.out.println();
        System.out.println();
        List<Integer> in = Arrays.stream(randomArray).mapToObj(Integer::valueOf).collect(Collectors.toList());
        List<Integer> in1 = new ArrayList<>(in);
        in1.add(4114);
        System.out.println(in);
        System.out.println(in1);

        Integer[] t = in.toArray(new Integer[]{});
        System.out.println(Arrays.toString(t));

        System.out.println();
        System.out.println();

        List<Object> d = new ArrayList<>();
        d.add('a');
        d.add("123124");
        d.add(12);
        d.add(1.2F);
        d.add(4.3D);
        System.out.println(d);
    }


    public static int[] reversed(int[] intsArray) {
        if (intsArray == null) return new int[0];
        if (intsArray.length == 0) return new int[0];
        if (intsArray.length == 1) return intsArray;

        int[] intsArrayClone = intsArray.clone();
        int len = intsArrayClone.length;
        for (int i = 0; i < len - 1; i++) {
            int[] intsArrayCloneCopy = Arrays.copyOfRange(intsArrayClone, i, len);
            int[] index_w_max = Max(intsArrayCloneCopy);
            int index = index_w_max[0] + i;
            int max = index_w_max[1];

            if (index == i || intsArrayClone[i] == max) continue;

            int temp = intsArrayClone[i];
            intsArrayClone[i] = intsArrayClone[index];
            intsArrayClone[index] = temp;
        }

        return intsArrayClone;
    }

    public static int[] getRandomArray(int len, int min_val, int max_val) {
        if (len <= 0) return new int[0];

        int[] randomArray = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++)
            randomArray[i] = random.nextInt(min_val, max_val);

        return randomArray;
    }

    public static int[] Max(int[] intsArray) {
        if (intsArray == null) return null;
        if (intsArray.length == 0) return null;
        if (intsArray.length == 1) return new int[]{0, 0};

        int max = intsArray[0];
        int index = 0;
        for (int i = 0; i < intsArray.length; i++) {
            if (intsArray[i] > max) {
                max = intsArray[i];
                index = i;
            }
        }
        return new int[]{index, max};
    }

}