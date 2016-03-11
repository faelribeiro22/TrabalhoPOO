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
        autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo.turini@caelum.com.br";
        autor.cpf = "123.456.789.10";
        
        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.adicionaValor(59.90); 
        livro.isbn = "978-85-66250-46-6";
        livro.autor = autor;
        
        livro.mostrarDetalhes();
        
        Livro outroLivro = new Livro();
        outroLivro.nome = "Lógica de programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.adicionaValor(59.90);
        outroLivro.isbn = "978-85-66250-22-8";
        
        Autor outroAutor = new Autor();
        outroAutor.nome = "Paulo Silveira";
        outroAutor.email = "paulo.silveira@caelum.com.br";
        outroAutor.cpf = "123.456.789-10";
        
        outroLivro.autor = outroAutor;
        
        outroLivro.mostrarDetalhes();
        
    }
}
