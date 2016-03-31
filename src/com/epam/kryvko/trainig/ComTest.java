package com.epam.kryvko.trainig;

import java.util.Comparator;

/**
 * Created by Dmytro_Kryvko on 3/31/2016.
 */
public class ComTest implements  Comparable<Integer> ,Comparator<Integer> {
    @Override
    public int compareTo(Integer o) {
        return 0;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return 0;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
