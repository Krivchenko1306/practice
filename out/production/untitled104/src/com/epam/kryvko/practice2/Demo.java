package com.epam.kryvko.practice2;

import com.epam.kryvko.practice2.iterator.ListIterator;
import com.epam.kryvko.practice2.lists.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dmytro_Kryvko on 3/22/2016.
 */
public class Demo {
    public static void main(String[] args) {
        SimpleMyList list = new SimpleMyList();
        list.add(1);
        list.add("gsfhsfh");
        list.add("adgadsg");
        list.add(null);
        list.add(5);


//        System.out.println(list.toString());
//        System.out.println(list.size());
//        System.out.println(list.contains(1));
//        System.out.println(list.remove(6));
//        System.out.println(list.toString());
//        System.out.println(list.contains(null));


        ListIterator it = list.listIterator();
//        it.set(6);


        for (Object item: list)
        {
            System.out.println(item);
        }



//        System.out.println("foreach");
        System.out.println(list);

        System.out.println("while");
        System.out.println(it.next());
        while (it.hasNext()) {
            it.remove();
            System.out.println(list);
            System.out.println(it.next());
        }


        System.out.println(list);
//        System.out.println(list.size());
//        while (it.hasPrevious())
//        {
//            System.out.println(it.previous());
//        }


//
//        MyList secondList =  new SimpleMyList();
//        secondList.add(1);
//        list.add("gsfhsfh");
//        list.add("adgadsg");
//        System.out.println(list.containsAll(secondList));

    }


}
