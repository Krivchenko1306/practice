package com.epam.kryvko.practice4;

/**
 * Created by Ghost on 27.03.2016.
 */
public class CorrelationResult
{
   private static  final  String INFO_MSG = "%s;%s:%f";

   private   Student student1;

   private   Student student2;

   private   float coefficient;

    public Student getStudent1() {
        return student1;
    }

    public void setStudent1(Student student1) {
        this.student1 = student1;
    }

    public Student getStudent2() {
        return student2;
    }

    public void setStudent2(Student student2) {
        this.student2 = student2;
    }

    public float getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public String toString() {
        return String.format(INFO_MSG , student1.getName() , student2.getName() , coefficient);
    }
}
