package com.company;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 228-1 on 17.04.2018.
 */
public class MyLinkedList<E> implements ILinkedList {
    Node head;
    int size;

    @Override
    public void add(Object element) {
        Node node = new Node(element,null);
        Node currentNode= head;
        if (currentNode == null){
            head = node;
            size = 1;
            return;
        }
        while(currentNode.getNextNode()!=null)
            currentNode = currentNode.getNextNode();
        currentNode.setNextNode(node);
        size++;
    }

    @Override
    public void add(int index, Object element) {
         if(index<=0) return;
         if(size<index)
         {
             add(element);
             return;
         }
         if (index == 1){
             Node node = head;
             head = new Node(element,node);
             size++;
             return;
         }
         int i = 1;
         Node previousNode = null;
         Node currentNode = head;
         while(i!=index){
             i++;
             previousNode = currentNode;
             currentNode=currentNode.getNextNode();
         }
         Node node = new Node(element,currentNode);
         previousNode.setNextNode(node);
         size++;
    }

    @Override
    public void clear() {
        head = null;
        size =0;
    }

    @Override
    public Object get(int index) {
        if(index>size) return null;
        int i=1;
        Node node = head;
        while(i!=index){
            i++;
            node= node.getNextNode();
        }
        return node;
    }


    @Override
    public int indexOf(Object element) {
        Node node = head;
        int i= 1;
        while(node!=null && node.getElement()!=element)
        {
            node = node.getNextNode();
            i++;
        }
        if(node == null)
            return 0;
        else
            return i;
    }

    @Override
    public Object remove(int index) {
        if (index>size) return null;
        int i=1;
        Node node =head,
            previousNode = null;
        while(i!=index){
            previousNode = node;
            node = node.getNextNode();
            i++;
        }
        previousNode.setNextNode(node.getNextNode());
        size --;
        return node.getElement();
    }

    @Override
    public Object set(int index, Object element) {
        if (index>size) return null;
        int i=1;
        Node node =head,
                previousNode = null;
        while(i!=index){
            previousNode = node;
            node = node.getNextNode();
            i++;
        }
        Node newNode = new Node(element,node);
        previousNode.setNextNode(newNode);
        return element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        Object array[] = new Object[size];
        Node node = head;
        for(int i=0;i<size;i++)
        {
            array[i] = node.getElement();
            node = node.getNextNode();
        }
        return array;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
