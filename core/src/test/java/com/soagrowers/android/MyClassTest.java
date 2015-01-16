package com.soagrowers.android;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTest {

  @Test
  public void testAdd(){
    Integer a = new Integer(2);
    Integer b = new Integer(2);
    Integer result = new Integer(4);

    assertEquals(result, MyClass.add(a, b));
  }
}
