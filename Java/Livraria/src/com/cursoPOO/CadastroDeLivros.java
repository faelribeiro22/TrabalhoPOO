package com.cursoPOO;

public class CadastroDeLivros {
    
    public static void main(String[] args){
        
        Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo.turini@caelum.com.br";
        autor.cpf = "123.456.789.10";
        Livro livro = new Livro();
        livro.nome = "Java 8 Prárico";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-45-6";
        livro.mostrarDetalhes();
        
        Livro livro2 = new Livro();
        livro2.nome = "Lógica de Programação";
        livro2.descricao = "Crie seus primeiros programas";
        livro2.valor = 59.90;
        livro2.isbn = "978-85-66250-22-0";
        livro2.mostrarDetalhes();
        
    }
    
}
