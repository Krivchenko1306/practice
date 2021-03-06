package com.epam.kryvko.practice1.part3;

import com.epam.kryvko.practice1.part3.GCDUtil;

/**
 * Created by Dmytro_Kryvko on 3/21/2016.
 */
public class Part3 {

    private Part3() {
    }

    public static void main(String[] args) {
        int i = 0, j = 0;
        try {
            GCDUtil gcdUtil = new GCDUtil();
            i = Integer.parseInt(args[0]);
            j = Integer.parseInt(args[1]);
            int gcd = gcdUtil.GCD(i, j);
            System.out.printf("GCD( %d , %d ) = %d", i, j, gcd);
        } catch (NumberFormatException ex) {
            System.err.println("Incorrect input");
        }
    }
}
