package com.epam.kryvko.practice6.part2;

import java.io.*;

/**
 * Created by Dmytro_Kryvko on 3/29/2016.
 */
public class WriteUtil {
    private static final String ENCODING = "UTF-8";


    private static final String IO_ERROR_MSG = "i/o error";

    public void write(int[] array, String filename) throws IOException {
        try (BufferedWriter writer =
                     new BufferedWriter(
                             new OutputStreamWriter(new FileOutputStream(filename), ENCODING))) {
            StringAppendUtil util = new StringAppendUtil();
            writer.write(util.append(array));
        }
    }

    public void write(Integer[] array, String filename) throws IOException {
        try (BufferedWriter writer =
                     new BufferedWriter(
                             new OutputStreamWriter(new FileOutputStream(filename), ENCODING))) {
            StringAppendUtil util = new StringAppendUtil();
            writer.write(util.append(array));
        }

    }
}