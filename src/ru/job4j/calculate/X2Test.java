package ru.job4j.calculate;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class X2Test {
    @Test
    public void whenBCZero() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 40;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenNoZero() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 3;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenAZero() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 2;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCZero() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 2;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenXZero() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 1;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(rsl, is(expected));
    }
}
