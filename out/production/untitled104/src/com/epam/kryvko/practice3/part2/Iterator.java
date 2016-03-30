package com.epam.kryvko.practice3.part2;

/**
 * Created by Dmytro_Kryvko on 3/24/2016.
 */
 interface Iterator
{

    void moveToStart();

    void moveToEnd();

    boolean hasNext();

    boolean hasPrevious();

    Object next();

    Object previous();

}
