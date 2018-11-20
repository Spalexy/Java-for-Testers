package ru.paa.shapes;

import org.testng.annotations.Test;

public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square(3);
    assert s.area() == 9;
  }
}
