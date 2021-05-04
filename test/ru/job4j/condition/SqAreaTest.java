package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K4Square4() {
        int expected = 4;
        int p = 10;
        int k = 4;
        double out = SqArea.square(10, 4);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP14K6Square6() {
        int expected = 6;
        int p = 14;
        int k = 6;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, k, 0.01);
    }
}