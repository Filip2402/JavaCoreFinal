package project;

import java.util.Collection;
import java.util.Map;

public class Controller {
    private static DAO<Hotel> hotelDAO = new HotelDAO();
    private static DAO<Room> roomDAO = new RoomDAO();
    private static DAO<User> userDAO = new UserDAO();

    public Collection<Hotel> findHotelByName(String name) {
        try {

        }
        return null;
    }

    public Collection<Hotel> findHotelByCity(String city) {

        return null;
    }

    public void bookRoom(long roomId, long userId, long hotelId) {

    }

    public void cancelReservation(long roomId, long userId, long hotelId) {

    }

    public Collection<Room> findRoom(Map<String, String> params) {
        return null;
    }

    public boolean registerUser(User user) {
        return false;
    }

    public boolean addRoom(Room room){
        return false;
    }

    public boolean logInUser(User user) {
        return false;
    }
}
