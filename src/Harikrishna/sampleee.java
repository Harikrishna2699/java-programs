package Harikrishna;

import java.util.*;

public class sampleee {
    public static void main(String[] args) {
      /*  List<String> list1 = new LinkedList<>();
        list1.add("hari");
        list1.add("krishna");
        list1.add("abbas");
        list1.add("ball");
        list1.add("catch");
        System.out.println(list1);*/

     /*   List<String> list1 = new ArrayList<>();
        list1.add("hari");
        list1.add("krishna");
        list1.add("abbas");
        list1.add("ball");
        list1.add("catch");
        list1.add("catch");
        list1.add("hari");
        System.out.println(list1); */

        /*Set <String> set1 = new LinkedHashSet<>();
        set1.add("hari");
        set1.add("krishna");
        set1.add("hari");
        set1.add("");
        System.out.println(set1); */
       /* Set <String> set1 = new HashSet<>();
        set1.add("hari");
        set1.add("dhoni");
        set1.add("krishna");
        set1.add("hari");
        set1.add("");
        System.out.println(set1);*/

      /*  Set <String> set1 = new TreeSet<>();
        set1.add("0hari");
        set1.add("hari");
        set1.add("Hari");
        System.out.println(set1); */

        //map
       /* Map <Integer,String> data = new LinkedHashMap<>();
        data.put(01,"hari");
        data.put(02,"krishna");
        data.put(03,"");
        data.put(04,null);
        data.put(null,null);
        System.out.println(data);*/

        Map <Integer,String> data1 = new HashMap<>();
        data1.put(07,"hari");
        data1.put(03,"krishna");
        data1.put(01,"");
        data1.put(04,null);
        data1.put(null,null);
       // System.out.println(data1);

        /*Map <String,String> data2 = new TreeMap<>();
        data2.put("name","hari");*/
        System.out.println("orginal"+ data1);
      //  System.out.println(data1.isEmpty());
       // System.out.println(data1.entrySet());
       // data1.put(9,null);
     //   System.out.println("entryset" + data1.entrySet());
        System.out.println(data1.size());
        System.out.println(data1.hashCode());
        System.out.println(data1.replace(04,"Sam"));
        System.out.println(data1);


      //  data2.put("attendence","full");

        //System.out.println(data1);



    }
}
