/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Cliente
 */
public class CorrenteLimite extends CorrenteBasica{
    private float limite = 0;

    public CorrenteLimite(float saldo, String nomeCompleto, int agencia, int conta, float taxaAnuidade, float limite) {
        super(saldo, nomeCompleto, agencia, conta, taxaAnuidade);
        this.limite = limite;
    }

    public CorrenteLimite() {
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public String emitirSaldo() {
        String saida = "Conta Corrente com Limite: \n";
        saida += "Nome completo:" + nomeCompleto + "\n";
        saida += "Agencia:" + agencia + "\n";
        saida += "Conta:" + conta + "\n";
        saida += "Taxa de anuidade da conta:" + taxaAnuidade + "\n";
        saida += "Limite:" + limite + "\n";
        saida += "Saldo com a taxa de anuidade e o limite:" + (saldo + limite - taxaAnuidade) + "\n";
        return saida;    
    }

    @Override
    public void depositar(float valor) {
         saldo += valor;
    }

    @Override
    public void sacar(float valor) {
        if(valor <= saldo + limite - taxaAnuidade)  saldo -= valor;
    }
    
}
