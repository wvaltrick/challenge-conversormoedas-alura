package com.conversordemoedas.conversordemoedas;

import javax.swing.*;

public class ValorInserido {
    public static double inserirValor(){
        String input = JOptionPane.showInputDialog("Insira um Valor:");

        if (input == null){
            System.out.println("cancelou");
            MenuPrincipal.menuPrincipal();
            return 0;
        } else {
            boolean valido = validarNumeros(input);
            if (valido) {
                System.out.println("Número Válido");
                double valorDigitado = Double.parseDouble(input);
                return valorDigitado;
            } else {
                System.out.println("Entrada inválida");
                JOptionPane.showMessageDialog(null, "Valor inválido", "Erro", JOptionPane.ERROR_MESSAGE);
                return inserirValor();
            }
        }
    }
    static boolean validarNumeros(String input) {
        // Verifica se o texto contém apenas números
        boolean b = input.matches("\\d{1,9}([.,]\\d{3})*(\\.\\d{2})?");
        System.out.println(b);
        return b;
    }
}
