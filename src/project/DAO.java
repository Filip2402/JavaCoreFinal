package project;

import java.util.Collection;
import java.util.Map;

public abstract class DAO<T> {
    protected Collection<T> items;

    public boolean save(T t) {
        return items.add(t);
    }

    public boolean delete(T t) {
        return items.remove(t);
    }

    public abstract boolean update(T t);
    public abstract Collection<T> find(Map<String, String> params);
}
