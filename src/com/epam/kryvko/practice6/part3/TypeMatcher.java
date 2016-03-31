package com.epam.kryvko.practice6.part3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dmytro_Kryvko on 3/29/2016.
 */
public class TypeMatcher {

    private String data;

    public TypeMatcher(String data) {
        this.data = data;
    }

    public String match(Type type) {
        StringBuilder builder = new StringBuilder();
        Pattern pattern = Pattern.compile(type.getRegex());
        Matcher matcher = pattern.matcher(data);
        while (matcher.find()) {
            builder.append(matcher.group()).append(' ');
        }
        return builder.toString();
    }
}
