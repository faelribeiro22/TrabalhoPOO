package banco;

import java.util.Scanner;

public class Principal {
    
    static int ctContas = 0;
    static Cliente v[] = new Cliente[500];
    
    static Cliente buscaCliente(String u, String s) {
        for (int i=0;i<ctContas;i++)
            if (v[i].usuario.equals(u) && v[i].senha.equals(s))
                return v[i];
        return null;
    }
    
    static Conta buscaConta(int n) {
        for (int i=0;i<ctContas;i++)
            if (v[i].contas[i].numero == n)
                return v[i].contas[i];
        return null;
    }
    
    static void buscaNegativado(){
        for(int i = 0; i<ctContas; i++){
            if(v[i].contas[i].saldo < 0){
                System.out.println(v[i].nome);
            }
        }
    }
    
    public static void main(String a[]) {        
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        
        while (opcao != 7) {
        
            System.out.println("=== BANCO ===");
            System.out.println("1) Cadastrar cliente");
            System.out.println("2) Saldo");
            System.out.println("3) Sacar");
            System.out.println("4) Depositar");
            System.out.println("5) Transferir");
            System.out.println("6) Relatorio");
            System.out.println("7) Clientes negativados");
            System.out.println("8) Atribuir nova conta a um cliente");
            System.out.println("9) Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String n = sc.nextLine();
                    System.out.print("CPF: ");
                    String c = sc.nextLine();
                    System.out.print("Idade: ");
                    int i = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Telefone: ");
                    String t = sc.nextLine();
                    System.out.print("Usuario: ");
                    String u = sc.nextLine();
                    System.out.print("Senha: ");
                    String s = sc.nextLine();
                    System.out.print("Valor inicial: ");
                    float v1 = sc.nextFloat();
                    sc.nextLine();
                    System.out.print("Tipo da Conta: ");
                    String tp = sc.nextLine();
                    Conta c1 = new Conta();
                    c1.cadastraConta((ctContas+1),v1,tp);                    
                    Cliente cli1 = new Cliente();
                    cli1.cadastraCliente(n,c,t,i,c1,u,s);
                    v[ctContas] = cli1;
                    ctContas++;
                    break;
                case 2:
                    System.out.print("Usuario: ");
                    u = sc.nextLine();
                    System.out.print("Senha: ");
                    s = sc.nextLine();
                    Cliente cli = buscaCliente(u, s);
                    if (cli != null){
                        if(cli.qtd == 0){
                            System.out.print("O saldo da Conta é: ");
                            cli.contas[0].saldo();
                        }else{
                            for(int j = 0; j<cli.qtd;j++){
                                System.out.print("O saldo da conta "+j+1+"é: ");
                                cli.contas[j].saldo();
                            }
                        }
                    } else
                        System.out.println("Cliente nao encontrado!");
                    break;
                case 3:    
                    System.out.print("Usuario: ");
                    u = sc.nextLine();
                    System.out.print("Senha: ");
                    s = sc.nextLine();
                    cli = buscaCliente(u, s);
                    if (cli != null) {
                        System.out.print("Valor: ");
                        float vl = sc.nextFloat();
                        sc.nextLine();
                        if(cli.qtd != 0){
                            System.out.println("Qual das contas você deseja sacar? ");
                            int esc = sc.nextInt();
                            cli.contas[esc].sacar(vl);
                        }else{
                            cli.contas[0].sacar(vl);
                        }
                    }else
                        System.out.println("Cliente nao encontrado!");
                    break;
                case 4:
                    System.out.print("Usuario: ");
                    u = sc.nextLine();
                    System.out.print("Senha: ");
                    s = sc.nextLine();
                    cli = buscaCliente(u, s);
                    if (cli != null) {
                        System.out.print("Valor: ");
                        float vl = sc.nextFloat();
                        sc.nextLine();
                        if(cli.qtd != 0){
                            System.out.println("Qual conta deseja depositar? ");
                            int esc = sc.nextInt();
                            cli.contas[esc].depositar(vl);
                        }else{
                            cli.contas[0].depositar(vl);
                        }
                    }else
                        System.out.println("Cliente nao encontrado!");
                    break;
                case 5:
                    System.out.print("Usuario: ");
                    u = sc.nextLine();
                    System.out.print("Senha: ");
                    s = sc.nextLine();
                    cli = buscaCliente(u, s);
                    if (cli != null) {
                        System.out.print("Valor: ");
                        float vl = sc.nextFloat();
                        sc.nextLine();
                        System.out.print("Numero da conta destino: ");
                        int ct = sc.nextInt();
                        sc.nextLine();
                        Conta cont = buscaConta(ct);
                        if (cont != null) {
                            if(cli.qtd != 0){
                                System.out.println("Qual das contas vinculadas deseja fazer a transferencia?");
                                int esc = sc.nextInt();
                                cli.contas[esc].transfere(vl, cont);
                            }else{
                                cli.contas[0].transfere(vl,cont);
                            }
                        }else
                            System.out.println("Conta destino nao encontrada!");
                    }else
                        System.out.println("Cliente nao encontrado!");
                    break;
                case 6:
                    for (int ii=0;ii<ctContas;ii++){
                        if(v[ii].qtd !=0){
                            for(int yy=0;yy<v[ii].qtd;yy++){
                                System.out.println(v[ii].contas[yy].numero+" - "+v[ii].nome+" - "+v[ii].contas[yy].saldo+ " - Contas atribuidas: "+v[ii].qtd+1);
                            }
                        }else{
                            System.out.println(v[ii].contas[0].numero+" - "+v[ii].nome+" - "+v[ii].contas[0].saldo);
                        }
                        
                    }
                    break;
                case 9:
                    buscaNegativado();
                    break;
                case 8:
                    System.out.print("Usuario: ");
                    u = sc.nextLine();
                    System.out.print("Senha: ");
                    s = sc.nextLine();
                    cli = buscaCliente(u, s);
                    if(cli != null){
                        Conta novaConta = new Conta();
                        System.out.println("Digite o valor inicial: ");
                        float valor = sc.nextFloat();
                        System.out.println("Digite o número da conta: ");
                        int numConta = sc.nextInt();
                        System.out.println("Digite o tipo da conta");
                        String tipoConta = sc.nextLine();
                        novaConta.cadastraConta(numConta, valor,tipoConta);
                        cli.cadastraConta(novaConta);
                    }
                    break;
            }
            
        
        }
        
        
    }
    
}
