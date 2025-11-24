package org.example;

public class DesafioTemperatura {
    public static void main(String[] args) {
        double temperaturaEmCelsius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        System.out.println("Temperatura em Graus Celsius: " + temperaturaEmCelsius);

        int temperaturaEmFahenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é:" + temperaturaEmFahenheitInteira);
    }
}
