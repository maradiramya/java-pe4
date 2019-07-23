package com.stackroute.pe4;

public class ReplaceString
{
    public String replaceString(String inputString)
    {
        if(inputString==null)
        {
            return "null values are not allowed";
        }

        String result="";
        result=inputString.replaceAll("d","f");
        result=result.replaceAll("l","t");
        System.out.println(result);
        return result;


    }
}
