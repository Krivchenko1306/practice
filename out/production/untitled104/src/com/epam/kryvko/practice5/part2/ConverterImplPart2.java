package com.epam.kryvko.practice5.part2;


import com.epam.kryvko.practice5.Converter;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ghost on 29.03.2016.
 */
public class ConverterImplPart2 implements Converter
{


    @Override
    public String convert(String string)
    {
        List<String> minList = new ArrayList<>();
        List<String> maxList = new ArrayList<>();
        Pattern pattern = Pattern.compile("(\\S+)");
        Matcher matcher = pattern.matcher(string);
        if(matcher.matches())
        {
            StringBuilder builder = new StringBuilder();
            matcher.find();
            int min,max ;
            String start =matcher.group();
            minList.add(start);
            maxList.add(start);
            min = max  = matcher.group().length();
            while(matcher.find())
            {

            }
            return builder.toString();
        }
        else
        {
            return  "";
        }

    }
}
