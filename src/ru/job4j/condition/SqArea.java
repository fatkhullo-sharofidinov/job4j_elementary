package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        double rsl = p*k/(2*k+2);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}
