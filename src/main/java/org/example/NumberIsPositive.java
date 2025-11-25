package org.example;

import java.util.Scanner;

public class NumberIsPositive {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número");
    int numberTyped = scanner.nextInt();

    if(numberTyped > 0) {
      System.out.println("Número positivo");
    } else {
      System.out.println("Numero negativo");
    }
  }
}
