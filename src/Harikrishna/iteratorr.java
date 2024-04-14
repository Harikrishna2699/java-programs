package Harikrishna;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorr {
public static void main(String[] args) {

    ArrayList<String> arrlist22 = new ArrayList<>();
    arrlist22.add("Hari");
    arrlist22.add("Krishna");
    arrlist22.add("Harish");
    arrlist22.add("Harsha");
    arrlist22.add("Sanjay");
    arrlist22.add("Dhoni");

        System.out.println(arrlist22);


    Iterator<String> it =arrlist22.iterator();
     // System.out.println(it.next());*/
    while(it.hasNext())
    {
        String i=it.next();
        if(i=="Hari"){
            it.remove();
        }
    }
    System.out.println(arrlist22);

    }

    }


