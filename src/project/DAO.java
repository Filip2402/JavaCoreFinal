package project;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public abstract class DAO<T> {
    protected Collection<T> items;

    public boolean add(T t) {
        return items.add(t);
    }

    public boolean delete(T t) {
        return items.remove(t);
    }

    public abstract boolean update(T t);
    public abstract List<T> find(Map<String, String> params);
}
