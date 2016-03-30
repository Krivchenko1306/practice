package com.epam.kryvko.practice5.part2;


import com.epam.kryvko.practice5.Converter;
import com.epam.kryvko.practice6.part2.StringAppendUtil;

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
        if(matcher.find())
        {
            matcher.start(0);
            StringBuilder builder = new StringBuilder();
            matcher.find();
            int min,max ;
            String start =matcher.group();
            minList.add(start);
            maxList.add(start);
            min = max  = matcher.group().length();
            while(matcher.find())
            {
                String mt = matcher.group();
                if(mt.length() > max)
                {
                    maxList.clear();
                    maxList.add(mt);
                    max = mt.length();
                }
                if(mt.length() == max && !maxList.contains(mt))
                {
                    maxList.add(mt);
                }
                if(mt.length() < min )
                {
                    minList.clear();
                    minList.add(mt);
                    min = mt.length();
                }
                if(mt.length() == min && !minList.contains(mt))
                {
                    minList.add(mt);
                }
            }
            builder.append("min ==> ");
            for(String minStr : minList)
            {
                builder.append(minStr).append(' ');
            }
            builder.append("\n").append("max ==> ");
            for(String maxStr : maxList)
            {
                builder.append(maxStr).append(' ');
            }
            return builder.toString();
        }
        else
        {
            return  "";
        }
    }
}
