package Harikrishna;
 /*interface hari{
      void Adisplay();
 }
 interface krishna{
     void Bdisplay();
 }

 class ab implements hari,krishna{
     @Override
     public void Adisplay() {
         System.out.println("this is Adisplay");
     }

     @Override
     public void Bdisplay() {
         System.out.println("this is Bdisplay");
     }
 }
public class interfacee {
    public static void main(String[] args) {
        ab obj = new ab();
        obj.Adisplay();
        obj.Bdisplay();
    }
}*/

abstract class vehicle {
    public abstract void start();
    public abstract void stop();
}

interface drivable{

    void drive();
}

class car extends vehicle implements drivable {

    private String model;
    public car(String model){
        this.model=model;
    }

    @Override
    public void start() {
        System.out.println(model+ "  its starting");
    }

    @Override
    public void stop() {
        System.out.println(model + " it stopped");
    }

    @Override
    public void drive() {
        System.out.println(model + " is being driven");
    }
}
class main{


public static void main(String[] args) {
    car c1 = new car("honda city");
    c1.start();
    c1.stop();
    c1.drive();
}}


