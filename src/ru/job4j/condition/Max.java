package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        return condition ? left : right;
    }

    public static void main(String[] args) {
        int rsl = Max.max(2, 0);
        System.out.println(rsl);
    }
}
