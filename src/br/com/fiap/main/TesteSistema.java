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
        Produto objProduto = new Produto();

        objProduto.setCodigo(inteiro("Informe o codigo:"));
        objProduto.setTipo(texto("Tipo Produto"));
        objProduto.setMarca(texto("Marca"));
        objProduto.setQuantidade(inteiro("Quantidade"));
        objProduto.setValor(real("Valor"));

        System.out.println(objProduto);
    }
}

