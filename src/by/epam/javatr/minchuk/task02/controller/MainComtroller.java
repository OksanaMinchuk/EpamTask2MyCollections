package by.epam.javatr.minchuk.task02.controller;

import by.epam.javatr.minchuk.task02.model.collection.MyCollectionException;
import by.epam.javatr.minchuk.task02.model.collection.MyQueue;
import by.epam.javatr.minchuk.task02.model.collection.MyStack;
import by.epam.javatr.minchuk.task02.model.collection.impl.*;

public class MainComtroller {
    public static void main(String[] args) {
        MyQueue queue = new MyArrayListQueue();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        queue.add("five");

//        System.out.println(queue.contains("one"));
//        System.out.println(queue.element());
//        System.out.println(queue.remove("one"));
//        System.out.println(queue.toString());
//        System.out.println(queue.remove());
//        System.out.println(queue.size());
//        System.out.println(queue);

        MyStack stack = new MyArrayListStack();
        stack.add("one");
        stack.add("two");
        stack.add("three");
        stack.add("four");
        stack.add("five");

        try {
            System.out.println(stack.size());
            System.out.println(stack.peek());
            System.out.println(stack.toString());
            System.out.println(stack.pop());
            System.out.println(stack.toString());
            System.out.println(stack.contains("two"));
        } catch (MyCollectionException e) {
            e.printStackTrace();
        }


        MyQueue linkedQueue = new MyLinkedListQueue();
        linkedQueue.add("one");
        linkedQueue.add("two");
        linkedQueue.add("three");
        linkedQueue.add("four");
        linkedQueue.add("five");

//        System.out.println(linkedQueue.contains("two"));
//        System.out.println(linkedQueue.remove("one"));
//        System.out.println(linkedQueue.element());
//        System.out.println(linkedQueue.remove());
//        System.out.println(linkedQueue);

    }
}
