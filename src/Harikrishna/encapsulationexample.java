package Harikrishna;
// hiding the data from the user is encapsulation
// this keyword is to call the current object
// we can acheive encapsulation thru private access modifie


class Person {

    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge (int age)
    {
        this.age=age;
    }
}
public class encapsulationexample {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(24);
        p.setName("HariKrishna");
        System.out.println("Name of the person is "+ p.getName()  + " and the age is  "+p.getAge());
    }
}
