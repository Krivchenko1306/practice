package com.epam.kryvko.practice1.part5;

import static java.lang.Math.pow;

/**
 * Created by Dmytro_Kryvko on 3/21/2016.
 */
public class TableUtil {

    private static final char START = 64;

    private static final char END = 90;

    private static final char LENGTH = END - START;


    private TableUtil() {
    }


    public static int chars2digits(String number) {
        int res = 0;
        for (int i = 0; i < number.length(); i++) {
            res += (number.charAt(i) - START) * pow(LENGTH, number.length() - i - 1);

        }
        return res;
    }

    public static String digits2chars(int number) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; number > 0; number = number / LENGTH, i++) {
            if (number % LENGTH == 0) {
                res.insert(0, END);
                number--;
            } else res.insert(0, (char) (START + (number % 26)));
        }
        return res.toString();
    }

    public static String rightColumn(String number) {
        int temp = chars2digits(number);
        return digits2chars(temp + 1);
    }

}
