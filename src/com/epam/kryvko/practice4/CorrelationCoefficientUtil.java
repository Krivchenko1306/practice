package com.epam.kryvko.practice4;

import java.util.List;

/**
 * Created by Ghost on 26.03.2016.
 */
public class CorrelationCoefficientUtil
{

    public  CorrelationResult calculate(Student st1 , Student st2)
    {
        CorrelationResult result = new CorrelationResult();
        result.setStudent1(st1);
        result.setStudent2(st2);
        int testCount =  st1.getMarkCount() > st2.getMarkCount()  ? st1.getMarkCount() : st1.getMarkCount();
        int[][] mark = getGenaral();
        int xAvg = avg(mark[0]);
        int yAvg = avg(mark[1]);
        int r = 0;
        float d = 0;
        for(int i = 0;  i < mark[0].length; i++)
        {
            int tempX = (mark[0][i] - xAvg);
            int tempY  = (mark[1][i] - yAvg);
            r += tempX * tempY;
            d +=  Math.sqrt(Math.pow(tempX , 2) *  Math.pow(tempY ,2));
        }
        result.setCoefficient(r/d);
        return result;
    }

    private  int avg(int[] array)
    {
        int sum = 0;
        for(int x : array)
        {
            sum+= x;
        }
        return  sum/array.length;
    }


    private  int[][] getGenaral()
    {
        return  null;
    }


}
