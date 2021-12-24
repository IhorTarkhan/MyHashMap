package org.example.myhashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyHashMapTest {
  @Test
  void canCreateNewTest() {
    assertDoesNotThrow(() -> new MyHashMap());
  }

  @Test
  void emptyMapOnCreateTest() {
    MyHashMap myHashMap = new MyHashMap();
    assertEquals(0, myHashMap.size());
  }

  @Test
  void canAddTest() {
    MyHashMap myHashMap = new MyHashMap();
    myHashMap.add("test", "value");
  }

  @Test
  void sizeIncreaseOnAddTest() {
    MyHashMap myHashMap = new MyHashMap();
    myHashMap.add("test", "value");
    assertEquals(1, myHashMap.size());
  }
}
