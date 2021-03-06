package org.example.myhashmap;

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    System.out.println(TestI.AAA.getShort2());
    System.out.println(TestI.BBB.getShort2());
    System.out.println(TestI.CCC.getShort2());
    System.out.println(TestI.AAA.getShort2());
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
    myHashMap.add("bbb", "aa");
    myHashMap.add("ccc", "aaa");
    System.out.println(myHashMap.size());
    System.out.println(myHashMap.get("aaa"));
    System.out.println(myHashMap.get("bbb"));
    System.out.println(myHashMap.get("ccc"));
    System.out.println(myHashMap.get("ddd"));
    myHashMap.remove("ccc");
    System.out.println(myHashMap.get("ccc"));
  }
}
