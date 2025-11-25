package org.example;

import java.text.NumberFormat;
import java.util.List;
import java.util.Scanner;

public class DesafioContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> options = List.of(
                OptionsContaBancaria.CONSULTAR_SALDO.getDescription(),
                OptionsContaBancaria.RECEBER_VALOR.getDescription(),
                OptionsContaBancaria.TRANSFERIR_VALOR.getDescription()
        );

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        double saldo = 0.0;

        System.out.printf("""
                ***********************************************
                Dados iniciais do cliente:

                Nome:               Matheus Monteiro de Moura
                Tipo de conta:      Corrente
                Saldo inicial:      %s

                ***********************************************
                """, currencyFormat.format(saldo));

        while (true) {
            exibirMenu(options);

            System.out.println("\nDigite a operação desejada:");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("\nO saldo atual é " + currencyFormat.format(saldo));

                case 2 -> {
                    System.out.println("Informe o valor a receber: ");
                    double valor = scanner.nextDouble();
                    saldo += valor;
                    System.out.println("\nSaldo atualizado: " + currencyFormat.format(saldo));
                }

                case 3 -> {
                    System.out.println("Informe o valor que deseja transferir:");
                    double valor = scanner.nextDouble();

                    if (valor > saldo) {
                        System.out.println("\nVocê não possui saldo suficiente.");
                    } else {
                        saldo -= valor;
                        System.out.println("\nSaldo atualizado: " + currencyFormat.format(saldo));
                    }
                }

                case 4 -> {
                    System.out.println("\nEncerrando programa...");
                    return;
                }

                default -> System.out.println("\nOpção inválida. Tente novamente!");
            }
        }
    }

    private static void exibirMenu(List<String> options) {
        System.out.println("\n\nOperações\n");

        for (int i = 0; i <= options.size(); i++) {
            int index = i + 1;

            if (i < options.size()) {
                System.out.println(index + " - " + options.get(i));
            } else {
                System.out.println(index + " - Sair");
            }
        }
    }
}
