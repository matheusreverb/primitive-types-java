package org.example;

import java.util.Scanner;

public class CalculateAreas {
  public static void main(String[] args) {
    final double PI = Math.PI;
    Scanner scanner = new Scanner(System.in);

    System.out.println("1 - Calcular área do quadrado");
    System.out.println("2 - Calcular área do círculo");
    int optionSelected = scanner.nextInt();
    double area;

    switch (optionSelected) {
      case 1:
        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();
        area = lado * lado;
        System.out.println("A área do quadrado é: " + area);
        break;

      case 2:
        System.out.print("Digite a largura (diâmetro) do círculo: ");
        double largura = scanner.nextDouble();
        double raio = largura / 2;

        area = PI * raio * raio;
        System.out.println("A área do círculo é: " + area);
        break;

      default:
        System.out.println("Opção inválida!");
        break;
    }
  }
}
