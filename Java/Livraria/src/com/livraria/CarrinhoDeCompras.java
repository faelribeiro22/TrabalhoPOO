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
public class CarrinhoDeCompras {
    
    private double total;
    
    public void adiciona(Livro livro){
        /*
        Ebook ebook = (Ebook) livro;
        ebook.getWaterMark();
        */
        System.out.println("Adicionando: "+livro);
        livro.aplicaDescontoDe(0.05);
        total += livro.getValor();
    }
    
    public void adiciona(Revista revista){
        System.out.println("Adicionando: "+revista);
        revista.aplicaDescontoDe(0.05);
        total += revista.getValor();
    }
    
    public double getTotal(){
        return total;
    }
}
