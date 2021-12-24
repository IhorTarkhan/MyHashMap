package org.example.myhashmap;

public enum TestI {
  AAA('a'),
  BBB('b'),
  CCC('c');
  private final char i;

  TestI(char i) {
    this.i = i;
  }

  public char getShort() {
    return i;
  }
}
