public static class Animal {
    String name = "oops.inheritance.Animal";

    void eat(){
        System.out.println("oops.inheritance.Animal is Eating");
    }
}

static class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
public static void main(String[] args){
    Dog d = new Dog();
    d.eat();
    d.bark();
}
