package com.epam.kryvko.practice5.part2;

import com.epam.kryvko.practice5.Converter;
import com.epam.kryvko.practice5.InputUtil;

/**
 * Created by Ghost on 29.03.2016.
 */
public class Demo
{
    public static void main(String[] args) {
        String data = InputUtil.getInput("data2.txt");
        Converter converter = new ConverterImplPart2();
        System.out.println(converter.convert(data));
    }
}
