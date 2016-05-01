package pratica1603;

public class Triangulo {
    
    double lado1;
    double lado2;
    double lado3;
    
    void alteraLado1(double valor){
        lado1 = valor;
    }
    
    void alteraLado2(double valor){
        lado2 = valor;
    }
    
    void alteraLado3(double valor){
        lado3 = valor;
    }
    
    double retornaLado1(){
        return lado1;
    }
    
    double retornaLado2(){
        return lado2;
    }
    
    double retornaLado3(){
        return lado3;
    }
    
    double perimetro(){
        return lado1 + lado2 + lado3;
    }
    
    boolean equilatero(){
        return lado1 == lado2 && lado2 == lado3;
    }
    
    boolean isosceles(){
        return lado1 == lado2 || lado1 == lado3 || lado3 == lado2;
    }
    
    boolean escaleno(){
        return lado1 != lado2 && lado1 != lado3 && lado2 != lado3;
    }
}
