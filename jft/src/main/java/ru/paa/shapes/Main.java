package ru.paa.shapes;

public class Main {


  public static void main(String[] args){
    Square s = new Square(5);
    Rectangle rec = new Rectangle(3, 7);

    System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());
    System.out.println("Площадь прямоугольника со сторонами " + rec.a + " и " + rec.b + " равна " + rec.area());
  }



}
