package com.epam.kryvko.practice5.part1.converter4;


import com.epam.kryvko.practice5.Converter;
import com.epam.kryvko.practice5.InputUtil;

/**
 * Created by Dmytro_Kryvko on 3/28/2016.
 */
public class Demo
{
    private  static  final String FILE_NAME = "data.txt";

    public static void main(String[] args) {
        String data = InputUtil.getInput(FILE_NAME);
        Converter converter = new Converter4();
        String res= converter.convert(data);
        System.out.println(res);
    }
}
