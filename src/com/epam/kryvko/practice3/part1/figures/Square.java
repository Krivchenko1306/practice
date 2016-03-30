package com.epam.kryvko.practice3.part1.figures;

/**
 * Created by Dmytro_Kryvko on 3/24/2016.
 */
public class Square extends Figure {

    private double a;

    private double x;

    private double y;

    public Square(double a, double x, double y) {
        this.a = a;
        this.x = x;
        this.y = y;
    }

    @Override
    public double area() {
        return Math.pow(a, 2);
    }

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String name()
    {
        return String.format("Square x=%f , y=%f , a=%f " , x ,y ,a);
    }

    public double getA() {
        return a;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
