package Interfaces;

public class Bird implements Swimmable, Flyable{

    String name;
    int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(name + " плавает лапками.");
    }

    @Override
    public void fly() {
        System.out.println(name + " летает крыльями в небе.");
    }
}
