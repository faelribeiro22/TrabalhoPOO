package com.sigh;
import java.util.Calendar;
import java.util.ArrayList;
public class Cliente extends Pessoa{
    private int cod;
    private Quarto quarto;
    private ArrayList<Hospedagem> historico;
    
    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
    
    public Cliente(String nome, String cpf, String telefone,int cod){
        super(nome,cpf,telefone);
        this.cod = cod;
        historico = new ArrayList<>();
    }

    public ArrayList<Hospedagem> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<Hospedagem> historico) {
        this.historico = historico;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

}
