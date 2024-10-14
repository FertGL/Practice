package Massive.Task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        arrSearch();
    }

    /**
     * Метод создает массив (Длинна 10), заполняет его случайными числами,
     * с помощь бинарного поиска проверяет есть ли заданое число в массиве
     */
    public static void arrSearch() {
        int[] intArr = new int[10];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = random.nextInt(1, 10);
        }

        if (Arrays.binarySearch(intArr, x) > 0) {
            System.out.println(Arrays.toString(intArr));
            System.out.println("Элемент присутствует в массиве");
        } else {
            System.out.println("Такого элемента нет в массиве");
        }
    }

    /**
     * Метод создает двумерный массив 3х3 , заполняет случайными числами, и
     * высчитывает среднее арефметическое всех чисел массива
     *
     * @return Заполненный массив
     */
    public static int[][] doubleArr() {
        int[][] doubleArr = new int[3][3];
        Random random = new Random();
        double mid = 0;

        for (int i = 0; i < doubleArr.length; i++) {
            for (int j = 0; j < doubleArr[i].length; j++) {
                doubleArr[i][j] = random.nextInt(1, 9);
            }
        }

        for (int i = 0; i < doubleArr.length; i++) {
            for (int numb : doubleArr[i]) {
                mid += numb;
            }
        }

        for (int i = 0; i < doubleArr.length; i++) {
            for (int j = 0; j < doubleArr[i].length; j++) {
            }
            System.out.println(Arrays.toString(doubleArr[i]));
        }
        mid /= 9;

        System.out.printf("%.2f", mid);
        return doubleArr;
    }
}
