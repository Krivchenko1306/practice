package com.epam.kryvko.practice5.part1.converter4;

import com.epam.kryvko.practice5.Converter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dmytro_Kryvko on 3/28/2016.
 */
public class Converter4 implements Converter {
    @Override
    public String convert(String string) {
        Pattern pattern  =  Pattern.compile("(([a-zA-z]+);([a-zA-z\\s]+);([a-zA-z@.]+))");
        Matcher matcher =  pattern.matcher(string);
        StringBuffer buffer = new StringBuffer();
        GeneratePassword generatePassword = new GeneratePassword();
        while (matcher.find())
        {
            String   rep = matcher.group(1);
            matcher.appendReplacement(buffer , rep+ ";" +generatePassword.generate());
        }
        matcher.appendTail(buffer);
        return  buffer.toString();
    }
}
