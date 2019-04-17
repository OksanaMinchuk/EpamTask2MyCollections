package by.epam.javatr.minchuk.task02.model.collection.impl;

import by.epam.javatr.minchuk.task02.model.collection.MyCollection;

public abstract class MyAbstractCollection<E> implements MyCollection<E> {

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

}
