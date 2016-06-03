package com.sigh;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GerarRelatorio {
    
    public void gerarRelatorio(GestaoQuartos n) throws FileNotFoundException, IOException{
        BufferedWriter arquivo = null;
        try{
            arquivo = new BufferedWriter(new FileWriter(new File("Relatorio.txt")));
            int soma = n.getLuxo().size() + n.getMaster().size() + n.getStandard().size();
            int qtd = 0;
            arquivo.write("Total de quartos "+soma+"");
            arquivo.newLine();
            for(int i=0;i<soma;i++){
                if(n.getLuxo().get(1).getCli() != null)
                    qtd++;
                if(n.getMaster().get(1).getCli() != null)
                    qtd++;
                if(n.getStandard().get(1).getCli() != null)
                    qtd++;
            }
            arquivo.newLine();
            arquivo.write("Valor total recebido: "+n.getValorMensal());
            arquivo.newLine();
            arquivo.write("Total de quartos ocupados: "+qtd);
            arquivo.newLine();
            arquivo.flush();
            arquivo.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
