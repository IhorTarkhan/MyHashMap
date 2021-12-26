package org.example.myhashmap;

public enum TestI {
  AAA('a'),
  BBB('b'),
  CCC('c');
  private final char i;

  TestI(char i) {
    this.i = i;
  }

  public char getShort2() {
    char result;
    switch (this.name()) {
      case "AAA":
        result = 'a';
        break;
      case "BBB":
        result = 'b';
        break;
      case "CCC":
        result = 'c';
        break;
      default:
        result = '0';
    }
    return result;
  }

  public char getShort() {
    return i;
  }
}
