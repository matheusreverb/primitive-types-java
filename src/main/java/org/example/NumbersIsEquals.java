package org.example;

import java.util.Scanner;

public class NumbersIsEquals {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número");
    int num1 = scanner.nextInt();

    System.out.println("Digite o segundo número");
    int num2 = scanner.nextInt();
    
    if(num1 > num2) {
      System.out.println("O primeiro número é maior que o segundo número");
    } else if( num1 < num2) {
      System.out.println("O menor que o segundo é primeiro número número");
    } else {
      System.out.println("O primeiro número e o segundo número são iguais");
    }
  }
}
