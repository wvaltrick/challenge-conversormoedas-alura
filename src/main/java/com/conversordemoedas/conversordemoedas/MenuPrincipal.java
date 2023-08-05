package com.conversordemoedas.conversordemoedas;

import javax.swing.JOptionPane;

public class MenuPrincipal {

    public static void main(String[] args) {
        menuPrincipal();
    }
    static void menuPrincipal(){
        String[] opcoes = {"Conversor de Moedas", "Conversor de Temperaturas", "Conversor de Distâncias"};

        String opcaoSelecionada = (String) JOptionPane.showInputDialog(
                null,
                "Escolha uma opção:",
                "Menu",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        if (opcaoSelecionada == "Conversor de Moedas"){
            double valorDigitado = ValorInserido.inserirValor();
            String moeda = SelecaoDeConversao.moedaSelecionada();
            Resultados.resultado(moeda, valorDigitado);
        } else if (opcaoSelecionada == "Conversor de Temperaturas"){
            double valorDigitado = ValorInserido.inserirValor();
            String temperatura = SelecaoDeConversao.temperaturaSelecionada();
            Resultados.resultadoTemperatura(temperatura, valorDigitado);
        } else if (opcaoSelecionada == "Conversor de Distâncias"){
            double valorDigitado = ValorInserido.inserirValor();
            String distancia = SelecaoDeConversao.distanciaSelecionada();
            Resultados.resultadoDistancia(distancia, valorDigitado);
        } else {
            JOptionPane.showMessageDialog(null, "Programa Finalizado.", "Finalizado", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        int opcaoFinal = JOptionPane.showConfirmDialog(null, "Deseja fazer uma nova conversão?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (opcaoFinal == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Programa Finalizado.", "Finalizado", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else {
           menuPrincipal();
        }
    }
}