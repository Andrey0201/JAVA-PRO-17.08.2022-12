package com.javapro.lesson16;

import com.javapro.lesson16.model.CoffeeOrderBoard;


public class Main {

  public static void main(String[] args) {
    CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

    coffeeOrderBoard.deliver();
    coffeeOrderBoard.deliverForNumber(1);
    coffeeOrderBoard.add("Ivan");
    coffeeOrderBoard.deliverForNumber(4);
    coffeeOrderBoard.add("Andrey");
    coffeeOrderBoard.deliver();
    coffeeOrderBoard.add("Vlad");
    coffeeOrderBoard.add("Robert");
    coffeeOrderBoard.add("Alexandr");
    coffeeOrderBoard.deliverForNumber(3);
    coffeeOrderBoard.draw();
  }
}