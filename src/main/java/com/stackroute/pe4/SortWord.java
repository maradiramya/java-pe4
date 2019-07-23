package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortWord
{
public String sortWords(String inputString)
{
    if(inputString==null)
    {
        return "null values are not allowed";
    }
    String[] arrayList=inputString.split(" ");
    ArrayList<String> list=new ArrayList<>();
    for (String string:arrayList )
    {
        list.add(string);
    }
    Collections.sort(list);
    System.out.println(list);
    StringBuilder stringBuilder=new StringBuilder();
    for(String str:list) stringBuilder.append(str);
    String sortedString=stringBuilder.toString();
    System.out.println(sortedString);
    return sortedString;

}
}
