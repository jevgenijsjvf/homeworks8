package HW11;

public class UserServiceTest {
    public static void main(String[] args) {
        UserService service = new UserService();
        User user1=new User("1","Vasilij", 20);
        service.addUser(user1);
        User user2=new User("2","Nikolas", 22);
        service.addUser(user2);
        User user3=new User("1","Vasilij", 20);
        service.addUser(user3);

        System.out.println(service.users);
    }
}
