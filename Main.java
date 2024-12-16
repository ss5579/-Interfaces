package Interfaces;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Иван", 30);
        Fish fish = new Fish("Лейла", 1);
        Bird bird = new Bird("Филя", 2);


        human.swim();
        human.fly();

        fish.swim();

        bird.swim();
        bird.fly();
    }
}
