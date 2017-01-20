package project;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
    public Collection<T> find(Map<String, String> params)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<T> result = new ArrayList<>(items);
        for (Map.Entry<String, String> mapEntry : params.entrySet()) {
            List<T> temp = new ArrayList<>();
            String methodName = "get" + mapEntry.getKey().substring(0, 1).toUpperCase() + mapEntry.getKey().substring(1);
            Method method = result.get(0).getClass().getMethod(methodName);
            for (T item : result) {
                if (method.invoke(item).equals(mapEntry.getValue())) {
                    temp.add(item);
                }
            }
            result = temp;
        }
        return result;
    }
}
