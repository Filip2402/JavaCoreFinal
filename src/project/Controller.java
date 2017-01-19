package project;

public class Controller {
    private static DAO<Hotel> hotelDAO = new HotelDAO();
    private static DAO<Room> roomDAO = new RoomDAO();
    private static DAO<User> userDAO = new UserDAO();
}
