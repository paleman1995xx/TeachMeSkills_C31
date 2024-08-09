package Lesson1;

public class Task3 {
    public static void main(String[] args) {
        int n = 126;
        int a = n / 100;
        int b = n % 100 / 10;
        int c = n % 100 % 10;
        int l = a + b + c;

        System.out.print("Ответ=" + l);
    }
}
