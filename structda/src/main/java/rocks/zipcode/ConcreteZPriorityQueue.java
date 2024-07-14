package rocks.zipcode;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ConcreteZPriorityQueue<E> implements ZPriorityQueue<E>{

    PriorityQueue<E> zPriorityQueue = new PriorityQueue<>();

    @Override
    public void enqueue(E element, Integer priority) {
        zPriorityQueue.add(element);
    }

    @Override
    public E dequeue(Integer priority) {
       return zPriorityQueue.remove();
    }

    @Override
    public E peek(Integer priority) {
        return zPriorityQueue.peek();
    }

    @Override
    public int size() {
        return zPriorityQueue.size();
    }

    @Override
    public int size(Integer priority) {
        return zPriorityQueue.size();
    }

    @Override
    public boolean isEmpty() {
        return zPriorityQueue.isEmpty();
    }

}
