package HW10;

public class UserValidation {
    User user;

    public void minLenghtName (User user) {
        if (user.getName().length() >= 3 && user.getName().length() <= 15) {
            System.out.println("Your name OK ");
        } else {
            System.out.println("Name must be greaten then 3 but less then 15 ");

        }
    }

    public void minLenghtLastName (User user) {
        if (user.getLastName().length() >= 3 && user.getLastName().length() <= 15) {
            System.out.println("Your name OK ");
        } else {
            System.out.println("Name must be greaten then 3 but less then 15 ");

        }
    }

    public void ageControl (User user) {
        if (user.getAge() >=0 && user.getAge()<=120) {
            System.out.println("Your age is perfect");
        } else {
            System.out.println("You die or not born.");
        }
    }


}
