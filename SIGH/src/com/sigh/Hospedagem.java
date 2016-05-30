package com.sigh;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
//import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.Days;

public class Hospedagem {
    private String dataE;
    private String dataS;
    private Quarto quarto;
    private Cliente cli;
    
    public Hospedagem(String dataE, String dataS, Quarto quarto, Cliente cli, int hospedes){
        this.dataE = dataE;
        this.dataS = dataS;
        this.quarto = quarto;
        //inserir exceção
        if(quarto.getCapacidade() >= hospedes){
            this.cli = cli;
        }
    }
    
    public boolean verificaDisponibilidade(String dataE1, String dataE2){
        return true;
    }
    
    /*
    public String checkOut() throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        DateTime data1 = new DateTime(format.parse(dataE).getTime());
        DateTime data2 = new DateTime(format.parse(dataS).getTime());
        
        int diferenca = Days.daysBetween(data1, data2).getDays();
        
        
        return "A diferença é : "+diferenca;
    }
    */
    
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
    
}
