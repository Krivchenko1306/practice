package com.epam.kryvko.practice3.part1;

import com.epam.kryvko.practice3.part1.figures.Figure;

import java.util.NoSuchElementException;

/**
 * Created by Dmytro_Kryvko on 3/24/2016.
 */
public class Desc
{
    private Figure[] figures;

    private static final int DEFAULT_CAPACITY = 10;

    private  int size;

    public Desc()
    {
        this.size = 0;
        this.figures = new Figure[DEFAULT_CAPACITY];
    }


    public double area()
    {
        double sum = 0;
        for(int i = 0; i< size; i++)
        {
            sum+= figures[i].area();
        }
        return sum;
    }
    public void move(double dx, double dy)
    {
        for(int i = 0; i< size; i++)
        {
            figures[i].move(dx , dy);
        }
    }
    public void printNames()
    {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i< size; i++)
        {
            builder.append(figures[i].name()).append('\n');
        }
        System.out.println(builder.toString());
    }

    public void add(Figure f)
    {
        if(size == figures.length) addCapacity(size *3/4);
        figures[size++] = f;
    }

    private  void addCapacity(int capacity)
    {
        Figure[] temp  =  new Figure[size+capacity];
        System.arraycopy(figures, 0 ,temp, 0 , size);
        this.figures =temp;
    }

    @SuppressWarnings("unchecked")
    public void remove(int index)
    {
        if(index < 0 || index > size) throw  new NoSuchElementException();
        System.arraycopy(figures, index+1 ,figures, index , size - index-1);
        figures[size] = null;
        this.size--;
    }

    public void add(Desc d)
    {
        if(d.size + this.size > figures.length) addCapacity(d.size + this.size - figures.length);
        System.arraycopy(this.figures , size , d.figures , 0 , d.size);
    }


}
