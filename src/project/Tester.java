package project;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String[] args) {
        User user = new User("Vasya", "Vaskin", "e@a.com", "Kiev");
        User user2 = new User("Vasya", "Pupkin", "a@a.com", "Kharkov");
        User user3 = new User("Kolya", "Pupkin", "b@a.com", "Kiev");
        DAO<User> userDao = new UserDAO();
        DAO<Room> roomDao = new RoomDAO();
        DAO<Hotel> hotelDao = new HotelDAO();
        Hotel hotel = new Hotel();
        Room room = new Room();
        userDao.save(user);
        userDao.save(user2);
        userDao.save(user3);
        hotelDao.save(hotel);
        roomDao.save(room);
        Map<String, String> params = new HashMap<>();
        params.put("firstName", "Vasya");
        params.put("city", "Kiev");
        try {
            Collection<User> users = userDao.find(params);
            for (User u : users) {
                System.out.println(u.getFirstName() + " " + u.getLastName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
