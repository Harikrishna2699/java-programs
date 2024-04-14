package Harikrishna;
/// two or more methods in the class with same method name and different arguement is called as method overloading.
public class methodoverloading {

    public static int add(int a , int b) {
        return a+b;
    }


    public static int add (int a, int b, int c) {
        return a+b+c;
    }

    public static  double add (double a, double b) {
        return a+b;

    }

    public static void main(String[] args) {
        System.out.println(add(5,10));
        System.out.println(add(5,10,22));
        System.out.println(add(3.6,5.4));

    }

}
