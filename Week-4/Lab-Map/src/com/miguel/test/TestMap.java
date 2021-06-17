package com.miguel.test;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {
	public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("apple", "Keeps Doctors Away");
        dictionary.put("banana", "A yellow fruit that can be peeled");
        dictionary.put("cantaloupe", "Cant elope with watermelons");
        System.out.println(dictionary);
        

        //get value from map using the key
        String key = "apple";
        String value = dictionary.get(key);
        System.out.println("The value for the key: " + key + " is " + value);
        
      //define a new TreeMap
        TreeMap<String, String> sortedDictionary = new TreeMap<>();
        sortedDictionary.putAll(dictionary);
        System.out.println(sortedDictionary);
      //add another element
        sortedDictionary.put("Onions", "Onions Are Like OGRES");
        System.out.println(sortedDictionary);
      //re-add an element
        sortedDictionary.put("Onions", "Cause they stink");
        System.out.println(sortedDictionary);
        
      //create a Set of keys
        Set<String> keys = sortedDictionary.keySet();
        for(String s: keys) {
            System.out.println("key: " + s);
        }
    }
}
