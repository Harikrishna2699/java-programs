package Harikrishna;

import java.util.HashSet;
import java.util.Set;

public class settask {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("Hari"); //0
        set1.add("krishna"); //1
        set1.add("ganesh"); //2
        set1.add("vicky"); //3

        System.out.println(set1);

        // String set2 = "Hari";

        /*for (String value: set1){
            if(value.equals(set2)) {
                System.out.println(value);
            }
        }*/
         // another method
        int i=0,c=2;
    for(String a:set1)
    {
        if(i==c)
        {
            System.out.println(a);
        }
        i++;
    }

        }
        }

