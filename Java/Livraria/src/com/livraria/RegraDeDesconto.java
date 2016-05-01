/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livraria;

/**
 *
 * @author faelr
 */
public class RegraDeDesconto {
    
    public static void main(String[] args){
        
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        
        Livro livro = new Minilivro(autor);
        livro.setValor(39.90);
        
        System.out.println("Valor atual: "+livro.getValor());
        
        if(!livro.aplicaDescontoDe(0.3)){
            System.out.println("Desconto não pode ser mairo que 30%");
        }else{
            System.out.println("Valor com desconto: "+livro.getValor());
        }
        
        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);
        
        if(!ebook.aplicaDescontoDe(0.15)){
            System.out.println("Desconto no ebook não pode ser maior do que 15%");
        }else{
            System.out.println("Valor do ebook em desconto: "+ebook.getValor());
        }
    }
}
