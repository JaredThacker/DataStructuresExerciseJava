package rocks.zipcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class ZQueueImpl<E> implements ZQueue<E>{

    ArrayDeque<E> zQueue = new ArrayDeque<>();

    public ZQueueImpl() {
        this.zQueue = zQueue;
    }

    @Override
    public boolean isEmpty() {
        return zQueue.isEmpty();
    }

    @Override
    public int size() {
        return zQueue.size();
    }

    @Override
    public void enqueue(E element) {
        zQueue.add(element);
    }

    @Override
    public E dequeue() {
        return zQueue.remove();
    }

    @Override
    public E peek() {
        return zQueue.peek();
    }

}
