package com.sigh;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.Days;

public class Hospedagem {
    private Date dataE;
    private Date dataS;
    private Quarto quarto;
    private Cliente cli;
    private boolean ativo;
    private double valor;
    

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public Hospedagem(Date e, Date s, Quarto q, Cliente cli){
        this.dataE = e;
        this.dataS = s;
        this.quarto = q;
        this.cli = cli;
        this.ativo = true;
    }
    
    public Date getDataE() {
        return dataE;
    }

    public void setDataE(Date dataE) {
        this.dataE = dataE;
    }

    public Date getDataS() {
        return dataS;
    }

    public void setDataS(Date dataS) {
        this.dataS = dataS;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }
    
    public String checkOut(Date s){
        int diarias;
        DateTime dataS= new DateTime(s);
        DateTime dataSR = new DateTime(this.dataS);
        DateTime dataER = new DateTime(this.dataE);
        
        if(dataS.isEqual(dataSR)){
           diarias = Days.daysBetween(dataER, dataSR).getDays();
           valor = diarias * quarto.getValorDiaria();
           return "O valor da diário foi "+valor+". A quantidade de diárias foi de "+diarias;
        }else{
            diarias = Days.daysBetween(dataER, dataS).getDays();
            valor = diarias * quarto.getValorDiaria();
            return "O valor da diário foi "+valor+". A quantidade de diárias foi de "+diarias;
        }
        
    }
    
}
