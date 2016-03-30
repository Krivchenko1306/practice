package com.epam.kryvko.practice4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ghost on 26.03.2016.
 */
public class Student
{
   private String name;

   private List<Mark> marks;

    public Student()
    {
        marks = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }

    public  void  addMark(Mark mark)
    {
        this.marks.add(mark);
    }

    public  void removeMark(Mark mark)
    {
        this.marks.remove(mark);
    }

}
