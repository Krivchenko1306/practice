package com.epam.kryvko.practice4;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo {

    private  static final String path = "info.csv";

    public static void main(String[] args)
    {
        int k = 5;
        List<Student> students = new ArrayList<Student>();
        String2Student converte  = new String2Student();
        List<CorrelationResult> results = new ArrayList<>();
        CorrelationCoefficientUtil util = new CorrelationCoefficientUtil();
        StringBuilder builder = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(path)))
        {
            String line = null;
            while ( (line = reader.readLine()) != null)
            {
                builder.append(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        students = converte.convert(builder.toString());
        for(int i = 0; i < students.size(); i++)
        {
            for(int j = i; j < students.size(); j++)
            {
                results.add(util.calculate(students.get(i) , students.get(j)));
            }
        }
        results.sort(new Comparator<CorrelationResult>() {
            @Override
            public int compare(CorrelationResult o1, CorrelationResult o2) {
                return 0;
            }
        });
        for(int i =0 ; i < results.size(); i++)
        {
            System.out.println(i + ":"+results.get(i));
        }
    }
}
