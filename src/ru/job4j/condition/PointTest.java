package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void correctDistance() {
        Point a = new Point(1, 1);
        Point b = new Point(5, 4);
        double out = 5;
        double excepted = a.distance(b);
        Assert.assertEquals(excepted, out, 0.01);
    }
}
