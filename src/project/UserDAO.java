package project;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class UserDAO extends DAO<User> {
    public UserDAO() {
        items = new HashSet<>();
    }

    @Override
    public boolean update(User user) {
        return false;
    }
}
