package com.examplelist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        List <String> myList = new ArrayList <String>();
        
        myList.add("Object 1");
        myList.add("Object 2");
        myList.add("Object 3");
        myList.add("Object 4");
        myList.add("Object 5");
        myList.add("Object 6");
        myList.add("Object 7");
        myList.add("Object 8");

        myList.remove(2);

        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        myList.add(2, "New Object 3");

      //  Object element = null;

        
        
        System.out.println("For loop:");
        for(String next : myList){
            System.out.println(next);
        }
    }
}
