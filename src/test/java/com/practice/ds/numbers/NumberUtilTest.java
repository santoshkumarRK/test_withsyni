package com.practice.ds.numbers;

import org.junit.Assert;
import org.junit.Test;

public class NumberUtilTest {

    @Test
    public void getCountOfDigitsWithZero(){
        Assert.assertEquals(1,NumberUtil.getCountOfDigits(0));
    }
    @Test
    public void getCountOfDigitsWithPositiveSingleDigit(){
        Assert.assertEquals(1,NumberUtil.getCountOfDigits(9));
    }
    @Test
    public void getCountOfDigitsWithNegativeSingleDigit(){
        Assert.assertEquals(1,NumberUtil.getCountOfDigits(-9));
    }
    @Test
    public void getCountOfDigitsWithZeroWithNegativeSigne(){
        Assert.assertEquals(1,NumberUtil.getCountOfDigits(-0));
    }
    @Test
    public void getCountOfDigitsWithPositiveDoubleDigit(){
        Assert.assertEquals(2,NumberUtil.getCountOfDigits(12));
    }
    @Test
    public void getCountOfDigitsWithNegativeeDoubleDigit(){
        Assert.assertEquals(2,NumberUtil.getCountOfDigits(-12));
    }

    @Test
    public void checkPalindromWithSingleDigitPositiveNumber(){
        Assert.assertTrue(NumberUtil.checkPalendromNumber(2));
    }

    @Test
    public void checkPalindromWithSingleDigitNegativeeNumber(){
        Assert.assertTrue(NumberUtil.checkPalendromNumber(-2));
    }
    @Test
    public void checkPalindromWithTwoDigitWithNegative(){
        Assert.assertFalse(NumberUtil.checkPalendromNumber(-12));
    }

    @Test
    public void checkPalindromWithTwoDigitWithNegativeTest(){
        Assert.assertTrue(NumberUtil.checkPalendromNumber(-11));
    }
    @Test
    public void checkPalindromWithTwoDigitWithPositiveTest(){
        Assert.assertTrue(NumberUtil.checkPalendromNumber(22));
    }

    @Test
    public void factorialTestWithPositive(){
        Assert.assertEquals(120,NumberUtil.factorial(5));
    }
    @Test
    public void factorialTestWithNegative(){
        Assert.assertEquals(120,NumberUtil.factorial(-5));
    }
    @Test
    public void factorialTestWithZero(){
        Assert.assertEquals(1,NumberUtil.factorial(0));
    }
}
