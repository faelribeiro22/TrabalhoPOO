package banco;

public class Cliente {
    
    String nome, CPF, telefone;
    int idade;
    Conta contas[] = new Conta[10];
    String usuario,senha;
    int qtd = 0;
    
    void cadastraCliente(String nome1,String CPF1,String telefone1,int idade1,
                         Conta conta1,String usuario1,String senha1) {
        nome = nome1;
        CPF = CPF1;
        telefone = telefone1;
        idade = idade1;
        contas[qtd] = new Conta();
        contas[qtd] = conta1;
        usuario = usuario1;
        senha = senha1;
    }
    
    void cadastraConta(Conta conta){
        contas[qtd] = conta;
        qtd++;
    }
    
    
    
}
