/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nicolas.blockchain;

/**
 *
 * @author 41381637
 */
public class Blockchain {

    public static void main(String[] args) {

        Lista umaL = new Lista();
        umaL.insereFinal(10);
        umaL.insereFinal(5);
        umaL.insereFinal(42);
        umaL.insereInicio(15);
        umaL.insereFinal(12);
        umaL.imprime();
        System.out.println("Tamanho:" + umaL.tamanho());
        System.out.println("Quantidade do numero 10: "+ umaL.buscaQtd(10));
        
        Celula c = umaL.buscaCelula(12);
        umaL.insereAntes(c, 6);
        umaL.imprime();
    }
    
}
