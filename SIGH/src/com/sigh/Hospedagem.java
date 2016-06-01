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
    
    public boolean CheckIn(String dataE, String dataS, Quarto quarto, Cliente cli, int hospedes){
        this.dataE = dataE;
        this.dataS = dataS;
        this.quarto = quarto;
        //inserir exceção
        if(quarto.getCapacidade() >= hospedes){
            this.cli = cli;
            return true;
        }
        return false;
    }
    
    public boolean verificaDisponibilidade(String dataE1, String dataS1, String dataE2, String dataS2) throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        DateTime dataE = new DateTime(format.parse(dataE1).getTime());
        DateTime dataS = new DateTime(format.parse(dataS1).getTime());
        DateTime dataCE = new DateTime(format.parse(dataE2).getTime());
        DateTime dataCS = new DateTime(format.parse(dataS2).getTime());
        if(dataE.isAfter(dataCE) && dataE.isBefore(dataCS))
            return false;
        else if(dataE.isEqual(dataCE) || dataE.isEqual(dataCS))
            return false;
        else if(dataE.isBefore(dataCE) && dataS.isAfter(dataCS))
            return false;
        else if(dataS.isAfter(dataCE) && dataS.isBefore(dataCS))
            return false;
        else if(dataS.isBefore(dataCE) && dataS.isBefore(dataCS))
            return false;
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
