package com.epam.kryvko.practice3.part1.figures;

/**
 * Created by Dmytro_Kryvko on 3/24/2016.
 */
public class Circle extends Figure {

    private double radius;

    private double x;

    private double y;


    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String name()
    {
        return String.format("Circle x = %f , y=%f , radius=%f"  , x , y , radius);
    }

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
