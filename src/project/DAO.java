package project;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public abstract class DAO<T> {
    private Collection<T> list;

    public boolean add(T t) {
        return list.add(t);
    }

    public boolean delete(T t) {
        return list.remove(t);
    }

    public abstract boolean update(T t);
    public abstract List<T> find(Map<String, String> params);
}
