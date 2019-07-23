package com.stackroute.pe4;

public class Occurences
{
public int countNoOfOccurences(String inputString, Character ch)

{
    if(inputString==null||ch=='\u0000')
    {
        return 0;
    }
    int count=inputString.length()-inputString.replaceAll(String.valueOf(ch),"").length();
    System.out.println(count);
    return count;
}
}
