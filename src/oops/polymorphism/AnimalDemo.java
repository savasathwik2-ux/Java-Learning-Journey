package oops.polymorphism;

public class AnimalDemo {
    public static void main(String[] args){
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Dog d = new Dog();
        Cat c = new Cat();

        a1.sound();
        a1.eat();
        d.play();

        a2.sound();
        a2.eat();
        c.play();
    }
}
