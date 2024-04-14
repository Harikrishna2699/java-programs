package Harikrishna;

import java.util.ArrayList;

public class listtask {

    public static void main(String[] args) {

        ArrayList<String> arrlist = new ArrayList<>();
        arrlist.add("Hari");
        arrlist.add("Krishna");
        arrlist.add("Harish");
        arrlist.add("Harsha");
        arrlist.add("Sanjay");
        arrlist.add("Dhoni");
        arrlist.add("Dravid");

        //System.out.println(arrlist);
        //System.out.println(arrlist.contains("Dhoni"));  // to check particular value is present or not
       // System.out.println(arrlist.get(4));             // to get particular value

        ArrayList<String> arrlist1 = new ArrayList<>();

        for (String a:arrlist) {
            if(a.startsWith("D")){
                arrlist1.add(a);
            }


        }
        System.out.println(arrlist1);
    }
}
