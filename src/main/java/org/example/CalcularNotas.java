package org.example;

import java.util.List;

public class CalcularNotas {
    public static void main(String[] args) {
        List<Double> notas = List.of(8.0, 9.0, 3.0);
        double sumNotas = notas.stream().reduce(0.0, (nota1, nota2) -> {
            return nota1 + nota2;
        });
        double media = sumNotas / notas.toArray().length;

        System.out.println(media);
    }
}
