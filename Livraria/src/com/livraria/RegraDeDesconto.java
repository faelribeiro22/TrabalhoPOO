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
        
        Livro livro = new Livro();
        livro.setValor(59.90);
        
        System.out.println("Valor atual: "+livro.getValor());
        
        if(!livro.aplicaDescontoDe(0.4)){
            System.out.println("Desconto não pode ser mairo que 30%");
        }else{
            System.out.println("Valor com desconto: "+livro.getValor());
        }
    }
}
