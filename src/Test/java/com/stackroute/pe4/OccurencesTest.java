package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurencesTest
{
Occurences occurences;
@Before
    public void setup()
{
    System.out.println("Inside Before");
    this.occurences=new Occurences();
}
@After
    public void tearDown()
{
    System.out.println("Inside After");
    occurences=null;
}
@Test
    public void givenStringShouldReturnNoOfOccurences()
{
    int actualResult=occurences.countNoOfOccurences("java is java again java again",'a');
    int expectedResult=10;
    assertEquals(expectedResult,actualResult);
}

@Test
public void givenStringAndNullShouldReturnErrorMessage()
{
    int actualResult=occurences.countNoOfOccurences("",'a');
    assertNotNull(actualResult);
    assertEquals(0,actualResult);

}


}