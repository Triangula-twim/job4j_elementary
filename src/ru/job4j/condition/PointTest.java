package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void correctDistance() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 5;
        int y2 = 4;
        double out = 5;
        double excepted = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(excepted, out, 0.01);
    }
}
