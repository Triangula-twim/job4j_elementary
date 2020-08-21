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

    @Test
    public void correctDistance3D() {
        Point a = new Point(0, -3, 3);
        Point b = new Point(3, 1, 3);
        double out = 5;
        double excepted = a.distance3d(b);
        Assert.assertEquals(excepted, out, 0.01);
    }
}
