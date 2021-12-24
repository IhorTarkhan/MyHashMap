package org.example.myhashmap;

import java.util.LinkedList;

public class MyHashMap {
  private LinkedList<Pair>[] pairs;
  private int fill = 0;
  private double loadFactor = 0.27;

  public MyHashMap(int initCapacity) {
    pairs = new LinkedList[initCapacity];
  }

  public MyHashMap() {
    this.pairs = new LinkedList[10];
  }

  public void add(String key, String value) {
    Pair newPair = new Pair(key, value);
    int newCell = newPair.hashCode() % pairs.length;
    if (pairs[newCell] == null) {
      pairs[newCell] = new LinkedList<>();
    }
    if (pairs[newCell].contains(newPair)) {
      int i = pairs[newCell].indexOf(newPair);
      pairs[newCell].set(i, newPair);
    } else {
      pairs[newCell].add(newPair);
      fill++;
    }
    if ((1.0 * fill / pairs.length) > loadFactor) {
      pairs = reorder();
    }
  }

  private LinkedList<Pair>[] reorder() {
    // ToDo implement
    return null;
  }

  public int size() {
    return fill;
  }

  static class Pair {
    String key;
    String value;

    public Pair(String key, String value) {
      this.key = key;
      this.value = value;
    }

    @Override
    public int hashCode() {
      return key.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
      if (obj instanceof Pair) {
        return key.equals(((Pair) obj).key);
      }
      return false;
    }
  }
}
