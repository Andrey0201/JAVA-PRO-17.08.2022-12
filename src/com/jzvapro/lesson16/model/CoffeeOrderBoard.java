package com.jzvapro.lesson16.model;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {

  private final List<Order> coffeeOrder = new ArrayList<>();

  public void add(String name) {
    int number = 1;
    for (Order order : coffeeOrder) {
      number = order.getNumber() + 1;
    }
    coffeeOrder.add(new Order(number, name));
  }

  public void deliver() {
    if (coffeeOrder.isEmpty()) {
      System.out.println("Заказов нет");
    } else {
      System.out.printf("%3d | %s\nЗаказ готов\n", coffeeOrder.get(0).getNumber(),
          coffeeOrder.get(0).getName());
      coffeeOrder.remove(0);
    }
  }

  public void deliverForNumber(int numberOrder) {
    if (coffeeOrder.isEmpty()) {
      System.out.println("Заказов нет");
    } else {
      for (Order order : coffeeOrder) {
        if (order.getNumber() == numberOrder) {
          System.out.printf("%3d | %s\nЗаказ готов\n", order.getNumber(),
              order.getName());
          coffeeOrder.remove(order);
          return;
        }
      }
      System.out.println("Такого номера нет в списке заказов");
    }
  }

  public void draw() {
    System.out.println("==========");
    System.out.println("NUM | NAME");
    for (Order order : coffeeOrder) {
      System.out.printf("%03d | %s\n", order.getNumber(), order.getName());
    }
  }
}