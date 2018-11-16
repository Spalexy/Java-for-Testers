package ru.paa.shapes;

public class SquareArea {


  public static void main(String[] args){
    square(7);
    square(5);
  }

  public static void square(int l){
    int s = l * l;
    System.out.println("Площадь квадрата со стороной " + l + " равна " + s);
  }

}
