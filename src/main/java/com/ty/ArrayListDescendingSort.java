package com.ty;

import java.util.*;
// Write a program to sort ArrayList in descending order? (Solution)
//You can sort the ArrayList in descending order using Collections.reverseOrder() method.
public class ArrayListDescendingSort {
   public static void main(String args[]) {
       
       ArrayList<String> arrList = new ArrayList();
       arrList.add("Apple");
       arrList.add("Banana");
       arrList.add("Pear");
       arrList.add("Mango");

       /*Unsorted List: ArrayList content before sorting*/
       System.out.println("ArrayList Before Sorting:");
       for(String s: arrList){
          System.out.println(s);
       }

       /* Sorting in decreasing (descending) order*/
       Collections.sort(arrList, Collections.reverseOrder());

       /* Sorted List in reverse order*/
       System.out.println("ArrayList in descending order:");
       for(String str: arrList){
          System.out.println(str);
       }
 }
}