package com.sigh;

import java.text.ParseException;

public class Teste {
    public static void main(String a[]) throws ParseException{
        Cliente cli = new Cliente("Rafael","1111111","222222",1);
        Standard s = new Standard(cli);
        Hospedagem h = new Hospedagem("20160520","20160620",s,cli,3);
        
        System.out.println(h.checkOut());
        
    }
}
