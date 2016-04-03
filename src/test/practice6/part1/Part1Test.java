package test.practice6.part1;

import com.epam.kryvko.practice6.part1.Part1;
import com.epam.kryvko.practice6.part2.StringAppendUtil;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/**
 * Created by Dmytro_Kryvko on 3/31/2016.
 */
public class Part1Test
{
    @BeforeClass
    public static void before() throws IOException {
        File file = new File("./test.txt");
        File file2 = new File("./test2.txt");
        File res = new File("./res.txt");
        File res2 = new File("./res2.txt");
        file.createNewFile();
        file2.createNewFile();
        res.createNewFile();
        res2.createNewFile();
    }


    @AfterClass
    public static void after() {
        File file = new File("./test.txt");
        File file2 = new File("./test2.txt");
        File res = new File("./res.txt");
        File res2 = new File("./res2.txt");
        file.delete();
        file2.delete();
        res.delete();
        res2.delete();
    }

    @Test
    public  void test1() throws IOException {
        String testString  = "When I was younger, so much younger than today.";
        BufferedWriter textWritter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./test.txt"), "UTF-8"));
        textWritter.write(testString);
        textWritter.close();
        PrintStream writer = new PrintStream(new FileOutputStream("./res.txt"));
        PrintStream console = System.out;
        System.setOut(writer);
        Part1.main(new String[]{"./test.txt"});
        writer.flush();
        writer.close();
        System.setOut(console);
        String expected = "WHEN I was YOUNGER, so MUCH YOUNGER THAN TODAY.";
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("./res.txt") , "UTF-8"));
        String res = reader.readLine();
        Assert.assertEquals(expected , res);
    }
    @Test
    public  void test2() throws IOException {
        String testString  = "When I was younger, so much younger than today.";
        BufferedWriter textWritter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./test.txt"), "UTF-8"));
        textWritter.write(testString);
        textWritter.close();
        PrintStream writer = new PrintStream(new FileOutputStream("./res.txt"));
        PrintStream console = System.out;
        System.setOut(writer);
        Part1.main(new String[]{"./test.txt"});
        writer.flush();
        writer.close();
        System.setOut(console);
        String expected = "WHEN I was YOUNGER, so MUCH YOUNGER THAN TODAY.";
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("./res.txt") , "UTF-8"));
        String res = reader.readLine();
        Assert.assertEquals(expected , res);
    }

    @Test
    public  void test3() throws IOException {
        PrintStream writer = new PrintStream(new FileOutputStream("./res.txt"));
        PrintStream console = System.out;
        System.setOut(writer);
        Part1.main(new String[]{UUID.randomUUID().toString()});
        writer.flush();
        writer.close();
        System.setOut(console);
        String expected = "i/o error";
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("./res.txt") , "UTF-8"));
        String res = reader.readLine();
        Assert.assertEquals(expected , res);
        reader.close();
    }

    @Test
    public void test4() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Part1> part1Class = Part1.class;
        Constructor<?>[] constructors = part1Class.getDeclaredConstructors();
        for(Constructor constructor : constructors)
        {
                constructor.setAccessible(true);
                constructor.newInstance();
        }
    }

}
