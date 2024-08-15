package Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array));

        System.out.print("Выберите задачу - ");

        int task = sc.nextInt();
        switch (task) {
            case 1:
                backAndForth(array);
                break;
            case 2:
                maxMin(array);
                break;
            case 3:
                index(array);
                break;
            case 4:
                matching(array);
                break;
            case 5:
                replacement(array);
                break;
            case 6:
                progression(array);
                break;
            case 7:
                difficultTask(new int[]{1, 2});
                difficultTask(new int[]{1, 9});
                difficultTask(new int[]{9, 9});
                break;
            default:
                System.out.print("Задача не найдена");
        }
    }

    private static void backAndForth(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    private static void maxMin(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }

    private static void index(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                indexMin = i;
            }
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            }
        }
        System.out.println("Минимальное значение: " + indexMin);
        System.out.println("Максимальное значение: " + indexMax);
    }

    private static void matching(int[] array) {
        int quantity = 0;
        for (int number : array) {
            if (number == 0) {
                quantity++;
            }
        }
        System.out.print(quantity == 0 ? "Нулевых элементов нет." : "Количество нулевых элементов: " + quantity);
    }

    private static void replacement(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void progression(int[] array) {
        boolean isProgression = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isProgression = false;
                break;
            }
        }
        System.out.print(isProgression ? "Прогрессия возрастающая" : "Прогрессия не возрастающая");
    }

    private static void difficultTask(int[] array) {
        StringBuilder line = new StringBuilder();
        for (int j : array) {
            line.append(j);
        }

        int number = Integer.parseInt(line.toString());
        number++;
        line = new StringBuilder(String.valueOf(number));

        array = new int[line.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Character.getNumericValue(line.charAt(i));
        }
        System.out.println(Arrays.toString(array));
    }
}