package project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static project.UserFields.*;

public class UserDAO extends DAO<User> {
    public UserDAO() {
        items = new HashSet<>();
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public List<User> find(Map<String, String> params) {
        List<User> result = new ArrayList<>(items);
        for (Map.Entry<String, String> mapEntry : params.entrySet()) {
            Predicate<User> predicate;
            if (mapEntry.getKey().equals(NAME.name())) {
                predicate = o -> o.getFirstName().equals(mapEntry.getValue());
            }
            else if (mapEntry.getKey().equals(LAST_NAME.name())) {
                predicate = o -> o.getLastName().equals(mapEntry.getValue());
            }
            else if (mapEntry.getKey().equals(ID.name())) {
                predicate = o -> o.getId() == Long.valueOf(mapEntry.getValue());
            }
            else if (mapEntry.getKey().equals(EMAIL.name())) {
                predicate = o -> o.getEmail().equals(mapEntry.getValue());
            }
            else if (mapEntry.getKey().equals(CITY.name())) {
                predicate = o -> o.getCity().equals(mapEntry.getValue());
            } else {
                predicate = o -> o.getId() == -1;
            }
            result = result.stream()
                    .filter(predicate)
                    .collect(Collectors.toList());
        }
        return result;
    }
}
