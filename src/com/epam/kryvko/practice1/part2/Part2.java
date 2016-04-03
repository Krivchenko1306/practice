package com.epam.kryvko.practice1.part2;

/**
 * Created by Dmytro_Kryvko on 3/21/2016.
 */
public class Part2 {

    private Part2() {
    }

    public static void main(String[] args) {
        int i = 0, j = 0;
        try {
            i = Integer.parseInt(args[0]);
            j = Integer.parseInt(args[1]);
            int sum = i + j;
            System.out.printf("Sum  %d + %d = %d\n", i, j, sum);
        } catch (NumberFormatException ex) {
            System.err.println("Incorrect input");
        }

    }
}
