package HW11;

public class UserService extends UserRepository<User>{


    public void addUser(User user) {
        if (users.containsValue(user)) {
            System.out.println("This User already exist in List of users.");
        } else {
        save(user);
            System.out.println("User added in List of users");
    }}
}
