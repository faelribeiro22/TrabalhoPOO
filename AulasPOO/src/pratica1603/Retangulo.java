package pratica1603;

public class Retangulo {
    double base;
    double altura;
    
    void alteraBase(double valor){
        base = valor;
    }
    
    void alteraAltura(double valor){
        altura = valor;
    }
    
    double retornaBase(){
        return base;
    }
    
    double retornaAltura(){
        return altura;
    }
    
    double calculaPerimetro(){
        return base+altura;
    }
    
    double calculaArea(){
        return base*altura;
    }
    
    boolean quadrado(){
        return base == altura;
    }
}
