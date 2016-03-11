/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livraria;

/**
 *
 * @author rafael
 */
public class Livro {
    public String nome;
    public String descricao;
    public String isbn;
    private double valor;
    public Autor autor;
    
    public void mostrarDetalhes(){
        System.out.println("Mostrando detalhes do livro ");
        System.out.println("Nome: "+nome);
        System.out.println("Descrição: "+descricao);
        System.out.println("Valor: "+retornaValor());
        System.out.println("ISBN: "+isbn);
        if(this.temAutor()){
            autor.mostrarDetalhes();
        }
        System.out.println("-----------------------------");
    }
    
    public void adicionaValor(double valor){
        this.valor = valor;
    }
    
    double retornaValor(){
        return this.valor;
    }
    
    public boolean aplicaDescontoDe(double porcentagem){
        if(porcentagem > 0.3)
            return false;
        this.valor -= this.valor*porcentagem;
        return true;
    }
    
    public boolean temAutor(){
        return this.autor != null;
    }
}
