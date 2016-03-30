package com.epam.kryvko.practice6.part2;

/**
 * Created by Dmytro_Kryvko on 3/29/2016.
 */
public class BubbleSorter<T extends Comparable> {

    public void sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].compareTo(array[j]) < 0) {
                    T temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

}
