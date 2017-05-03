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
public class Lista {
    private Celula primeiro, ultimo; 
            //pos;
    
    public Lista() { // Cria uma lista vazia
        this.primeiro= null;
        this.ultimo= null;
        //this.pos= null;
    }
    public boolean eVazia(){
        return (this.primeiro == null);
    }
    public void insereFinal(Object x){
        Celula c = new Celula(x);
        if (this.eVazia()){
            this.primeiro= this.ultimo= c;
        }
        else {
            this.ultimo.setProx(c);
            this.ultimo= c;
        }
    }
    public void insereInicio(Object x){
        Celula c = new Celula(x);
        if (this.eVazia()){
            this.primeiro= this.ultimo= c;
        }
        else {
            c.setProx(primeiro);
            this.primeiro= c;
        }
    }
    
    public Object busca(Object chave){
        for(Celula aux = this.primeiro; aux != null; aux = aux.getProx()){
            if (aux.getItem().equals(chave))
                return aux.getItem();
        }
        return null;
    }
    
    public int buscaQtd(Object chave){
        int qtd=0;
        for(Celula aux = this.primeiro; aux != null; aux = aux.getProx()){
            if (aux.getItem().equals(chave))
                qtd++;
        }
        return qtd;
    }
    
    public Celula buscaCelula(Object chave){
        for (Celula aux = this.primeiro; aux != null; aux = aux.getProx()){
            if (aux.getItem().equals(chave)){
                return aux;
            }
    }
        return null;
    }
    
    public Object removePrimeiro(){
        if(this.eVazia()){
            return null;
        }
        else{
            Celula aux = this.primeiro;
            this.primeiro = aux.getProx();
            //aux.setProx(null);
            if(aux==this.ultimo)
                this.ultimo=null;
            return aux.getItem();
        }
    }
    public void removeUltimo() {
        int i = 0;
        if(this.eVazia()){
            System.out.println("Lista Vazia");
        }
        for (Celula aux = this.primeiro; aux != null; aux = aux.getProx()) {
            if (aux==this.ultimo) {
                remove(aux.getItem());
            }
        }
    }
    
    public void insereDepois(Celula c, Object e){
        if (c==null || e == null)
            return;
        
        Celula nova = new Celula(e);//6
        nova.setProx(c.getProx()); //6 - 15>x
        c.setProx(nova);// 15 - 6    
    }
    
    public void insereAntes(Celula c, Object e){
        if (c==null || e == null)
            return;
        
        Celula nova = new Celula(e);//6
        for (Celula aux = this.primeiro; aux != null; aux = aux.getProx()) {
        c.setItem(nova);
        
        //c.setProx(nova.getProx()); //6 - 15>x
        ;// 15 - 6    
    }}
    
    
    
    public Object ultimoElemento(){
        if(this.eVazia()){
            return null;
        }
        else{
            Celula aux = this.primeiro;
            for(; aux.getProx() !=null; aux=aux.getProx()){};
            return aux.getItem();
        }
           
    }
    
    public void imprime(){
        System.out.print("\n[");
        for (Celula aux= primeiro; aux != null; aux= aux.getProx())
            //System.out.print(" " + ((Integer)aux.getItem()).intValue());
            System.out.print(" " + aux.getItem());
        System.out.println(" ]");
    }
    
    public int tamanho(){
        int qtd = 0;
        for(Celula aux= primeiro; aux != null; aux= aux.getProx())
        qtd++;
        return qtd;
    }
    
    public Object remove(Object x) {
        if (this.eVazia() || x == null)          // Lista vazia ou objeto nulo
            return null;
        if (this.primeiro.getItem().equals(x)){ // remove primeiro
            Celula aux= this.primeiro;
            this.primeiro= this.primeiro.getProx();
            if (aux==this.ultimo) this.ultimo= null;
            return aux.getItem();
        }
        Celula ant, rem;
        for(ant= this.primeiro, rem= this.primeiro.getProx();
            rem != null && !rem.getItem().equals(x);
            ant=rem, rem= rem.getProx());       // rem deve ser removido
        if (rem == null)                         // chave nao encontrada
            return null;
        if (rem.getProx()==null)                // remocao do ultimo elemento
            ultimo=ant;
        ant.setProx(rem.getProx());
        return rem.getItem();
    }
}
