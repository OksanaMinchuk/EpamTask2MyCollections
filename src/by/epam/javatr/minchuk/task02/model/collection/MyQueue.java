package by.epam.javatr.minchuk.task02.model.collection;

/**
 * Class {@code MyQueue}
 *
 * @autor Oksana Minchuk
 * @version 1.0 15.03.2019
 */

public interface MyQueue<E> extends MyCollection<E> {

    /**
     * Retrieves, but does not remove, the head of this queue.
     *
     * @return the head of this queue or null if queue is empty
     */
    E element();

    /**
     * Retrieves and removes the head of this queue.
     *
     * @return the head of this queue or null if queue is empty
     */
    E remove();

}
