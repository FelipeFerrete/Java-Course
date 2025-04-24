package br.com.fiap.main;

import br.com.fiap.beans.Produto;

import javax.swing.*;

public class TesteSistema {

        static String texto(String j){
            return JOptionPane.showInputDialog(j);
        }


        static int inteiro(String j){
            return Integer.parseInt(JOptionPane.showInputDialog(j));
        }

        static double real(String j){
            return Double.parseDouble(JOptionPane.showInputDialog(j));
        }

    public static void main(String[] args) {
        Produto objProduto = new Produto(
                inteiro("Informe o codigo:"),
                texto("Tipo Produto"),
                texto("Marca"),
                inteiro("Quantidade"),
                real("Valor")
        );


        System.out.println(objProduto);
    }
}

