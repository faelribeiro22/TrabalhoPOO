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
public class Autor {
    public String nome;
    public String email;
    public String cpf;
    
    public void mostrarDetalhes(){
        System.out.println("Mostrando detalhes do autor");
        System.out.println("Nome: "+nome);
        System.out.println("Email: "+email);
        System.out.println("CPF: "+cpf);
    }
}
