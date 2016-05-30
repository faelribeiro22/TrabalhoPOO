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
    
    public GestaoQuartos(){
        standard = new ArrayList<>();
        master = new ArrayList<>();
        luxo = new ArrayList<>();
        hospedes = new ArrayList<>();
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
