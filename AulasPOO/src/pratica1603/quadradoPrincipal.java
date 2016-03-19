package pratica1603;

public class quadradoPrincipal {
    public static void main(String a[]){
        Retangulo r = new Retangulo();
        r.alteraAltura(10);
        r.alteraBase(10);
        
        System.out.println("Perímetro é: "+r.calculaPerimetro());
        System.out.println("Área: "+r.calculaArea());
        
        if(r.quadrado()){
            System.out.println("É quadrado");
        }else{
            System.out.println("Não é quadrado");
        }
    }
}
