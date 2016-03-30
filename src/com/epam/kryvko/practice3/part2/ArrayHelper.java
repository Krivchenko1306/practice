package com.epam.kryvko.practice3.part2;

import java.util.NoSuchElementException;

/**
 * Created by Dmytro_Kryvko on 3/24/2016.
 */
public class ArrayHelper
{
    public static Iterator iterator(final Object[] ar)
    {
        return  new Iterator() {

            private  int current =  0;

            @Override
            public void moveToStart()
            {
                current = 0;
            }

            @Override
            public void moveToEnd()
            {
                current = ar.length;
            }

            @Override
            public boolean hasNext() {
                return current < ar.length;
            }

            @Override
            public boolean hasPrevious() {
                return current > 0 ;
            }

            @Override
            public Object next() {
                if(ar.length == current) throw  new NoSuchElementException();
                return ar[current++];
            }

            @Override
            public Object previous() {
                if(current <= 0) throw  new NoSuchElementException();
                return ar[--current];
            }
        };

    }
}
