package project;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class UserDAO extends DAO<User> {
    public UserDAO() {
        list = new HashSet<>();
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
