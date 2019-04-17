package by.epam.javatr.minchuk.task02.model.collection;

public class MyCollectionException extends Exception {

    public MyCollectionException() {
    }

    public MyCollectionException(String message) {
        super(message);
    }

    public MyCollectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyCollectionException(Throwable cause) {
        super(cause);
    }
}
