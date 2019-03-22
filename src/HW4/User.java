package HW4;
import java.util.Objects;

public class User {

    private String login;
    private String password;
    private int loginAttemtsLeft = 3;
    boolean blocked=false;

    public User(String login,String password) {
        this.login = login;
        this.password = password;
   }
   public String getLogin() {
        return login;
    }
   public void setLogin(String login) {
        this.login = login;
    }
   public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public int getLoginAttemtsLeft() {
        return loginAttemtsLeft;
    }

    public void setLoginAttemtsLeft(int loginAttemtsLeft) {
        this.loginAttemtsLeft = loginAttemtsLeft;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public void block() {
        blocked=true;
    }

    public void resetLoginAttempts() {
        loginAttemtsLeft=3;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return loginAttemtsLeft == user.loginAttemtsLeft &&
                blocked == user.blocked &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, loginAttemtsLeft, blocked);
    }
}
