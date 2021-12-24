package org.example.myhashmap;

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    main2();
  }

  public static void main1() {
    HashMap<String, String> myHashMap = new HashMap<>();
    myHashMap.put("aaa", "a");
    myHashMap.put("aaa", "aa");
    myHashMap.put("aaa", "aaa");
    System.out.println(myHashMap.size());
    System.out.println(myHashMap.get("aaa"));
  }
  public static void main2() {
    MyHashMap myHashMap = new MyHashMap();
    myHashMap.add("aaa", "a");
    myHashMap.add("aaa", "aa");
    myHashMap.add("aaa", "aaa");
    System.out.println(myHashMap.size());
  }
}
