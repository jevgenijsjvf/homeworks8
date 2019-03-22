package HW3;

public class Humman {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName()    {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void sayHi (){
        System.out.println("Hi! My name is " + getName() + " I'm " + getAge() + " years old.");
    }

  }


