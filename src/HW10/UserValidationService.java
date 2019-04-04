package HW10;


public class UserValidationService {
    public static void main(String[] args) {

        UserValidation userValidation = new UserValidation();
        User user1 = new User("Dzulian", "Budadashev", 12);


               try {
            userValidation.minLenghtName(user1);
        } catch (ValidationExceprion exceprion) {
            exceprion.printStackTrace();
        } finally {
            System.out.println("Name checked");
            System.out.println();
        }

        try {
            userValidation.minLenghtLastName(user1);
        } catch (ValidationExceprion exceprion) {
            exceprion.printStackTrace();
        } finally {
            System.out.println("Last name checked");
            System.out.println();
        }

        try {
            userValidation.ageControl(user1);
        } catch (ValidationExceprion exceprion) {
            exceprion.printStackTrace();
        } finally {
            System.out.println("Age checked");
            System.out.println();
        }


    }
}
