package com.epam.kryvko.practice1.part5;

/**
 * Created by Dmytro_Kryvko on 3/21/2016.
 */
public class Part5 {

    private Part5() {
    }

    public static void main(String[] args) {
        System.out.println(TableUtil.chars2digits("AAA"));
        System.out.println(TableUtil.digits2chars(702));
        System.out.println(TableUtil.rightColumn("AAZ"));
    }
}
