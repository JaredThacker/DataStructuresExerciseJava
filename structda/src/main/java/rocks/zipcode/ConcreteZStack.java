package rocks.zipcode;

import java.util.ArrayDeque;

public class ConcreteZStack<E> implements ZStack<E>{

    ArrayDeque<E> zStack = new ArrayDeque<>();

    @Override
    public void push(E item) {
        zStack.push(item);
    }

    @Override
    public E pop() {
        return zStack.pop();
    }

    @Override
    public E peek() {
        return zStack.peek();
    }

    @Override
    public boolean isEmpty() {
        return zStack.isEmpty();
    }

    @Override
    public int size() {
        return zStack.size();
    }

}
