package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void when16To2Then16() {
        int left = 16;
        int right = 2;
        int in = Max.max(left, right);
        int expected = 16;
        Assert.assertEquals(expected, in);
    }

    @Test
    public void  when10To99Then99() {
        int left = 10;
        int right = 99;
        int in = Max.max(left, right);
        int expected = 99;
        Assert.assertEquals(expected, in);
    }

    @Test
    public void when10To10Then10() {
        int left = 10;
        int right = 10;
        int in = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(expected, in);
    }
}