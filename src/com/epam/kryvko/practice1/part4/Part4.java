package com.epam.kryvko.practice1.part4;

/**
 * Created by Dmytro_Kryvko on 3/21/2016.
 */
public class Part4 {

    private Part4() {
    }

    public static void main(String[] args) {
        int i = 0;
        try {
            NumberSumUtil sumUtil = new NumberSumUtil();
            i = Integer.parseInt(args[0]);
            System.out.printf("Sum %d  : %d", i, sumUtil.getSum(i));
        } catch (NumberFormatException ex) {
            System.err.println("Incorrect input");
        }
    }
}
