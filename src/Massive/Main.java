package Massive;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static int[] arr1 = new int[10];
    private static int[] arr2 = new int[10];

    public static void main(String[] args) {
        pullArrays(arr1);
        pullArrays(arr2);

        System.out.println("1)Массив содержащий другие два: " + Arrays.toString(sumArr(arr1, arr2)));

    }

    public static void pullArrays(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 32);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sumArr(int[] arr1, int[] arr2) {
        int[] sumArr = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, sumArr, 0, arr1.length);
        System.arraycopy(arr2, 0, sumArr, arr1.length, arr2.length);
        return sumArr;
    }

}
