package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void when1Sort1() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when2Sort2() {
        int[] data = new int[] {12, 4, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 5, 12};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when3Sort3() {
        int[] data = new int[] {13, 41, 21, 2, 15};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 13, 15, 21, 41};
        Assert.assertArrayEquals(expected, result);
    }
}