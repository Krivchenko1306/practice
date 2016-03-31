package com.epam.kryvko.practice6.part1;

import com.epam.kryvko.practice6.Converter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dmytro_Kryvko on 3/29/2016.
 */
public class ConverterPart1 implements Converter {
    @Override
    public String convert(String string) {
        Pattern pattern = Pattern.compile("(\\S{4,})");
        Matcher matcher = pattern.matcher(string);
        StringBuffer buffer = new StringBuffer();
        while (matcher.find()) {
            String rep = matcher.group();
            matcher.appendReplacement(buffer, rep.toUpperCase());
        }
        matcher.appendTail(buffer);
        return buffer.toString();
    }
}
