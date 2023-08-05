package com.conversordemoedas.conversordemoedas;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Resultados {

    static void resultado (String moeda, double valorDigitado) {

        switch (moeda) {
            case "De Real para Dólar" -> {
                valorDigitado = (valorDigitado / 5);
                Locale locale = new Locale("EN", "US"); // Define a localização para o EUA
                NumberFormat formatador = NumberFormat.getCurrencyInstance(locale);
                String valorFormatado = formatador.format(valorDigitado);
                JOptionPane.showMessageDialog(null, "O valor da conversão é de " + valorFormatado, "Moeda", JOptionPane.PLAIN_MESSAGE);
            }
            case "De Dólar para Real" -> {
                valorDigitado = (valorDigitado * 5);
                Locale locale2 = new Locale("PT", "BR"); // Define a localização para o BR
                NumberFormat formatador2 = NumberFormat.getCurrencyInstance(locale2);
                String valorFormatado2 = formatador2.format(valorDigitado);
                JOptionPane.showMessageDialog(null, "O valor da conversão é de " + valorFormatado2, "Moeda", JOptionPane.PLAIN_MESSAGE);
            }
            case "De Real para Euro" -> {
                valorDigitado = (valorDigitado / 5.39);
                Locale locale3 = new Locale("PT", "PT"); // Define a localização para Europa
                NumberFormat formatador3 = NumberFormat.getCurrencyInstance(locale3);
                String valorFormatado3 = formatador3.format(valorDigitado);
                JOptionPane.showMessageDialog(null, "O valor da conversão é de " + valorFormatado3, "Moeda", JOptionPane.PLAIN_MESSAGE);
            }
            case "De Euro para Real" -> {
                valorDigitado = (valorDigitado * 5.39);
                Locale locale4 = new Locale("PT", "BR"); // Define a localização para o BR
                NumberFormat formatador4 = NumberFormat.getCurrencyInstance(locale4);
                String valorFormatado4 = formatador4.format(valorDigitado);
                JOptionPane.showMessageDialog(null, "O valor da conversão é de " + valorFormatado4, "Moeda", JOptionPane.PLAIN_MESSAGE);
            }
            default -> {
            }
        }
    }

    static void resultadoTemperatura (String temperatura,double valorDigitado){

        switch (temperatura) {
            case "De Celsius para Fahrenheit" -> {
                valorDigitado = ((valorDigitado * 1.8) + 32);
                JOptionPane.showMessageDialog(null, "O valor da conversão é de " + valorDigitado + "ºF", "Temperatura", JOptionPane.PLAIN_MESSAGE);
            }
            case "De Fahrenheit para Celsius" -> {
                valorDigitado = ((valorDigitado - 32) / 1.8);
                DecimalFormat formato = new DecimalFormat("0.00");
                String numeroFormatado = formato.format(valorDigitado);
                JOptionPane.showMessageDialog(null, "O valor da conversão é de " + numeroFormatado + "ºC", "Temperatura", JOptionPane.PLAIN_MESSAGE);
            }
            case "De Celsius para Kelvin" -> {
                valorDigitado = (valorDigitado + 273.15);
                JOptionPane.showMessageDialog(null, "O valor da conversão é de " + valorDigitado + "ºK", "Temperatura", JOptionPane.PLAIN_MESSAGE);
            }
            case "De Kelvin para Celsius" -> {
                valorDigitado = (valorDigitado - 273.15);
                JOptionPane.showMessageDialog(null, "O valor da conversão é de " + valorDigitado + "ºC", "Temperatura", JOptionPane.PLAIN_MESSAGE);
            }
            default -> {
            }
        }
    }
        public static void resultadoDistancia (String distancia,double valorDigitado){

            switch (distancia) {
                case "De Km para Milha" -> {
                    valorDigitado = (valorDigitado / 1.609);
                    DecimalFormat formato = new DecimalFormat("0.00");
                    String numeroFormatado = formato.format(valorDigitado);
                    JOptionPane.showMessageDialog(null, "O valor da conversão é de " + numeroFormatado + " Milhas", "Distância", JOptionPane.PLAIN_MESSAGE);
                }
                case "De Milha para Km" -> {
                    valorDigitado = (valorDigitado * 1.609);
                    DecimalFormat formato2 = new DecimalFormat("0.00");
                    String numeroFormatado2 = formato2.format(valorDigitado);
                    JOptionPane.showMessageDialog(null, "O valor da conversão é de " + numeroFormatado2 + " Km", "Distância", JOptionPane.PLAIN_MESSAGE);
                }
                default -> {
                }
            }
        }
}
