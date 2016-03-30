package com.epam.kryvko.practice5.part1.converter4;



import java.util.Random;

/**
 * Created by Dmytro_Kryvko on 3/28/2016.
 */
public class GeneratePassword
{
    private Random random ;

    public GeneratePassword()
    {
        random= new Random(System.currentTimeMillis());
    }

    public String generate()
    {
       return  String.valueOf(9999 - random.nextInt(8999));
    }
}
