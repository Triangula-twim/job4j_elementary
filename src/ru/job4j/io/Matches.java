package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countMatches = 11;
        int choosePlayer = 1;
        System.out.println("На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек. Выигрывает тот, кто забрал последние спички");
        while (countMatches > 0) {
            String player = choosePlayer % 2 == 0 ? "2-ой игрок." : "1-ый игрок.";
            System.out.println("Осталось " + countMatches + " спичек. Выбирает " + player);
            int input = Integer.valueOf(scanner.nextLine());
            if (input >= 1 && input <= 3) {
                if (countMatches - input <= 0) {
                    System.out.println("Победил " + player);
                    break;
                }
                countMatches -= input;
                choosePlayer++;
            } else {
                System.out.println("Необходимо выбрать от 1-ой до 3-х спичек");
            }
        }
    }
}
