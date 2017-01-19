package project;

import java.util.List;
import java.util.Map;

public class HotelDAO extends DAO<Hotel> {
    @Override
    public boolean update(Hotel hotel) {
        return false;
    }

    @Override
    public List<Hotel> find(Map<String, String> params) {
        return null;
    }
}
