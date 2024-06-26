package corejava.java_basic.control_statements;

import java.util.*;

public class ForEach1 {
    public static void main(String... args){
        String[][] myArray = new String[][]{{"Jay Shree Ram"},{"Jay Shree Krishna", "Har Har Mahadev"},
                {"Jay Ma Durga","Jay Ma Kali","Jay Ma Radharani"}};

        for(String[] arr1:myArray){
            for(String str:arr1){
                System.out.println(str);
            }
        }

        System.out.println("------------------------------");

        List<Integer> myIntList = new ArrayList<Integer>();
        myIntList.add(10);
        myIntList.add(20);
        myIntList.add(30);
        myIntList.add(40);

        for(Integer i:myIntList){
            System.out.println(i);
        }
        System.out.println("------------------------------");

        Object[] myObjectList = (((Object)(new String("Suman"))).getClass().getDeclaredFields());
        for(Object x: myObjectList){
            System.out.println(x.toString());
        }

        // --------------- New For each loop ------------------
        String[] myStringArray = new String[]{"Jay Shree Ram", "Jay Shree Krishna", "Har Har Mahadev","abc"};
        for (String myStringArray1 : myStringArray) {
            switch (myStringArray1) {
                case "Jay Shree Ram" -> System.out.println("I am Sri Ram Devotee");                
                case "Jay Shree Krishna" -> System.out.println("I am Sri Krishna Devotee");
                case "Har Har Mahadev" -> System.out.println("I am Sri Shiva Devotee");
                default -> System.out.println("Nothing Matched");
            }
        }
    }
}
