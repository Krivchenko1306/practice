package com.epam.kryvko.practice1;

import com.epam.kryvko.practice1.part1.Part1;
import com.epam.kryvko.practice1.part2.Part2;
import com.epam.kryvko.practice1.part3.Part3;
import com.epam.kryvko.practice1.part4.Part4;
import com.epam.kryvko.practice1.part5.Part5;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by Dmytro_Kryvko on 3/21/2016.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("Part1:");
        Part1.main(new String[]{});
        System.out.println();
        System.out.println("Part2:");
        Part2.main(new String[]{"15", "24"});
        System.out.println();
        System.out.println("Part3:");
        Part3.main(new String[]{"15", "3"});
        System.out.println();
        System.out.println("Part4:");
        Part4.main(new String[]{"235"});
        System.out.println();
        System.out.println("Part5:");
        Part5.main(new String[]{});
    }

}
