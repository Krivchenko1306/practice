package com.epam.kryvko.practice5.part3;


import com.epam.kryvko.practice5.Converter;
import com.epam.kryvko.practice5.part1.converter4.GeneratePassword;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ghost on 29.03.2016.
 */
public class ConverterImplPart3 implements Converter {


    @Override

    public String convert(String string) {
        Pattern pattern = Pattern.compile("(\\S)(?:(\\S*))");
        Matcher matcher = pattern.matcher(string);
        StringBuffer buffer = new StringBuffer();
        for (; matcher.find(); ) {
            matcher.appendReplacement(buffer, matcher.group(1).toUpperCase() + "$2");
        }
        matcher.appendTail(buffer);
        return buffer.toString();
    }
}

