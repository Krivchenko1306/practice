package com.epam.kryvko.practice5.part3;

import com.epam.kryvko.practice5.Converter;
import com.epam.kryvko.practice5.InputUtil;

/**
 * Created by Ghost on 29.03.2016.
 */
public class Demo {

    private Demo() {
    }


    public static void main(String[] args) {
        String data = InputUtil.getInput("data3.txt");
        Converter converter = new ConverterImplPart3();
        System.out.println(converter.convert(data));
    }
}
