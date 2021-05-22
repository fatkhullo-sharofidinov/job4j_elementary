package ru.job4j.loop;

public class Mortage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount >= 0) {
            amount = amount + amount * (percent / 100);
            amount = amount - salary;
            year += 1;
        }
        return year;
    }

    public static void main(String[] args) {
        int year = Mortage.year(100, 70, 50);
        System.out.println(year);
    }
}
