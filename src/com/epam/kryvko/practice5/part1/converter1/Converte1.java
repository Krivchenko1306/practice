package com.epam.kryvko.practice5.part1.converter1;

import com.epam.kryvko.practice5.Converter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by Dmytro_Kryvko on 3/28/2016.
 */
public class Converte1 implements Converter {

    @Override
    public String convert(String string)
    {
        Pattern pattern  =  Pattern.compile("([a-zA-z]+);([a-zA-z\\s]+);([a-zA-z@.]+)");
        Matcher matcher =  pattern.matcher(string);
        StringBuilder builder = new StringBuilder();
        while (matcher.find())
        {
            builder.append(matcher.group(1)).
                    append(" ==> ").
                    append(matcher.group(3)).
                    append("\n");
        }
        return  builder.toString();
    }


}
