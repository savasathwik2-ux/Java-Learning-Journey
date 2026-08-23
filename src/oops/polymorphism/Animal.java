package oops.polymorphism;

public class Animal {
    void sound(){
        System.out.println("Animal making Sound");
    }
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog Barking");
    }
    void play(){
        System.out.println("Dog is playing");
    }
    void eat(){
        System.out.println("Dog is eating");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("cat meows");
    }

    void play() {
        System.out.println("Cat is Playing");
    }

    void eat() {
        System.out.println("cat is eating");

    }
}