package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && !isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return !isEven(num) || !isPositive(num);
    }

    public static void main(String[] args) {
        boolean rsl = LogicNot.isEven(3);
        System.out.println(rsl);
        rsl = LogicNot.isPositive(2);
        System.out.println(rsl);
        rsl = LogicNot.notEven(4);
        System.out.println(rsl);
        rsl = LogicNot.notPositive(-9);
        System.out.println(rsl);
        rsl = LogicNot.evenOrNotPositive(4);
        System.out.println(rsl);
        rsl = LogicNot.notEvenAndPositive(1);
        System.out.println(rsl);
    }
}
