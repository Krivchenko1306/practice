package com.epam.kryvko.practice3.part1.figures;

/**
 * Created by Dmytro_Kryvko on 3/24/2016.
 */
public abstract class Figure {
    public abstract double area();

    public abstract void move(double dx, double dy);

    public String name() {
        return "Figure";
    }

}
