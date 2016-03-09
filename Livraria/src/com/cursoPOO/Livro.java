/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursoPOO;

/**
 *
 * @author faelr
 */
public class Livro {
    public String nome;
    public String descricao;
    public double valor;
    public String isbn;
    public Autor autor;
   
    void mostrarDetalhes(){
        String mensagem = "Mostrando detalhes do livro";
        System.out.println(mensagem);
        System.out.println("Nome: "+nome);
        System.out.println("Descrição: "+descricao);
        System.out.println("Valor: "+valor);
        System.out.println("ISBN: "+isbn);
        System.out.println("------------");
    }
}
