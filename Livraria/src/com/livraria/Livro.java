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
    public double valor;
    public Autor autor;
    
    public void mostrarDetalhes(){
        System.out.println("Mostrando detalhes do livro ");
        System.out.println("Nome: "+nome);
        System.out.println("Descrição: "+descricao);
        System.out.println("Valor: "+valor);
        System.out.println("ISBN: "+isbn);
        if(this.temAutor()){
            autor.mostrarDetalhes();
        }
        System.out.println("-----------------------------");
    }
    
    public void aplicaDescontoDe(double porcentagem){
        this.valor -= this.valor*porcentagem;
    }
    
    public boolean temAutor(){
        return this.autor != null;
    }
}
