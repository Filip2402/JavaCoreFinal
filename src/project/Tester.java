package project;

public class Tester {
    public static void main(String[] args) {
        User user = new User("Vasya", "Vaskin", "e@a.com");
        DAO<User> userDao = new UserDAO();
        userDao.save(user);
    }
}
