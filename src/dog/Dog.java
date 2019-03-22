package dog;

public class Dog {
    private int age;
    private boolean isHungry;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean isHungry() {
        return isHungry;
    }
    public void voice() {
        System.out.println("Woof!");
    }

    public void play(String gameName) {
        System.out.println("Playing " + gameName);
        isHungry = true;
    }

    public void eat(String snackName) {
        System.out.println("Eating yummy " + snackName);
        isHungry = false;
    }
}

