package com.epam.kryvko.practice6.part1;


import com.epam.kryvko.practice6.Converter;

import java.io.*;

public class Part1 {

    private static final String FILE_NAME = "data2.txt";

    private static final String ENCODING = "UTF-8";

    private static final String IO_ERROR_MSG = "i/o error";

    private Part1() {
    }

    public static void main(String[] args) {
        String filename;
        if (args.length != 0) {
            filename = args[0];
        } else {
            filename = FILE_NAME;
        }
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(filename), ENCODING))) {
            Converter converter = new ConverterPart1();
            for (String line = null; (line = reader.readLine()) != null; ) {
                System.out.println(converter.convert(line));
            }
        } catch (IOException e) {
            System.out.println(IO_ERROR_MSG);
        }
    }
}