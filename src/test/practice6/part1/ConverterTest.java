package test.practice6.part1;

import com.epam.kryvko.practice6.Converter;
import com.epam.kryvko.practice6.part1.ConverterPart1;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Dmytro_Kryvko on 3/30/2016.
 */
public class ConverterTest
{
    @Test
    public void test()
    {
        String testString  = "When I was younger, so much younger than today.";
        String expected = "WHEN I was YOUNGER, so MUCH YOUNGER THAN TODAY.";
        ConverterPart1 converter = new ConverterPart1();
        String res = converter.convert(testString);
        assertEquals(expected, res);
    }

    @Test
    public void test2()
    {
        String testString  = "When";
        String expected = "WHEN";
        ConverterPart1 converter = new ConverterPart1();
        String res = converter.convert(testString);
        assertEquals(expected, res);
    }

    @Test
    public void test3()
    {
        String testString  = "When\nToday";
        String expected = "WHEN\nTODAY";
        ConverterPart1 converter = new ConverterPart1();
        String res = converter.convert(testString);
        assertEquals(expected, res);
    }

}
