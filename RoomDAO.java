package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RoomDAO extends DAO<Room> {

    public RoomDAO() {
        items = new ArrayList<>();
    }

    @Override
    public boolean update(Room room) {
        return false;
    }

    @Override
    public List<Room> find(Map<String, String> params) {
        return null;
    }
}
