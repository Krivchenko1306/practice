package test.practice6.part3;

import com.epam.kryvko.practice6.part3.Type;
import com.epam.kryvko.practice6.part3.TypeMatcher;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmytro_Kryvko on 3/31/2016.
 */
public class TypeMatcherTest
{
    @Test
    public  void test1()
    {
        TypeMatcher matcher = new TypeMatcher("1 ,     343.5  32   rsfhdtgt 5");
        Assert.assertEquals("1 32 5 ", matcher.match(Type.Int));
    }

    @Test
    public  void test2()
    {
        TypeMatcher matcher = new TypeMatcher("1 z    343.5  f 32   rsfhdtgt f 5");
        Assert.assertEquals("z f f ", matcher.match(Type.Char));
    }

    @Test
    public  void test3()
    {
        TypeMatcher matcher = new TypeMatcher("1 ,  1.   343.5  32   rsfhdtgt .5");
        Assert.assertEquals("1. 343.5 .5 ", matcher.match(Type.Double));
    }

    @Test
    public  void test4()
    {
        TypeMatcher matcher = new TypeMatcher("1 ,  awgshrds   343.5  32   rsfhdtgt 5");
        Assert.assertEquals("awgshrds rsfhdtgt ", matcher.match(Type.String));
    }
    @Test
    public  void test5()
    {
        TypeMatcher matcher = new TypeMatcher("1 ,     343.5  32   rsfhdtgt 5");
        Assert.assertEquals("", matcher.match(Type.NoType));
    }

}
