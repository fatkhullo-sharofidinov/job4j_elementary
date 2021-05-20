package ru.job4j.loop;

public class Mortage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double result = 0;
        while (amount >= result) {
            double amount2 = amount + salary * (percent / 100);
            amount = amount2 - salary;
            year += 1;
        }
        return year;
    }

    public static void main(String[] args) {
        int year = Mortage.year(100, 120, 50);
        System.out.println(year);
    }
}
