package com.stackroute.pe4;

public class RegularExpression
{
    public boolean presenceOfName(String givenString)
    {
        if(givenString==null)
        {
            return false;
        }
        boolean temp;
        if (givenString.matches(".*Harry.*"))
        {

        temp=true;
    }
    else
        temp= false;
        return temp;
    }

}
