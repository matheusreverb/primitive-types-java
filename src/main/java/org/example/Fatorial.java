package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o um número para calcular o fatorial dele: ");
    int num = scanner.nextInt();
    final int numSelected = num;
    BigInteger result = BigInteger.ONE;

    while(num > 0) {
      result = result.multiply(BigInteger.valueOf(num));
      num--;
    }  

    System.out.println("!" + numSelected + " é: " + result);
  }
  
}
