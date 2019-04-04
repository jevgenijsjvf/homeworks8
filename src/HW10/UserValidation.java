package HW10;

public class UserValidation {
    User user;


    public void minLenghtName(User user) throws ValidationExceprion {

        if (user.getName().length() < 3)
            throw new ValidationExceprion("Name cannot contain less then 3 char");
        else if (user.getName().length() > 15)
            throw new ValidationExceprion("Name must contain less that 15 char");
        else if (user.getName().length() >= 3 && user.getName().length() <= 15) {
            System.out.println("Your name OK ");
        }

    }

    public void minLenghtLastName(User user) throws ValidationExceprion {

        if (user.getLastName().length() < 3)
            throw new ValidationExceprion("Last name cannot contain less then 3 char");
        else if (user.getLastName().length() > 15)
            throw new ValidationExceprion("Last name must contain less that 15 char ");
        else if (user.getLastName().length() >= 3 && user.getLastName().length() <= 15) {
            System.out.println("Your last name entered correctly");
        }
    }

    public void ageControl(User user) throws ValidationExceprion {

        if (user.getAge() < 0)
            throw new ValidationExceprion("Age cannot be less then 0");
        else if (user.getAge() > 120)
            throw new ValidationExceprion("If your age is 120, that means that you doesn't exist");
        else if (user.getAge() > 0 && user.getAge() < 120) {
            System.out.println("Your age is perfect");
        }


    }


}