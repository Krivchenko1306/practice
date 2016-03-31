package test.practice6.part3;

import com.epam.kryvko.practice6.part2.StringAppendUtil;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;

/**
 * Created by Dmytro_Kryvko on 3/31/2016.
 */
public class ReadDataUtilTest
{
    @BeforeClass
    public static void before() throws IOException {
        BufferedWriter writer1 = null;
        BufferedWriter writer2 = null;
        File file1 = new File("./test.txt");
        File file2 = new File("./test2.txt");
        file1.createNewFile();
        file2.createNewFile();
        writer1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./test.txt"), "UTF-8"));
        writer2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./test2.txt"), "UTF-8"));
        StringAppendUtil util = new StringAppendUtil();
        writer1.close();
        writer2.close();
    }


    @Test
    public  void test1(){}

    @Test
    public  void test2(){}

    @Test
    public  void test3(){}

    @Test
    public  void test4(){}

    public  void test5(){}

    @AfterClass
    public static void after() {
        File file = new File("./test.txt");
        File file2 = new File("./test2.txt");
        file.delete();
        file2.delete();
    }

}
