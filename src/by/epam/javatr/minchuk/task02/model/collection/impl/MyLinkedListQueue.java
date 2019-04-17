package by.epam.javatr.minchuk.task02.model.collection.impl;

import by.epam.javatr.minchuk.task02.model.collection.MyQueue;

public class MyLinkedListQueue<E> extends MyLinkedList<E> implements MyQueue<E> {

    public MyLinkedListQueue() {
    }

    /**
     * Retrieves, but does not remove, the head of this queue
     *
     * @return the head of this queue
     */
    @Override
    public E element() {
        return first.get();
    }

    /**
     * Retrieves and removes the head of this queue
     *
     * @return the head of this queue
     */
    @Override
    public E remove() {
        E currentItem = first.get();
        Node<E> nextNode = first.next();
        if (nextNode != null) {
            E nextItem = nextNode.get();
            Node<E> newNextNode = nextNode.next();
            first = new Node<E>(null, nextItem, newNextNode);
        } else {
            first = null;
        }
        size--;
        return currentItem;
    }
}
