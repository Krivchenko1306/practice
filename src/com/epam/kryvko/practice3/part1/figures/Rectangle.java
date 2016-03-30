package com.epam.kryvko.practice3.part1.figures;

/**
 * Created by Dmytro_Kryvko on 3/24/2016.
 */
public class Rectangle extends Figure {
    private double x;
    private double y;
    private double w;
    private double h;


    public Rectangle(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getW() {
        return w;
    }

    public double getH() {
        return h;
    }

    @Override
   public double area() {
        return 0;
    }

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String name() {
        return String.format("Rectangle x=%f , y=%f , w=%f , h=%f" , x ,y ,w ,h);
    }

}
