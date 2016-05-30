package com.sigh;
public abstract class Quarto {
    private int capacidade;
    private double valorDiaria;
    private Cliente cli;
    private int num;
    private String dataE;
    private String dataS;

    public String getDataE() {
        return dataE;
    }

    public void setDataE(String dataE) {
        this.dataE = dataE;
    }

    public String getDataS() {
        return dataS;
    }

    public void setDataS(String dataS) {
        this.dataS = dataS;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    private int qtd;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }
    
    public Quarto(int num){
        this.num = num;
    }
    
    public boolean estaOcupado(){
        return cli == null;
    }
 
}
