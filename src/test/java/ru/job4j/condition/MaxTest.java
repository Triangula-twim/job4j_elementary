package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To2Then3() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax2To6Then6() {
        int result = Max.max(2, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax4To4Then4() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax7() {
        int result = Max.max(4, 4, 5, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax4() {
        int result = Max.max(4, 2, 3, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax5() {
        int result = Max.max(5, 2, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax9() {
        int result = Max.max(1, 4, 9);
        assertThat(result, is(9));
    }
}
