package org.example;

import java.util.Scanner;

public class ImparOuPar {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número para descobrir se ele é par ou ímpar");
    int num = scanner.nextInt();

    if(num % 2 == 0) {
      System.out.println("Par");
    } else {
      System.out.println("Impar");
    }
  }
}
