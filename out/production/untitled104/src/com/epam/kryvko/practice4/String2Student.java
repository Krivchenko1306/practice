package com.epam.kryvko.practice4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ghost on 26.03.2016.
 */
public class String2Student implements Converter<String , List<Student>>{

    private static final Pattern pattern =Pattern.compile("([a-zA-z\\s]+);(((\\d*)(;|$))+)");

    @Override
    public List<Student> convert(String sr) {
        List<Student> res = new ArrayList<>();
        Matcher matcher = pattern.matcher(sr);
        while (matcher.find())
        {
            Student student = new Student();
            student.setName(matcher.group(1));
            String markGroup = matcher.group(2);
            String[] marks = markGroup.split(";{1,}");
            for(int i =0; i < marks.length;i++)
            {
                if(marks[i].isEmpty()) continue;
                int mr = Integer.parseInt(marks[i]);
                Mark mark = new Mark();
                mark.setMark(mr);
                mark.setNumber(1);
                student.addMark(mark);
            }
            res.add(student);
        }
        return res;
    }
}
