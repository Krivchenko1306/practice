package com.epam.kryvko.practice2.lists;

/**
 * Created by Dmytro_Kryvko on 3/22/2016.
 */
public interface MyList extends Iterable<Object> {

    void add(Object e);

    void clear();

    boolean remove(Object o);

    Object[] toArray();

    int size();

    boolean contains(Object o);

    boolean containsAll(MyList c);
}
