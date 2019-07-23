package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortWordTest
{
    SortWord sortWord;
    @Before
    public void setup()
    {
        System.out.println("Inside Before");
        this.sortWord=new SortWord();

    }
    @After
    public void tearDown()
    {
        System.out.println("Inside After");
        sortWord=null;
    }
@Test
    public void givenStringShoudReturnSortedWord()
{

    String actualResult = sortWord.sortWords("A paragraph is a series of sentences");
    String expectedResult = ("Aaisofparagraphsentencesseries");
    assertEquals(expectedResult,actualResult);
}
@Test
    public void givenStringShouldReturnNullErrorMessage()
{
    String actualResult=sortWord.sortWords(null);
    assertNotNull(actualResult);

    assertEquals("null values are not allowed",actualResult);
}

}
