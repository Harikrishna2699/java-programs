package Harikrishna;
// same method name and same arguement is called as overriding
class Animal{
    public void p1() {
        System.out.println("this is animal");
    }
}

class dog extends Animal{
    @Override
    public void p1() {
        super.p1();  // super keyword is used to call the parent class properties
       // System.out.println("bow bow");
    }
}
public class methodoverriding {
    public static void main(String[] args) {
         dog d1 = new dog();
         d1.p1();
    }
}
