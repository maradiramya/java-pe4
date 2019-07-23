package com.stackroute.pe4;

public class Transpose
{
    public String transposeOfString(String inputString)
    {
        if(inputString==null)
        {
            return"null values are not allowed";
        }
        String[] inputWord=inputString.split(" ");
        String outputString="";
        for(String word:inputWord)
        {
            String revWord="";
            for(int i=word.length()-1;i>=0;i--)
            {
                revWord+=word.charAt(i);
            }
            outputString+=revWord.concat(" ");
        }
     return outputString;
    }
}
