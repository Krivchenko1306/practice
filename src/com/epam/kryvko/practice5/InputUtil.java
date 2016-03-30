package com.epam.kryvko.practice5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Dmytro_Kryvko on 3/28/2016.
 */
public class InputUtil
{
        public static String getInput(String fileName) {
            StringBuilder sb = new StringBuilder();
            try {
                Scanner scanner = new Scanner(new File(fileName), "UTF-8");
                while (scanner.hasNextLine()) {
                    sb.append(scanner.nextLine()).append(System.lineSeparator());
                }
                return sb.toString().trim();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            return sb.toString();
        }
}
