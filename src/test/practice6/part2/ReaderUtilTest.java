package test.practice6.part2;

import com.epam.kryvko.practice6.part2.ReaderUtil;
import com.epam.kryvko.practice6.part2.StringAppendUtil;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

import java.io.*;
import java.util.Arrays;

/**
 * Created by Ghost on 30.03.2016.
 */
public class ReaderUtilTest {

    private static Integer[] array = new Integer[]{5, 300, 34, 6, 7, 4, 100, 200};
    private static Integer[] array2 = new Integer[]{356, 21, 345, 23, 6};

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
        writer1.write(util.append(array));
        writer2.write(util.append(array2));
        writer1.close();
        writer2.close();
    }

    @Test
    public void test1() throws IOException {
        ReaderUtil util = new ReaderUtil();
        Integer[] ar = util.readArray("./test.txt");
        assertArrayEquals(array, ar);

    }

    @Test
    public void test2() throws IOException {
        ReaderUtil util = new ReaderUtil();
        Integer[] ar = util.readArray("./test2.txt");
        assertArrayEquals(array2, ar);

    }

    @Test(expected = FileNotFoundException.class)
    public void test3() throws IOException {
            ReaderUtil readerUtil = new ReaderUtil();
            readerUtil.readArray(UUID.randomUUID().toString());
    }


    @AfterClass
    public static void after() {
        File file = new File("./test.txt");
        File file2 = new File("./test2.txt");
        file.delete();
        file2.delete();
    }
}
