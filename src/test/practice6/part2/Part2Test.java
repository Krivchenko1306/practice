package test.practice6.part2;

import com.epam.kryvko.practice6.part2.Part2;
import com.epam.kryvko.practice6.part2.ReaderUtil;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ghost on 03.04.2016.
 */
public class Part2Test
{
    @BeforeClass
    public static void before() throws IOException {
        File file = new File("./res11.txt");
        File file2 = new File("./res12.txt");
        file.createNewFile();
        file2.createNewFile();

    }


    @AfterClass
    public static void after() {
        File file = new File("./res11.txt");
        File file2 = new File("./res12.txt");
        file.delete();
        file2.delete();
    }

    @Test
    public  void test1() throws IOException {
        Part2.main(new String[]{"./res11.txt", "./res12.txt"});
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("./res11.txt") , "UTF-8"));
        String res = reader.readLine();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(res);
        int count = 0;
        for(;matcher.find();)
        {
            count++;
        }
        Assert.assertTrue(count == 10);
        ReaderUtil readerUtil = new ReaderUtil();
        Integer[] array= readerUtil.readArray("./res12.txt");
        for(int i = 1; i < array.length; i++)
        {
            Assert.assertTrue(array[i] >= array[i-1]);
        }
        reader.close();
    }

    @Test
    public void test2() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Part2> part1Class = Part2.class;
        Constructor<?>[] constructors = part1Class.getDeclaredConstructors();
        for(Constructor constructor : constructors)
        {
            constructor.setAccessible(true);
            constructor.newInstance();
        }
    }

}
