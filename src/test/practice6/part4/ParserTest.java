package test.practice6.part4;

import com.epam.kryvko.practice6.part4.Parser;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import com.epam.kryvko.practice6.part4.Part4;

import java.io.*;
import java.util.UUID;

/**
 * Created by Dmytro_Kryvko on 3/31/2016.
 */
public class ParserTest
{
    private  static  String test1 = "ghedikthjboed nrfkdhnkfgd dgklnmfl. dmtflnkfmhgl dmntlnmfgl dtglnmrfl dtmnlkfm\nddfg bdfgnlfd.\naelgjsdohejtogddddsgtnd.";

    private static  String test2 = "";

    private static  String test3 = "ahfgdjtu5ejfykfykgfwshtfjhksen rfhokjd srljh dt nroshdkl32763274b 3496902";

    private static  String test4 = "nkrlsf lehtolrf elnetlh le neht ntn; srtg";

    @BeforeClass
    public static void before() throws IOException {
        File file1 = new File("./test.txt");
        File file2 = new File("./test2.txt");
        File file3 = new File("./test3.txt");
        File file4 = new File("./test4.txt");
        file1.createNewFile();
        file2.createNewFile();
        file3.createNewFile();
        file4.createNewFile();
        BufferedWriter writer1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./test.txt"), "UTF-8"));
        BufferedWriter writer2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./test2.txt"), "UTF-8"));
        BufferedWriter writer3 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./test3.txt"), "UTF-8"));
        BufferedWriter writer4 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./test4.txt"), "UTF-8"));
        writer1.write(test1);
        writer2.write(test2);
        writer3.write(test3);
        writer4.write(test4);
        writer1.close();
        writer2.close();
        writer3.close();
        writer4.close();
    }
    @Test
    public  void test1() throws IOException {
        Parser parser = new Parser("./test.txt" ,"UTF-8");
    }
    @Test
    public  void test2() throws IOException {
        Parser parser = new Parser("./test2.txt" ,"UTF-8");
        Assert.assertFalse(parser.iterator().hasNext());
    }
    @Test
    public  void test3() throws IOException {
        Parser parser = new Parser("./test3.txt" ,"UTF-8");
    }
    @Test
    public  void test4() throws IOException {
        Parser parser = new Parser("./test4.txt" ,"UTF-8");
    }
    @Test(expected = IOException.class)
    public  void test5() throws IOException {
        Parser parser = new Parser(UUID.randomUUID().toString() ,"UTF-8");
    }


    @AfterClass
    public static void after() {
        File file1 = new File("./test.txt");
        File file2 = new File("./test2.txt");
        File file3 = new File("./test3.txt");
        File file4 = new File("./test4.txt");
        file1.delete();
        file2.delete();
        file3.delete();
        file4.delete();
    }

}
