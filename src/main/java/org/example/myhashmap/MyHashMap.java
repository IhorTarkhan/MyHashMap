package org.example.myhashmap;

import java.util.*;

public class MyHashMap {
  private LinkedList<Pair>[] pairs;
  private int fill = 0;
  private double loadFactor = 0.27;

  public MyHashMap(int initCapacity) {
    pairs = new LinkedList[initCapacity];
  }

  public MyHashMap() {
    this.pairs = new LinkedList[5];
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
    LinkedList<Pair>[] newPairs = new LinkedList[pairs.length * 2];
    List<Pair> pairs =
        Arrays.stream(this.pairs).filter(Objects::nonNull).flatMap(Collection::stream).toList();

    for (Pair newPair : pairs) {
      int newCell = newPair.hashCode() % newPairs.length;
      if (newPairs[newCell] == null) {
        newPairs[newCell] = new LinkedList<>();
      }
      newPairs[newCell].add(newPair);
    }

    return newPairs;
  }

  public int size() {
    return fill;
  }

  public String get(String key) {
    int cell = key.hashCode() % pairs.length;
    if (pairs[cell] != null) {
      for (Pair p : pairs[cell]) {
        if (p.key.equals(key)) {
          return p.value;
        }
      }
    }
    return null;
  }

  public void remove(String key) {
    int cell = key.hashCode() % pairs.length;
    if (pairs[cell] != null) {
      for (Pair p : pairs[cell]) {
        if (p.key.equals(key)) {
          pairs[cell].remove(p);
        }
      }
    }
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
