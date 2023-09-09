package queue;

import java.util.*;

public class MyQueueList<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private T[] mass;
    private int size;

    public MyQueueList() {
        mass = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public T peek() {
        if (mass.length == 0) {
            return null;
        } else return mass[0];
    }

    public T poll() {
        T[] result = (T[]) new Object[1];
        if (mass.length == 0) {
            return null;
        } else {
            result[0] = mass[0];
            mass[0] = null;
            T[] tempMass = (T[]) new Object[mass.length - 1];
            int counter = 0;
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] != null) {
                    tempMass[counter] = mass[i];
                    counter++;
                }
            }
            System.arraycopy(Objects.requireNonNull(tempMass), 0, mass, 0, tempMass.length);
        }
        size--;
        return (T) result[0];
    }

    public void add(T value) {
        if (size >= mass.length) {
            //increase array length
            T[] tempMass = mass;
            mass = (T[]) new Object[(int) (mass.length + (mass.length * 0.5))];
            System.arraycopy(tempMass, 0, mass, 0, tempMass.length);
        }
        mass[size] = value;
        size++;
    }

    public T clear() {
        size = 0;
        return (T) new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return mass[index];
    }
}
