package Harikrishna;

abstract class A
{
    abstract void display();
}

abstract class B extends A {
    public void display()
    {
        System.out.println("class A");
    }
    abstract void show();
}

class C extends B{
    void show(){
        System.out.println("class B");
    }
}
public class xample {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
        obj.show();

    }
}
