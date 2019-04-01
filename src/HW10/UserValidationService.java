package HW10;

public class UserValidationService {
    public static void main(String[] args) {
        UserValidation userValidation = new UserValidation();
        User user1 = new User("DzuasAsdfgAsdfg", "Bush", 20);
        userValidation.minLenghtName(user1);
        userValidation.minLenghtLastName(user1);
        userValidation.ageControl(user1);

    }
}
