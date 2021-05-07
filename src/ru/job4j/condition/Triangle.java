package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double bc, double ac) {
        return (ab + bc) > ac && (ab + ac) > bc && (ac + bc) > ab;
    }

    public static void main(String[] args) {
        boolean rsl = Triangle.exist(2.4, 3.8, 4.0);
        System.out.println(rsl);
    }
}
