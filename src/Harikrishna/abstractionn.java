package Harikrishna;

abstract class Animall {
    private String name;
    public Animall(String name)
    {
        this.name = name;
    }
    public abstract void makeSound();
    public String getName()
    {
        return name;
    }
}
class Dogg extends Animall {
    public Dogg(String name){
        super(name);
    }
    public void makeSound(){
        System.out.println(getName()+ "barks");
    }
}

class Cat extends Dogg {
    public Cat (String name){
        super(name);
    }
    public void makeSound(){
        System.out.println(getName()+ "meowww");
    }
}
public class abstractionn {
    public static void main(String[] args) {
        Animall myDogg = new Dogg("buddy ");
        Animall myCat = new Cat("fluffy ");
        myCat.makeSound();
        myDogg.makeSound();
    }

}
