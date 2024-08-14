package Lesson4;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        array = new int[]{0, 1, 4, 3, 4, 5, 6, 7, 8, 9};

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
            if (number == 0) quantity++;
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
            if (array[i] > array[i + 1])  {
                isProgression = false;
                break;
            };
        }
        if (isProgression) {
            System.out.print("Прогрессия возрастающая");
        }
        else {
            System.out.print("Прогрессия не возрастающая");
        }
    }
}



//public static int(int min, int max) {
// (int) (Math.random() * (max - min)) + min;

/*
* Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
массива (просто целое число). После того, как размер массива задан, заполнить его
одним из двух способов: используя Math.random(), или каждый элемент массива вводится
пользователем вручную. Попробовать оба варианта. После заполнения массива
данными, решить для него следующие задачи:
Задача 1:
Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
Задача 2:
Найти минимальный-максимальный элементы и вывести в консоль.
Задача 3:
Найти индексы минимального и максимального элементов и вывести в консоль.
Задача 4:
Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
сообщение, что их нет.
Задача 5:
Пройти по массиву и поменять местами элементы первый и последний, второй и
предпоследний и т.д.
Задача 6:
Проверить, является ли массив возрастающей последовательностью (каждое следующее
число больше предыдущего).
Задача *:
Имеется массив из неотрицательных чисел(любой). Представьте что массив
представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
содержит нуля в начале, кроме самого числа 0.
Пример:
Input: [1,4,0,5,6,3]
Output: [1,4,0,5,6,4]
Input: [9,9,9]
Output: [1,0,0,0]*/

