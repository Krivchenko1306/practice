package test.practice6.part3;

import com.epam.kryvko.practice6.part3.Type;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmytro_Kryvko on 3/31/2016.
 */
public class TypeTest
{

    @Test
    public  void test()
    {
       Type string =  Type.valueOf("String");
        Assert.assertEquals(Type.String , string);
    }
    @Test
    public  void test2()
    {
        Assert.assertEquals("[a-zA-zа-яА-Я]{2,}" , Type.String.getRegex());
    }
}
