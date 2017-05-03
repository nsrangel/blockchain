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
public class Celula {
   Object item;
   Celula prox;

    public Celula(Object x) {
        this.item = x;
        this.prox = null;
    }

    public Object getItem() {
        return this.item;
    }

    public void setItem(Object x) {
        this.item = x;
    }

    public Celula getProx() {
        return this.prox;
    }

    public void setProx(Celula p) {
        this.prox = p;
    }  
}
