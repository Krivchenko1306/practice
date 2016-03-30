package test.practice6.part2;

import com.epam.kryvko.practice6.part2.GenerateNumberArray;
import com.epam.kryvko.practice6.part2.StringAppendUtil;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ghost on 30.03.2016.
 */
public class StringAppendUtilTest
{

    @Test
    public void test1()
    {
       StringAppendUtil util = new StringAppendUtil();
        int[] ar = new int[]{1,2,3,4,5};
        String res = util.append(ar);
        assertEquals("1 2 3 4 5 ",res);
    }

    @Test
    public void test2()
    {
        StringAppendUtil util = new StringAppendUtil();
        String[] ar = new String[]{"agagda","agsdgs","edeghdhd","sgd"};
        String res = util.append(ar);
        assertEquals("agagda agsdgs edeghdhd sgd ",res);
    }

}
