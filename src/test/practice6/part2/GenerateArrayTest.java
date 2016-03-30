package test.practice6.part2;

import com.epam.kryvko.practice6.part2.GenerateNumberArray;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Ghost on 30.03.2016.
 */


public class GenerateArrayTest {

    @Test
    public void test1()
    {
        GenerateNumberArray generate = new GenerateNumberArray();
        int[] test = generate.generate(5);
        assertEquals(5 ,test.length);
    }


    @Test(expected = IllegalArgumentException.class )
    public void test2()
    {
            GenerateNumberArray generate = new GenerateNumberArray();
            int[] test = generate.generate(-1);
    }

    @Test
    public void test3()
    {
        GenerateNumberArray generate = new GenerateNumberArray();
        int[] test = generate.generate(0);
        assertEquals(0 ,test.length);
    }

}
