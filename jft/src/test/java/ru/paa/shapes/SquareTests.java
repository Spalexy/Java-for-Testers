package ru.paa.shapes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square(3);
    Assert.assertEquals(s.area(), 9.0);
  }

}
