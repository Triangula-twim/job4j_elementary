package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double rsl = amount;
        while (rsl >= 0) {
            rsl = rsl + rsl * (percent / 100) - salary;
            year++;
        }
        return year;
    }
}
