package test.practice6.part3;

import com.epam.kryvko.practice6.part3.Type;
import com.epam.kryvko.practice6.part3.TypeFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmytro_Kryvko on 3/31/2016.
 */
public class TypeFactoryTest {

    @Test
    public  void test1()
    {
        TypeFactory factory = new TypeFactory();
        Assert.assertEquals(Type.String, TypeFactory.getType("String"));
    }

    @Test
    public  void test2()
    {
        TypeFactory factory = new TypeFactory();
        Assert.assertEquals(Type.Int, TypeFactory.getType("int"));
    }
    @Test
    public  void test3()
    {
        TypeFactory factory = new TypeFactory();
        Assert.assertEquals(Type.Double, TypeFactory.getType("double"));
    }
    @Test
    public  void test4()
    {
        TypeFactory factory = new TypeFactory();
        Assert.assertEquals(Type.Char, TypeFactory.getType("char"));
    }
    @Test
    public  void test5()
    {
        TypeFactory factory = new TypeFactory();
        Assert.assertEquals(Type.NoType, TypeFactory.getType("ashbkdfgbd"));
    }
}
