
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[]{
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine()
        };

        shortAndLong(strings);
        order(strings);
        task3(strings);
        task4(strings);
        task5("Hello");
    }

    public static void shortAndLong(String[] strings) {
        String longe = strings[0];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > longe.length()) {
                longe = strings[i];
            }
        }
        String shorte = strings[0];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < shorte.length()) {
                shorte = strings[i];
            }
        }
        System.out.println("Task1");
        System.out.println(longe);
        System.out.println(shorte);
        System.out.println();
    }

    public static void order(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].length() > strings[j].length()) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        System.out.println("Task2");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println();
    }

    public static void task3(String[] strings) {
        int length = 0;

        for (String string : strings) {
            length += string.length();
        }

        double average = length / (double) strings.length;

        for (String string : strings) {
            if (string.length() < average) {
                System.out.println("Task3");
                System.out.println(string + " [number of characters: " + string.length() + "]");
                System.out.println();
            }
        }
    }

    public static void task4(String[] strings) {
        System.out.println("Task4");
        for (String str : strings) {
            String[] words = str.split(" ");
            for (String word : words) {
                StringBuilder symbols = new StringBuilder();
                boolean isPrintWord = true;
                for (Character symbolWord : word.toCharArray()) {
                    for (Character symbol : symbols.toString().toCharArray()) {
                        if (symbolWord.equals(symbol)) {
                            isPrintWord = false;
                            break;
                        }
                    }
                    if (isPrintWord) {
                        symbols.append(symbolWord);
                    } else {
                        break;
                    }
                }
                if (isPrintWord) {
                    System.out.println(word);
                    System.out.println();
                    return;
                }
            }
        }
    }

    public static void task5(String strings) {
        StringBuilder resolve = new StringBuilder();

        for (char i : strings.toCharArray()) {
            resolve.append(i).append(i);
        }

        System.out.println("Task5");
        System.out.println("Answer: " + resolve);
        System.out.println();
    }
}


