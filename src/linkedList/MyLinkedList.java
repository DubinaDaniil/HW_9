package linkedList;

import java.util.*;

public class MyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void add(T value) {
        Node<T> node = new Node<>(value);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
    }

    public T get(int index) {
        Objects.checkIndex(index, size);
        return getNodeByIndex(index).value;
    }

    private Node<T> getNodeByIndex(final int index) {
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public int size() {
        return size;
    }

    public T remove(int index) {
        Objects.checkIndex(index, size);
        T elementToRemove;

        if (index == 0) {
            elementToRemove = head.value;
            head = head.next;
            if (head == null) {
                //if only one element into the List
                tail = null;
            }
        } else {
            Node<T> prev = getNodeByIndex(index - 1);
            elementToRemove = prev.next.value;
            prev.next = prev.next.next;
            if (index == size - 1) {
                //if delete last element
                tail = prev;
            }
        }
        size--;
        return elementToRemove;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    static class Node<T> {
        T value;
        Node<T> next;
        Node<T> previous;

        public Node(T value) {
            this.value = value;
        }
    }
}
