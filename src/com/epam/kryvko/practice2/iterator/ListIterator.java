package com.epam.kryvko.practice2.iterator;

import java.util.Iterator;

/**
 * Created by Dmytro_Kryvko on 3/22/2016.
 */
public interface ListIterator extends Iterator<Object>
{
    boolean hasPrevious();
    Object previous();
    void set(Object e);
    void remove();
}