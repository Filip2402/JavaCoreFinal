package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HotelDAO extends DAO<Hotel> {
    public HotelDAO() {
        this.items = new ArrayList<>();
    }

    @Override
    public boolean update(Hotel hotel) {
        return false;
    }

    @Override
    public List<Hotel> find(Map<String, String> params) {
        return null;
    }
}
