package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurenceTest
{
    MultipleOccurence multipleOccurence;
    @Before
    public void setup()
    {
        System.out.println("Inside Before");
        this.multipleOccurence=new MultipleOccurence();
    }
    @After
    public void tearDown()
    {
        System.out.println("Inside After");
        multipleOccurence=null;
    }
    @Test
    public void givenStringShouldReturnMatchingString()
    {
        String actualResult=multipleOccurence.multipleOccurenceWord("She sells seashells by the seashore","se");
        String expectedResult="Found at:4-6\n"+
                "Found at:10-12\n"+
                "Found at:27-29";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenStringAndnullShouldReturnErrorMessage()
    {
        String actualResult=multipleOccurence.multipleOccurenceWord(null,null);
        assertNotNull(actualResult);
        assertEquals("null values are not allowed",actualResult);
    }
}