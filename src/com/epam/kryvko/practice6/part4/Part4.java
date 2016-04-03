package com.epam.kryvko.practice6.part4;

import java.io.IOException;

public class Part4 {

    private static final String FILE_NAME = "part4.txt";

    private static final String ENCODING = "UTF-8";

    private Part4(){}

    public static void main(String[] args) throws IOException {
        // TODO this code throws a NullPointerEexception
        // you must implement the Parser before use it
        Parser parser = new Parser(FILE_NAME, ENCODING);
        for (String str : parser) {
            System.out.println(str);
        }
    }

}