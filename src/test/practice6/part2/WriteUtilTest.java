package test.practice6.part2;

import com.epam.kryvko.practice6.part2.ReaderUtil;
import com.epam.kryvko.practice6.part2.StringAppendUtil;
import com.epam.kryvko.practice6.part2.WriteUtil;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Ghost on 30.03.2016.
 */
public class WriteUtilTest {
    private static int[] array = new int[]{5, 300, 34, 6, 7, 4, 100, 200};
    private static Integer[] array2 = new Integer[]{356, 21, 345, 23, 6};

    @BeforeClass
    public static void before() throws IOException {
            File file1 = new File("./test.txt");
            File file2 = new File("./test2.txt");
            file1.createNewFile();
            file2.createNewFile();
    }

    @Test
    public void test1() throws IOException
    {
        WriteUtil writeUtil = new WriteUtil();
        writeUtil.write(array , "./test.txt");
        List<Integer> res = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("./test.txt"),"UTF-8")))
        {
            Pattern pattern = Pattern.compile("\\d+");
            for(String line = null;  (line = reader.readLine()) != null ; )
            {

                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    res.add(Integer.parseInt(matcher.group()));
                }
            }
        }
        assertArrayEquals(array,res.stream().mapToInt(i -> i).toArray());

    }

    @Test
    public void test2() throws IOException
    {
        WriteUtil writeUtil = new WriteUtil();
        writeUtil.write(array2 , "./test.txt");
        List<Integer> res = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("./test.txt"),"UTF-8")))
        {
            Pattern pattern = Pattern.compile("\\d+");
            for(String line = null;  (line = reader.readLine()) != null ; )
            {

                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    res.add(Integer.parseInt(matcher.group()));
                }
            }
        }
        assertArrayEquals(array2, res.toArray(new Integer[res.size()]));
    }



    @AfterClass
    public static void after() {
            File file = new File("./test.txt");
            File file2 = new File("./test2.txt");
            file.delete();
            file2.delete();
    }
}
