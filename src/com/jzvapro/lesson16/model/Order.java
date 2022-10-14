package com.jzvapro.lesson16.model;

public class Order {

  private final int number;
  private final String name;


  public Order(Integer number, String name) {
    this.number = number;
    this.name = name;
  }

  public int getNumber() {
    return number;
  }

  public String getName() {
    return name;
  }

}

