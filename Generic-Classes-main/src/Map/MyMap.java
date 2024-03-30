package Map;

import java.util.ArrayList;
import java.util.List;

public class MyMap <X, D> {
    private final List<X> keys;
    private final List<D> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(X key, D value) {
        int index = keys.indexOf(key);
        if (index == -1) {
            keys.add(key);
            values.add(value);
            return;
        }
        values.set(index, value);
    }

    public D get(X key) {
        int index = keys.indexOf(key);
        return index != -1 ? values.get(index) : null;
    }

    public D remove(X key) {
        int index = keys.indexOf(key);
        if (index == -1) {
            return null;
        }
        keys.remove(key);
        return values.remove(index);
    }

    @Override
    public String toString() {
        return "MyMap{" +
                "keys=" + keys +
                ", values=" + values +
                '}';
    }
}
