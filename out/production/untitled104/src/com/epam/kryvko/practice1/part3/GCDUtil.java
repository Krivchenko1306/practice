package com.epam.kryvko.practice1.part3;

/**
 * Created by Dmytro_Kryvko on 3/21/2016.
 */
public class GCDUtil {
    public int getGCD(int a, int b) {
        return b == 0 ? a : getGCD(b, a % b);
    }
}
