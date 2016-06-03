package com.sigh;
import java.util.ArrayList;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
//import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.Days;


public class GestaoQuartos {
    private ArrayList<Standard> standard;
    private ArrayList<Master> master;
    private ArrayList<Luxo> luxo;
    private ArrayList<Cliente> hospedes;
    private double valorMensal;

    public double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }
    
    public GestaoQuartos(){
        standard = new ArrayList<>();
        master = new ArrayList<>();
        luxo = new ArrayList<>();
        hospedes = new ArrayList<>();
        int i;
        for(i=1;i<=5;i++){
            Standard s = new Standard(i);
            standard.add(s);
        }
        for(i=6;i<=8;i++){
            Luxo l = new Luxo(i);
            luxo.add(l);
        }
        for(i=9;i<=10;i++){
            Master m = new Master(i);
            master.add(m);
        }
        valorMensal = 0;
    }
    
    public ArrayList<Cliente> getHospedes(){
        return hospedes;
    }
    
    public void setHospedes(ArrayList<Cliente> h){
        this.hospedes = h;
    }
    
    public ArrayList<Standard> getStandard() {
        return standard;
    }

    public void setStandard(ArrayList<Standard> standard) {
        this.standard = standard;
    }

    public ArrayList<Master> getMaster() {
        return master;
    }

    public void setMaster(ArrayList<Master> master) {
        this.master = master;
    }

    public ArrayList<Luxo> getLuxo() {
        return luxo;
    }

    public void setLuxo(ArrayList<Luxo> luxo) {
        this.luxo = luxo;
    }
    
    
    
}
