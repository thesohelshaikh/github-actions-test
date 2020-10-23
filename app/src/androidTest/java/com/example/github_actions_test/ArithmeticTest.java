package com.example.github_actions_test;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticTest {
    @Test
    public void testAddition(){
        Assert.assertEquals(5, 2 + 2);
    }

    @Test
    public void testMultiplication(){
        Assert.assertEquals(4, 2 * 2);
    }
}
