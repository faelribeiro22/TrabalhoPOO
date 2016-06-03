package com.sigh;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.Days;

public abstract class Quarto {
    private int capacidade;
    private double valorDiaria;
    private Cliente cli;
    private int num;
    private String dataE;
    private String dataS;
    private ArrayList<Date> entrada;
    private ArrayList<Date> saida;

    public ArrayList<Date> getEntrada() {
        return entrada;
    }

    public void setEntrada(ArrayList<Date> entrada) {
        this.entrada = entrada;
    }

    public ArrayList<Date> getSaida() {
        return saida;
    }

    public void setSaida(ArrayList<Date> saida) {
        this.saida = saida;
    }

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
        return cli != null;
    }
    
    public boolean verificaCapacidade(int qtd){
        return this.capacidade <= qtd;
    }
    
    public boolean dataVagas(Date e, Date s){
        DateTime data = new DateTime(e);
        DateTime datas = new DateTime(s);
        boolean vago = false;
        for(int i=0;i<entrada.size();i++){
            DateTime dataRE = new DateTime(entrada.get(i).getTime());
            DateTime dataRS = new DateTime(saida.get(i).getTime());
            if(!data.isAfter(dataRE) && !data.isBefore(dataRS) && !data.isBefore(dataRE) && !data.isAfter(dataRS) && !data.isEqual(dataRE) && !data.isEqual(dataRS) || dataRE == null || dataRS == null){
                if(!datas.isAfter(dataRE) && !datas.isBefore(dataRS) || datas.isBefore(dataRE) && !datas.isEqual(dataRE) && datas.isEqual(dataRS)){
                    vago = true;
                }
            }else{
                vago = false;
            }
        }
        if(vago == true){
            entrada.add(e);
            saida.add(s);
            return true;
        }else
            return false;
    }
 
}
