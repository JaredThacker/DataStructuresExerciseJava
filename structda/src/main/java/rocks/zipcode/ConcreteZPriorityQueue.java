package rocks.zipcode;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class ConcreteZPriorityQueue<E> implements ZPriorityQueue<E>{

    public static class QueueItem<T> {
        T item;
        Integer priority;

        public QueueItem(T item, Integer priority) {
            this.item = item;
            this.priority = priority;
        }
    }

    ArrayDeque<QueueItem<E>> zPriorityQueue = new ArrayDeque<>();

    @Override
    public void enqueue(E element, Integer priority) {
        QueueItem<E> priorityQueueItem = new QueueItem<>(element, priority);
        zPriorityQueue.offer(priorityQueueItem);
    }

    @Override
    public E dequeue(Integer priority) {
        QueueItem<E> removedItem = null;
        for (QueueItem<E> eachItem : zPriorityQueue) {
            if (eachItem.priority.equals(priority)) {
                zPriorityQueue.remove(eachItem);
                removedItem = eachItem;
                break;
            }
        }
        if (removedItem == null) {
            throw new NoSuchElementException("No element exists");
        }
        return removedItem.item;
    }

    @Override
    public E peek(Integer priority) {
        for (QueueItem<E> eachItem : zPriorityQueue) {
            if (eachItem.priority.equals(priority)) {
                return eachItem.item;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return zPriorityQueue.size();
    }

    @Override
    public int size(Integer priority) {
        int count = 0;
        for (QueueItem<E> eachItem : zPriorityQueue) {
            if (eachItem.priority.equals(priority)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return zPriorityQueue.isEmpty();
    }

}
