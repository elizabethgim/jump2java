package Ch5_OOP;

class Animal{
    String name;
    public void setName(String name){
        this.name = name;
    }
}
class Cat extends Animal{

}
class Dog extends Animal{

}

public class Class {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        Cat cat = new Cat();
        cat.setName("kitty");
        System.out.println(cat.name);
    }
}
