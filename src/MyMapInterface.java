public interface MyMapInterface<k,v> {
    int size();

    boolean isEmpty();

    Object get(Object key);

    Object put(Object key, Object value);

    interface Entry<k, v> {
        k getKey();

        v getValue();
    }
}