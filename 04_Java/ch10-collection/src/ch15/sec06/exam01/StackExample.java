package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
  public static void main(String[] args) {

    // Stack collection 생성
    Stack<Coin> coins = new Stack<>();

    coins.push(new Coin(100));
    coins.push(new Coin(50));
    coins.push(new Coin(500));
    coins.push(new Coin(10));

    while (!coins.isEmpty()) {
      Coin coin = coins.pop();
      System.out.println("꺼내온 동전: " + coin.getValue() + "원");
    }
  }
}
