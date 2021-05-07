package ru.job4j.condition;

public class PointEq {
    public static boolean eq(int x1, int y1, int x2, int y2) {
        return x1 == x2 && y1 == y2;
    }

    public static void main(String[] args) {
        boolean rsl = PointEq.eq(1, 1, 1, 0);
        System.out.println(rsl);
    }
}
