package com.epam.kryvko.practice6.part2;

import java.io.*;
import java.util.Arrays;

public class Part2 {


    private static final String FILE_NAME = "part2.txt";

    private static final String FILE_NAME2 = "part2_sorted.txt";

    private static final String IO_ERROR_MSG = "i/o error";

    private static final int LEN = 10;

    private Part2(){}

    public static void main(String[] args) {
        String filename;
        String filename2;
        if(args.length == 2)
        {
            filename = args[0];
            filename2 = args[1];
        }
        else{
            filename = FILE_NAME;
            filename2 = FILE_NAME2;
        }
        GenerateNumberArray generateNumberArray = new GenerateNumberArray();
        BubbleSorter<Integer> sorter = new BubbleSorter<Integer>();
        WriteUtil writeUtil = new WriteUtil();
        ReaderUtil readerUtil = new ReaderUtil();
        int[] array = generateNumberArray.generate(LEN);
        try {
            writeUtil.write(array, filename);
        } catch (IOException e) {
            System.out.println(IO_ERROR_MSG);
            return;
        }
        Integer[] array_sort = null;
        try {
            array_sort = readerUtil.readArray(FILE_NAME);
        } catch (IOException ex) {
            System.out.println(IO_ERROR_MSG);
            return;
        }
        sorter.sort(array_sort);
        try {
            writeUtil.write(array_sort, FILE_NAME2);
        } catch (IOException e) {
            System.out.println(IO_ERROR_MSG);
        }
    }

}