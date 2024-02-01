package org.example;

import java.util.Collection;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> strList = new MyLinkedList<>();
        strList.add(5);
        strList.add(10);
        printCollection(strList);


    }

    public static void printCollection(Collection<?> c){
        for(Object e : c){
            System.out.println(e);

        }
    }
}
