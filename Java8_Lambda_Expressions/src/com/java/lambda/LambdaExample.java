
  package com.java.lambda;
  
  public class LambdaExample { public static void main(String[] args) {
  
  print(() -> { System.out.println("Rect class draw() Method"); }); print(() ->
  { System.out.println("square class draw() Method"); }); print(() -> {
  System.out.println("circle class draw() Method"); });
  
  }
  
  private static void print(com.java.lambda.shape shape) { shape.draw(); }
  
  }
 