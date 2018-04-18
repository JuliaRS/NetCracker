package com.company;

/**
 * Created by 228-1 on 17.04.2018.
 */
interface ILinkedList<E> extends Iterable {
    public void add(E element);
    public void add(int index, E element);
    public void clear();
    public E get(int index);
    public int indexOf(E element);
    public E remove(int index);
    public E set(int index, E element);
    public int size();
    public E[] toArray();
    public String toString();
}
