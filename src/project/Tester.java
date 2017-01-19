package project;

public class Tester {
    public static void main(String[] args) {
        User user = new User("Vasya", "Vaskin", "e@a.com");
        DAO<User> userDao = new UserDAO();
        DAO<Room> roomDao = new RoomDAO();
        DAO<Hotel> hotelDao = new HotelDAO();
        Hotel hotel = new Hotel();
        Room room = new Room();
        userDao.add(user);
        hotelDao.add(hotel);
        roomDao.add(room);
    }
}
