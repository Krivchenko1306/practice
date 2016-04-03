package com.epam.kryvko.practice3.part1;

import com.epam.kryvko.practice3.part1.figures.Circle;
import com.epam.kryvko.practice3.part1.figures.Figure;
import com.epam.kryvko.practice3.part1.figures.Rectangle;
import com.epam.kryvko.practice3.part1.figures.Square;

public class Demo {


    private Demo() {
    }


    public static void main(String[] args)
    {
        Figure circle = new Circle(2, 2, 2);
        Figure rectangle = new Rectangle(3, 3, 3, 3);
        Figure square = new Square(4, 4, 4);
        Desc container = new Desc();

        container.add(circle);
        container.add(rectangle);
        container.add(square);
        double dx =3.2 ,dy = 5.6;
        container.move(dx ,dy);
        System.out.printf("move x =%f  , y=%f \n" ,dx ,dy );
        container.printNames();


        System.out.println("area = "+container.area());

        container.move(3, 3);

        System.out.println("area = "+container.area());
        container.printNames();

        System.out.println("remove idx = 2");
        container.remove(2);
        container.printNames();

        System.out.println();
        System.out.println("remove idx = 2");
        try {
            container.remove(2);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index 2 is out of bounds");
        }
        container.printNames();

        System.out.println();
        System.out.println("remove idx = 0");
        container.remove(0);
        container.printNames();

    }
}
