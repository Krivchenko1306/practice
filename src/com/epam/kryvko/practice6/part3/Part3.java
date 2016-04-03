package com.epam.kryvko.practice6.part3;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part3 {

    private static final String INT_REGEX = "\\d+";

    private static final String CHAR_REGEX = "^|$|\\s\\[a-zA-zа-яА-Я](?=\\s)";

    private static final String DOUBLE_REGEX = "((\\d+)(\\.|,)(\\d+)|((\\.|,+?)(\\d+))|((\\d+)(\\.|,+?)))(?=\\s)";

    private static final String STRING_REGEX = "[a-zA-zа-яА-Я]{2}";

    private static final String FILE_NAME = "part3.txt";

    private static final String FILE_NOT_FOUND_MSG = "Файл не найден";

    private static final String EXIT_MSG = "EXIT";

    private static final String ENCODING = "UTF-8";

    private Part3(){}

    public static void main(String[] args) throws IOException {
        ReadDataUtil util = new ReadDataUtil();
        String data = util.readData(FILE_NAME, ENCODING);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, ENCODING));
        TypeMatcher matcher = new TypeMatcher(data);
        String line = reader.readLine();
        do {
            System.out.println("Input type:");
            Type type = TypeFactory.getType(line);
            if (type != Type.NoType) System.out.println(matcher.match(type));
            else System.out.println("No Type");
        } while ((line = reader.readLine()) != null);

    }

}