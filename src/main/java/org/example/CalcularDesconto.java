package org.example;

public class CalcularDesconto {
    public static void main(String[] args) {
        double precoOriginal = 100;
        double percentualDesconto = 10;
        double valorDesconto = (precoOriginal / 100) * percentualDesconto;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);
    }
}
