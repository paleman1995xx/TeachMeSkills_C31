package Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        twoDimensionalArray();
        chess();
        snake();
    }

    private static void twoDimensionalArray() {
        int light = 2;
        int width = 3;
        int[][] twoDimArray = new int[light][width];
        Random random = new Random();

        for (int i = 0; i < light; i++) {
            for (int j = 0; j < width; j++) {
                twoDimArray[i][j] = random.nextInt(20);
            }
        }
        for (int i = 0; i < light; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < light; i++) {
            for (int j = 0; j < width; j++) {
                twoDimArray[i][j] = twoDimArray[i][j] + scan.nextInt();
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < light; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < light; i++) {
            for (int j = 0; j < width; j++) {
                sum = sum + twoDimArray[i][j];
            }
        }
        System.out.println("Sum:" + sum);
    }

    private static void chess() {
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W";
                else chessBoard[i][j] = "B";
            }
        }
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void snake() {
        int light = 4;
        int width = 6;
        int interval = 0;
        int[][] array = new int[light][width];

        for (int i = 0; i < light; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < width; j++) {
                    array[i][j] = interval;
                    interval++;
                }
            } else {
                for (int j = width - 1; j >= 0; j--) {
                    array[i][j] = interval;
                    interval++;
                }
            }
        }
        for (int i = 0; i < light; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

