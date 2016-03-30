package com.epam.kryvko.practice2.lists;

import com.epam.kryvko.practice2.iterator.ListIterable;
import com.epam.kryvko.practice2.iterator.ListIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Dmytro_Kryvko on 3/22/2016.
 */
public class SimpleMyList implements MyList, ListIterable {

    private Object[] list;

    private int capacity;

    private int size = 0;


    private static final int DEFAULT_CAPACITY = 10;


    public SimpleMyList() {
        this(DEFAULT_CAPACITY);
    }


    public SimpleMyList(int capacity) {
        this.list = new Object[capacity];
        this.capacity = capacity;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('{');
        for (Object item : this) {
            builder.append('[')
                    .append(item)
                    .append(']')
                    .append(new char[]{',', ' '});
        }
        builder.delete(builder.length() - 2, builder.length());
        builder.append('}');
        return builder.toString();
    }

    private void addCapacity(int grow) {
        Object[] temp = new Object[this.list.length + grow];
        System.arraycopy(this.list, 0, temp, 0, this.list.length);
        capacity = temp.length;
        this.list = temp;
    }


    @Override
    public void add(Object e) {
        if (size == list.length) {
            addCapacity(size * 4 / 3);
        }
        this.list[size] = e;
        size++;
    }

    @Override
    public void clear() {
        this.list = new Object[size];
        size = 0;
    }

    @Override
    public boolean remove(Object o) {
        if (o != null) {
            for (int i = 0; i < size; i++) {
                if (o.equals(list[i])) {
                    return remove(i);
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (list[i] == null) {
                    return remove(i);
                }
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        return list.clone();
    }

    @Override
    public int size() {
        return size;
    }


    private boolean remove(int pos) {
        System.arraycopy(list, pos + 1, list, pos, size - pos - 1);
        list[size] = null;
        size--;
        return true;
    }


    public void set(Object e, int pos) {
        this.list[pos] = e;
    }


    @Override
    public boolean contains(Object o) {
        if (o != null) {
            for (int i = 0; i < size; i++) {
                if (o.equals(list[i])) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (list[i] == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(MyList c) {
        for (Object item : c) {
            if (!contains(item)) return false;
        }
        return true;
    }

    @Override
    public Iterator<Object> iterator() {
        return new IteratorImpl();
    }

    @Override
    public ListIterator listIterator() {
        return new ListIteratorImpl();
    }


    private class ListIteratorImpl extends IteratorImpl implements ListIterator {

        @Override
        public boolean hasPrevious() {
            return current > 0 && current <= SimpleMyList.this.size;
        }

        @Override
        public Object previous() {
            if (current < 0 && current >= SimpleMyList.this.size) throw new NoSuchElementException();
            current--;
            lastRect = current;
            return SimpleMyList.this.list[current];
        }


        @Override
        @SuppressWarnings("unchecked")
        public void set(Object o) {
            if (lastRect < 0 && lastRect > SimpleMyList.this.size()) throw new IllegalStateException();
            if (current < 0 || current > SimpleMyList.this.size) throw new NoSuchElementException();
            SimpleMyList.this.set(o, lastRect);
            lastRect = -1;
        }

    }


    private class IteratorImpl implements Iterator<Object> {

        int current = 0;

        int lastRect = -1;

        @Override
        public boolean hasNext() {
            return current < SimpleMyList.this.size;
        }

        @Override
        @SuppressWarnings("unchecked")
        public Object next() {
            if (current > SimpleMyList.this.size) throw new NoSuchElementException();
            lastRect = current;
            return SimpleMyList.this.list[current++];
        }

        @Override
        @SuppressWarnings("unchecked")
        public void remove() {
            if (lastRect < 0) throw new IllegalStateException();
            if (current < 1 || current > SimpleMyList.this.size) throw new NoSuchElementException();
            SimpleMyList.this.remove(lastRect);
            lastRect = -1;
            current--;
        }
    }
}