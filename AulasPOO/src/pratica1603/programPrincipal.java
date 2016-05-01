package pratica1603;

public class programPrincipal {
    public static void main(String args[]){
        Triangulo t = new Triangulo();
        double p;
        t.alteraLado1(3);
        t.alteraLado2(5);
        t.alteraLado3(4);
        p = t.perimetro();
        System.out.println("O perimetro é: "+p);
        
        if(t.equilatero()){
            System.out.println("O triângulo é equilátero");
        }
        if(t.isosceles() && !t.equilatero()){
            System.out.println("O triângulo é isósceles");
        }
        if(t.escaleno()){
            System.out.println("O triângulo é escaleno");
        }
    }
}
