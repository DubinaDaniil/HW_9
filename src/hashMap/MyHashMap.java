package hashMap;


import java.util.*;

public class MyHashMap<K, V> {

    private static final int DEFAULT_SIZE = 8;
    private final Entry<K, V>[] entries = new Entry[DEFAULT_SIZE];
    private int size;

    public V put(K key, V value) {
        int index = getBucketIndex(key);
        Entry<K, V> entry = new Entry<>(key, value, null);
        while (true) {
            if (entries[index] == null) {
                entries[index] = entry;
                size++;
                return null;
            } else if ((entries[index].key).equals(key)) {
                V old = entries[index].value;
                entries[index].next = (Entry<K, V>) value;
                return old;
            } else index = (index + 1) % DEFAULT_SIZE;
        }
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        while (true) {
            if (entries[index] == null) {
                return null;
            } else if ((entries[index].getKey()).equals(key)) {
                return entries[index].value;
            } else index = (index + 1) % DEFAULT_SIZE;
        }
    }

    public V remove(K key) {
        int index = getBucketIndex(key);
        while (true) {
            if (entries[index] == null) {
                return null;
            } else if ((entries[index].key).equals(key)) {
                V old = entries[index].value;
                entries[index] = null;
                size--;
                return old;
            } else index = (index + 1) % DEFAULT_SIZE;
        }
    }

    public void clear() {
       if (size > 0) {
            size = 0;
           Arrays.fill(entries, null);
        }
    }

    public int size() {
        return size;
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % entries.length;
    }

    private static class Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public Entry<K, V> getNext() {
            return next;
        }
    }
}
