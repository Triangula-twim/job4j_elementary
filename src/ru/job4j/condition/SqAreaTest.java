package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void testSquare() {
        int p = 12;
        int k = 2;
        double out = 8;
        double excepted = SqArea.square(p, k);
        Assert.assertEquals(excepted, out, 0.01);
    }
}
