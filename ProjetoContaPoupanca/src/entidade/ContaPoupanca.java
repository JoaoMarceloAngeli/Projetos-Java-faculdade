/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author Pedro Francisco
 */
public class ContaPoupanca {
    private String NomeCompleto = "";
    private int Agencia = 0;
    private int numeroDaConta = 0;
    private float saldo = 0;
    
     public ContaPoupanca(String NomeCompleto, int Agencia, int numeroDaConta, float saldo,float valor)throws Exception {
        if(NomeCompleto.isEmpty()) 
            throw new Exception("Nome não pode ser vazio");
        this.NomeCompleto = NomeCompleto;
        if(Agencia <= 0) 
            throw new Exception("Agencia não pode ser <=0");
        this.Agencia = Agencia;
        if(numeroDaConta <= 0) 
            throw new Exception("Numero da Conta não pode ser <=0");
        this.numeroDaConta = numeroDaConta;
        if (valor<1000)
            throw new Exception("valor o saque não pode ser <1000");
        if (valor > saldo)
            throw new Exception("Falta cracole");
    }

    public ContaPoupanca(String nome, int agencia, int numero, float saldo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNomecompleto() {
        return NomeCompleto;
    }

    public void setNomecompleto(String NomeCompleto) throws Exception {
        if (NomeCompleto.isEmpty()){
            throw new Exception("Nome não pode ser vazio");
        }
        this.NomeCompleto = NomeCompleto;
    }

    public int getAgencia() {
        return Agencia;
    }

    public void setAgencia(int agencia) throws Exception {
        if (Agencia<=0){
            throw new Exception("Agencia não pode ser <=0");
        }
        
        this.Agencia = agencia;
    }

    public int getNomeDaConta() {
        return numeroDaConta;
    }

    public void setnumeroDaConta(int numeroDaConta) throws Exception {
        if (numeroDaConta <= 0){
            throw new Exception("Nome da conta não pode ser <=0");
        } 
        this.numeroDaConta = numeroDaConta;
    }
    public float GetSaldo(){
        return saldo;
    }
    public float sacar(float valor)throws Exception{
        if (valor==0)
            throw new Exception("valor o saque não pode ser <=0");
        if (valor > saldo)
            throw new Exception("Falta cracole");
            
        saldo -= valor;
        return valor;
    }      public String emitirSaldo(){
        String saida = "Banco Seu Dinheiro e MEU\n";
        saida += "Agencia: " + Agencia + "\n";
        saida += "Número da Conta: " + numeroDaConta + "\n";
        saida += "Nome do Cliente: " + NomeCompleto + "\n";
        saida += "Saldo: R$ " + saldo + "\n";
        return saida;
    }

    public String getsaldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void depositar(float valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
