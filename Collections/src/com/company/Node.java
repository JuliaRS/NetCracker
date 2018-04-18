package com.company;

/**
 * Created by 228-1 on 17.04.2018.
 */
public class Node<E> {
    private E element;
    private Node nextNode;

    public Node(){
       element = null;
       nextNode = null;
    }

    public Node(E element,Node nextNode){
        this.element = element;
        this.nextNode = nextNode;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public E getElement() {
        return element;
    }

    public Node getNextNode() {
        return nextNode;
    }
}
