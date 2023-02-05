package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  public static void main( String[] args )
  {
    System.out.println("Hello World");
  }

  //TODO: Add javadoc comment
  // public String greet(String someone) {
  //   return String.format("Hello, %s!", someone);
  // }

  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
