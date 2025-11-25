package org.example;

import java.util.Scanner;

public class Tabuada {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Adicione o número da tabauada que deseja reproduzir:");
    final int NUMBER = scanner.nextInt();

    for(int i = 1; i <= 10; i++) {
      final int RESULT = NUMBER * i;
      System.out.println(NUMBER + " x " + i + " = " + RESULT);
    }
  }
}
