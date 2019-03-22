package dog;

public class DogTest {

    public static void main(String[] args) {

        Dog myDog = new Dog();
        System.out.println("myDog age =" + myDog.getAge());

        myDog.setAge(1);
        System.out.println("myDog age =" + myDog.getAge());

        myDog.voice();

        System.out.println("myDog is hungry = " + myDog.isHungry());

        myDog.play("Aport");

        System.out.println("myDog is hungry = " + myDog.isHungry());

        myDog.eat("bones");

        System.out.println("myDog is hungry = " + myDog.isHungry());
    }
}
