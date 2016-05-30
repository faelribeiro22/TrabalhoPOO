package com.sigh;
public abstract class Pessoa {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    private String nome;
    private String cpf;
    private String telefone;
    
    public Pessoa(String n, String cpf, String tel){
        this.nome = n;
        this.telefone = tel;
        this.cpf = cpf;
    }
}
