package HW10;


public class UserValidationService {
    public static void main(String[] args) {

        UserValidation userValidation = new UserValidation();
        User user1 = new User("Dzulian", "Budadashev", 152);

        try {
            userValidation.controlService(user1);
        } catch (ValidationExceprion exceprion) {
            exceprion.printStackTrace();
        } finally {
            System.out.println("Control done.");
            System.out.println();
        }

        userValidation.controlService(user1);


    }
}
