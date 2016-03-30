package com.epam.kryvko.practice6.part2;

/**
 * Created by Dmytro_Kryvko on 3/29/2016.
 */
public class StringAppendUtil
{
    public String append(int[] array)
    {
        StringBuilder builder = new StringBuilder();
        for(int i =0 ; i < array.length ; i++)
        {
            builder.append(array[i]).append(' ');
        }
        return builder.toString();
    }

    public String append(Object[] array)
    {
        StringBuilder builder = new StringBuilder();
        for(int i =0 ; i < array.length ; i++)
        {
            builder.append(array[i]).append(' ');
        }
        return builder.toString();
    }
}
