package Interfaces;

public class Fish implements Swimmable{

    String name;
    int age;

    public Fish(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(name + " плавает плавниками в воде.");
    }
}
