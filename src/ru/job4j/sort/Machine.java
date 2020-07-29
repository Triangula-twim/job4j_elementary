package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int change = money - price;
        int size = 0;
        int[] rsl = new int[100];
        for (int i = 0; i < this.coins.length; i++) {
            while (change - this.coins[i] >= 0) {
                rsl[size] = this.coins[i];
                size++;
                change -= this.coins[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
