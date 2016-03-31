package com.epam.kryvko.practice6.part3;

import java.io.*;

/**
 * Created by Dmytro_Kryvko on 3/29/2016.
 */
public class ReadDataUtil {


    public String readData(String fileName, String encoding) throws IOException {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), encoding))) {
            StringBuilder builder = new StringBuilder();
            for (String line = null; (line = fileReader.readLine()) != null; ) {
                builder.append(line).append('\n');
            }
            if (builder.length() != 0) builder.deleteCharAt(builder.length() - 1);
            return builder.toString();
        }
    }
}
