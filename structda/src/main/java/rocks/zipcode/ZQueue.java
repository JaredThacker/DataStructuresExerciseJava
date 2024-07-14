package rocks.zipcode;

public interface ZQueue<T> {

    boolean isEmpty();
    
    int size();
    
    void enqueue(T element);
    
    T dequeue();
    
    T peek();
}

