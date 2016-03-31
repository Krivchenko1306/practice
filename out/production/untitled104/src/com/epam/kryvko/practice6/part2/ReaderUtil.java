package com.epam.kryvko.practice6.part2;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dmytro_Kryvko on 3/29/2016.
 */
public class ReaderUtil {
    private static final String ENCODING = "UTF-8";

    private static final String FILE_NOT_FOUND_MSG = "Файл не найден";

    private static final String IO_ERROR_MSG = "i/o error";


    public Integer[] readArray(String filename) throws IOException {
        List<Integer> res = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename), ENCODING))) {
            Pattern pattern = Pattern.compile("\\d+");
            for (String line = null; (line = reader.readLine()) != null; ) {

                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    res.add(Integer.parseInt(matcher.group()));
                }
            }
        }
        return res.toArray(new Integer[res.size()]);
    }


}
