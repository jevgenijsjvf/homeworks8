package HW4;

public class UserLoginService {
   private String inputPassword;

    public boolean login(String inputPassword, User user) {
        this.inputPassword = inputPassword;
        if (user.isBlocked()) {
            System.out.println("You are blocked!!!");
            return false;
        } else if (user.getLoginAttemtsLeft() <= 0) {
            user.block();
            System.out.println("You are blocked!!!");
            return false;
        } else if (verify()) {
            System.out.println("You are entered!");
            user.resetLoginAttempts();
            return true;
        } else {
            System.out.println("You are not entered!");
            user.setLoginAttemtsLeft(user.getLoginAttemtsLeft() - 1);
            System.out.println("Your attempts count is: " + user.getLoginAttemtsLeft());
            return false;
        }
    }

    public boolean verify() {
        this.inputPassword = inputPassword;
        User user = new User("ivan", "tralala");
        System.out.print("Start password verify: ");
        if (inputPassword.equals(user.getPassword())) {
            System.out.println("Password correct.");
            return true;
        } else {
            System.out.print("Password incorrect.");
           return false;
        }
    }

}
