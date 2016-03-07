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
public class CadastroDeLivros {
    
    public static void main(String[] args){
        
        Autor autor = new Autor();
        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";
        
        livro.mostrarDetalhes();
        
        Livro outroLivro = new Livro();
        outroLivro.nome = "Lógica de programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-22-8";
        outroLivro.mostrarDetalhes();
    }
}
