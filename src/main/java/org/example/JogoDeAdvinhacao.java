package org.example;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdvinhacao {
  public static void main(String[] args) {
    final int LIMIT = 100;
    final int MINIMUM = 0;

    final int TRIES = 10;
    int randomNumber = new Random().nextInt(LIMIT);
    Scanner scanner = new Scanner(System.in);

    int numberOfTries = TRIES;

    System.out.println("Tente acertar o número sorteado de " + MINIMUM + " a " + LIMIT + " você terá " + TRIES + " de tentativas!");

    while (numberOfTries > 0) {
      int numberTyped = scanner.nextInt();

      if(numberTyped < MINIMUM || numberTyped > LIMIT) {
        System.out.println("Você precisa digitar entre " + MINIMUM + " e " + LIMIT);
        continue;
      }

      if(numberTyped == randomNumber) {
        System.out.println("Você acertou o número sorteado número da sorte: " + randomNumber);
        break;
      }

      numberOfTries--;
      if(numberOfTries > 0) {
        System.out.println("Você errou o número, tente novamente! Número de tentativas: " + numberOfTries);
      }
      
    }

    System.out.println("O número de tentativas acabou, número da sorte era: " + randomNumber);
  }
}
