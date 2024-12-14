import java.util.*;

class HashTableWithLevelIndexing<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;

    private List<List<Map.Entry<K, V>>> table;
    private int size;

    public HashTableWithLevelIndexing() {
        table = new ArrayList<>(INITIAL_CAPACITY);
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            table.add(new ArrayList<>());
        }
        size = 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % table.size());
    }

    private void resize() {
        if ((float) size / table.size() > LOAD_FACTOR) {
            List<List<Map.Entry<K, V>>> oldTable = table;
            int newCapacity = table.size() * 2;
            table = new ArrayList<>(newCapacity);
            for (int i = 0; i < newCapacity; i++) {
                table.add(new ArrayList<>());
            }

            for (List<Map.Entry<K, V>> bucket : oldTable) {
                for (Map.Entry<K, V> entry : bucket) {
                    int index = hash(entry.getKey());
                    table.get(index).add(entry);
                }
            }
        }
    }

    public void put(K key, V value) {
        int index = hash(key);
        List<Map.Entry<K, V>> bucket = table.get(index);

        for (Map.Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        bucket.add(new AbstractMap.SimpleEntry<>(key, value));
        size++;
        resize();
    }

    public V get(K key) {
        int index = hash(key);
        List<Map.Entry<K, V>> bucket = table.get(index);

        for (Map.Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        return null;
    }

    public boolean remove(K key) {
        int index = hash(key);
        List<Map.Entry<K, V>> bucket = table.get(index);

        Iterator<Map.Entry<K, V>> iterator = bucket.iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            if (entry.getKey().equals(key)) {
                iterator.remove();
                size--;
                return true;
            }
        }

        return false;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
