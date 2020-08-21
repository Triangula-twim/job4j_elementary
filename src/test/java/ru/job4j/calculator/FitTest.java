package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void bestManWeight() {
        short in = 187;
        double out = 100.05;
        double excepted = Fit.manWeight(in);
        Assert.assertEquals(excepted, out, 0.01);
    }

    @Test
    public void bestWomanWeight() {
        short in = 167;
        double out = 65.55;
        double excepted = Fit.womanWeight(in);
        Assert.assertEquals(excepted, out, 0.01);
    }
}
