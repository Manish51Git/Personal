package com.ty;

import java.util.*;
/*
 *  Remove String elements at the specified index from the ArrayList
 */

public class RemoveMethodExample {
    public static void main(String args[]) {
        // Creating an object of ArrayList of String Type
        ArrayList<String> list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.add("AA");
        list.add("ZZ");
        System.out.println("Given ArrayList before remove method: ");
        for(String str : list) {
            System.out.println(str);
        }
        // Using remove(element) method, removing 1st element, size() reduces by 1
        list.remove(0);
        // Using remove(element) method, removing 3rd element from the remaining list
        list.remove(2);
        // Using remove(element) method, removing 4th element from the remaining list
        list.remove(3);
        System.out.println("ArrayList after applying remove method: ");
        for(String str2 : list) {
            System.out.println(str2);
        }
    }
}
