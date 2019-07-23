package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceStringTest
{
ReplaceString replaceString;
@Before
    public void setup()
{
    System.out.println("Inside Before");
    this.replaceString=new ReplaceString();
}
@After
    public void tearDown()
{
    System.out.println("Inside After");
    replaceString=null;
}
@Test
public void givenStringShouldReturnReplaceString()
{
    String actualResult=replaceString.replaceString("daily dry");
    String expectedResult="faity fry";
    assertEquals(expectedResult,actualResult);
}

@Test
    public void givenStringAndNullShouldReturnErrorMessage()
{
    String actualResult=replaceString.replaceString(null);
    assertNotNull(actualResult);
    assertEquals("null values are not allowed",actualResult);
}

}