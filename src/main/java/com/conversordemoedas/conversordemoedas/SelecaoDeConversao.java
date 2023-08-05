package com.conversordemoedas.conversordemoedas;

import javax.swing.*;

public class SelecaoDeConversao {

    static String moedaSelecionada(){
        String moeda = (JOptionPane.showInputDialog
                (null, "Selecione uma moeda para conversão", "Conversão de Moeda", JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"Selecione a Conversão", "De Real para Dólar", "De Dólar para Real", "De Real para Euro", "De Euro para Real"}, "Seleciona")).toString();

        if (moeda!="Selecione a Conversão") {
            return moeda;
        }else{
            return moedaSelecionada();
        }
    }
    static String temperaturaSelecionada(){
        String temperatura = (JOptionPane.showInputDialog
                (null, "Selecione uma temperatura para conversão", "Conversão de Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"Selecione a Conversão", "De Celsius para Fahrenheit", "De Fahrenheit para Celsius", "De Celsius para Kelvin", "De Kelvin para Celsius"}, "Seleciona")).toString();
        if (temperatura!="Selecione a Conversão") {
            return temperatura;
        }else{
            return temperaturaSelecionada();
        }
    }
    static String distanciaSelecionada(){
        String distancia = (JOptionPane.showInputDialog
                (null, "Selecione uma distância para conversão", "Conversão de Distância", JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"Selecione a Conversão", "De Km para Milha", "De Milha para Km"}, "Seleciona")).toString();
        if (distancia!="Selecione a Conversão") {
            return distancia;
        }else{
            return distanciaSelecionada();
        }
    }
}
