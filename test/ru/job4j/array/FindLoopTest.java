package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas2Then3() {
        int[] input = {5, 4, 3, 2, 9, 66};
        int value = 2;
        int result = FindLoop.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasNot7ThenMinus1() {
        int[] input = {5, 4, 3, 2, 6, 22};
        int value = 7;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasNot9ThenMinus1() {
        int[] input = {5, 4, 3, 2, 6, 8, 22};
        int value = 9;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
