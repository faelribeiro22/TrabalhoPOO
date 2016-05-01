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
public abstract class Livro {
    private String nome;
    private String descricao;
    private String isbn;
    private double valor;
    private Autor autor;
    
    public Livro(Autor autor){
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
    }
    
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
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public double getValor(){
        return valor;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getIsbn(){
        return isbn;
    }
    
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    public Autor getAutor(){
        return autor;
    }
    
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    
    public boolean aplicaDescontoDe(double porcentagem){
        return false;
    }
    
    public boolean temAutor(){
        return this.autor != null;
    }
}
