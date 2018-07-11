package com.kg.study;
   import java.util.*;
   
  class hashmapExample
  {
      // This function prints frequencies of all elements
      static void printFreq(int arr[])
      {
          // Creates an empty HashMap
          HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
   
          // Traverse through the given array
          for (int i = 0; i < arr.length; i++)
          {
              Integer c = hmap.get(arr[i]);
              if (hmap.get(arr[i]) == null)
                 System.out.println("put "+hmap.put(arr[i], 1));
              else
              System.out.println("elseput "+hmap.put(arr[i], ++c));
          }
          for (Map.Entry m:hmap.entrySet())
            System.out.println("Frequency of " + m.getKey() + 
                               " is " + m.getValue());
          }
      public static void main (String[] args)
      {
          int arr[] = {10, 34, 5, 10, 3, 5, 10};
          printFreq(arr);
      }
  }