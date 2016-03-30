package com.epam.kryvko.practice3.part3;

import com.epam.kryvko.practice3.part1.figures.Figure;

import java.util.NoSuchElementException;

/**
 * Created by Dmytro_Kryvko on 3/24/2016.
 */
public class StackImpl implements  Stack
{
    private  Object[] items;

    private  int size =0;

    private static final int DEFAULT_CAPACITY = 10;



    public  StackImpl()
    {
        this.size = 0;
        items = new Object[DEFAULT_CAPACITY];
    }


    @Override
    public boolean empty() {
        return this.size == 0;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Object peek() {
        if(size == 0) throw new NoSuchElementException();
        return items[size-1];
    }

    @Override
    @SuppressWarnings("unchecked")
    public Object pop() {
        if(size == 0) throw new NoSuchElementException();
        Object res = items[size];
        items[size] = null;
        size--;
        return res;
    }

    @Override
    public Object push(Object o)
    {
        items[size++] = o;
        if(size == items.length)addCapacity(size * 3/4);
        return o;
    }
    private   void addCapacity(int capacity)
    {
        Object[] temp  =  new Object[size+capacity];
        System.arraycopy(items, 0 ,temp, 0 , size);
        this.items =temp;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for(int i =0 ; i < size; i++)
        {
            builder.append(items[i]);
            if(i != size -1) builder.append(',');
        }
        builder.append(']');
        return  builder.toString();

    }
}
