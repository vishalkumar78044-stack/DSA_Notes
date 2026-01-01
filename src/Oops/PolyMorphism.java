package Oops;

public class PolyMorphism {
    public static class Dog{
        void speak(){
            System.out.println("bhau bhau");
        }

    }
    public static class Cat{
        void speak(){
            System.out.println("meow meow");
        }

    }
    public static class Lion{
        void speak(){
            System.out.println("ghurr");
        }

    }
    public static class Human {
        void speak() {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Human h = new Human();
        Lion l = new Lion();

        d.speak();
        c.speak();
        h.speak();
        l.speak();
    }

}
