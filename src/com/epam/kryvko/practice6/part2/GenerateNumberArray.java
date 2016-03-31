package com.epam.kryvko.practice6.part2;

import java.util.Random;

/**
 * Created by Dmytro_Kryvko on 3/29/2016.
 */
public class GenerateNumberArray {
    private Random random;

    private static final int MAX = 50;

    public GenerateNumberArray() {
        random = new Random(System.currentTimeMillis());
    }

    @SuppressWarnings("unchecked")
    public int[] generate(int len) {
        if (len < 0) throw new IllegalArgumentException();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = random.nextInt(MAX);
        }
        return res;
    }
}
