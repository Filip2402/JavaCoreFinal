package project;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserDAO extends DAO<User> {
    private Set<User> set = new HashSet<>();

    @Override
    public boolean add(User user) {
        return set.add(user);
    }

    @Override
    public boolean delete(User user) {
        return set.remove(user);
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public List<User> find(Map<String, String> params) {
        return null;
    }
}
