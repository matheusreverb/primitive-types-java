package org.example;

import java.util.Scanner;

public class LoopWhile {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    double totalNotas = 0;
    double nota = 0;
    int numeroDeAvaliacoes = 0;
    double mediaAvaliacao;

    while (true) {
      System.out.println("Diga sua avaliação para o filme ou -1 para encerrar");
      nota = leitura.nextDouble();
      if (nota < -1 || nota > 10) {
        System.out.println("Digite uma nota entre 0 e 10");
        continue;
      }
      if(nota == -1) {
        break;
      }
      totalNotas += nota;
      numeroDeAvaliacoes++;
    }

    mediaAvaliacao = totalNotas / numeroDeAvaliacoes;
    System.out.println("A média de nota desse filme é:" + mediaAvaliacao);

  }
}
 