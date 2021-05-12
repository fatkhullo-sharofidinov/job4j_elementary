package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int zero = 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            if (n == 0) {
                System.out.println(zero);
            } else {
                result = result * i;
            }
        }
        return result;
    }
}
