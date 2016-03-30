package com.epam.kryvko.practice1.part4;

/**
 * Created by Dmytro_Kryvko on 3/21/2016.
 */
public class NumberSumUtil {
    public int getSum(int number) {
        int sum = 0;
        for (int a = 10; number > 0; number = number / a) {
            sum += number % a;
        }
        return sum;
    }
}
