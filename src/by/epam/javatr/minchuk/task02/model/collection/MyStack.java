package by.epam.javatr.minchuk.task02.model.collection;

/**
 * Class {@code MyStack}
 *
 * @autor Oksana Minchuk
 * @version 1.0 15.03.2019
 */

public interface MyStack<E> extends MyCollection<E> {

    /**
     * Pushes an element onto the stack.
     * Pushes an item onto the top of this stack.
     *
     * @param e the element to push
     */
    void push(E e);

    /**
     * Pops an element from the stack.
     * Removes and returns the first element
     *
     * @return the element at the front (which is the top of the stack)
     */
    E pop() throws MyCollectionException;

    /**
     * Retrieves, but does not remove, the head of the stack.
     *
     * @return the head of the stack
     *
     */
    E peek() throws MyCollectionException;

}
