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
public class RegrasDeDesconto {
    
    public static void main(String[] args){
        
        Livro livro = new Livro();
        livro.adicionaValor(59.90);
        
        System.out.println("Valor atual: "+livro.retornaValor());
        
        if(!livro.aplicaDescontoDe(0.4))
            System.out.println("Desconto não pode ser maior do que 30%");
        else
            System.out.println("Valor com desconto: "+livro.retornaValor());
    }
}
