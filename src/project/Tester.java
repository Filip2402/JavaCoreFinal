package project;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import static project.UserFields.*;

public class Tester {
    public static void main(String[] args) {
        User user = new User("Vasya", "Vaskin", "e@a.com", "Kiev");
        User user2 = new User("Vasya", "Pupkin", "a@a.com", "Kharkov");
        DAO<User> userDao = new UserDAO();
        DAO<Room> roomDao = new RoomDAO();
        DAO<Hotel> hotelDao = new HotelDAO();
        Hotel hotel = new Hotel();
        Room room = new Room();
        userDao.save(user);
        userDao.save(user2);
        hotelDao.save(hotel);
        roomDao.save(room);

        Map<String, String> map = new HashMap<>();
        map.put(NAME.name(), "Vasya");
        map.put(CITY.name(), "Kiev");
        Collection<User> users = userDao.find(map);
        for (User u : users) {
            System.out.println(u.getFirstName() + " " + u.getLastName());
        }
    }
}
