package test.practice6.part2;

import com.epam.kryvko.practice6.part2.BubbleSorter;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Ghost on 30.03.2016.
 */
public class BubbleSorterTest
{
    @Test
    public void test1()
    {
        Integer[] test = new Integer[]{5 ,8 ,9, 3,200 ,4, 5,7,100};
        Integer[] exected = new Integer[]{3,4,5,5,7,8,9,100,200};
        BubbleSorter<Integer>  sorter = new BubbleSorter<>();
        sorter.sort(test);
        assertArrayEquals(exected ,test);
    }
    @Test
    public void test2()
    {
        Integer[] test = new Integer[]{};
        Integer[] exected = new Integer[]{};
        BubbleSorter<Integer>  sorter = new BubbleSorter<>();
        sorter.sort(test);
        assertArrayEquals(exected ,test);
    }
    @Test
    public void test3()
    {
        Integer[] exected = new Integer[]{1,2,3,4,5,6,7,8};
        Integer[] test = new Integer[]{8,7,6,5,4,3,2,1};
        BubbleSorter<Integer>  sorter = new BubbleSorter<>();
        sorter.sort(test);
        assertArrayEquals(exected ,test);
    }


}
