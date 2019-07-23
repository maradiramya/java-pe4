package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest
{
    RegularExpression regularExpression;
    @Before
    public void setup()
    {
        System.out.println("Inside Before");
        this.regularExpression=new RegularExpression();
    }
    @After
    public void tearDown()
    {
        System.out.println("Inside After");
        regularExpression=null;
    }
    @Test
    public void givenStringShouldReurnPresenceOfName()
    {
        boolean actualResult=regularExpression.presenceOfName("this is Harry.");
        boolean expectedResult=true;
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenStringShouldReturnErrorMessageAsFalse()
    {
        boolean actualResult=regularExpression.presenceOfName("this is Henry");
        boolean expectedResult=false;
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenStringAndNullShouldReturnErrorMessage()
    {
        boolean actualResult=regularExpression.presenceOfName(null);
        assertNotNull(actualResult);
        assertEquals(false,actualResult);
    }

}