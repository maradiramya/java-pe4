package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest
{
    Transpose transpose;
    @Before
    public void setup()
    {
        System.out.println("Inside Before");
        this.transpose=new Transpose();
    }
    @After
    public void tearDown()
    {
        System.out.println("Inside After");
        transpose=null;
    }
    @Test
    public void givenStringShouldReturnTransposeOfString()
    {
        String actualResult=transpose.transposeOfString("a quick brown fox jumps over the lazy dog");
        String expectedResult="a kciuq nworb xof spmuj revo eht yzal god ";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenStringAndNullShouldReturnErrorMessage()
    {
        String actualResult=transpose.transposeOfString(null);
        assertNotNull(actualResult);
        assertEquals("null values are not allowed",actualResult);
    }

}