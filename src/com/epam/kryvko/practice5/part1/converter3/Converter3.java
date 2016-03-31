package com.epam.kryvko.practice5.part1.converter3;

import com.epam.kryvko.practice5.Converter;


import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dmytro_Kryvko on 3/28/2016.
 */
public class Converter3 implements Converter {

    @Override
    public String convert(String string) {
        Pattern pattern = Pattern.compile("([a-zA-z]+);([a-zA-z\\s]+);([a-zA-z]+(@.+))");
        Matcher matcher = pattern.matcher(string);
        ArrayList<String> domens = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        while (matcher.find()) {
            if (!domens.contains(matcher.group(4))) domens.add(matcher.group(4));
        }
        matcher.reset();
        for (String domen : domens) {
            builder.append(domen).append(" ==>");
            while (matcher.find()) {
                if (matcher.group(4).equals(domen)) {
                    builder.append(matcher.group(1)).append(' ');
                }
            }
            builder.append('\n');
            matcher.reset();
        }
        return builder.toString();
    }
}
