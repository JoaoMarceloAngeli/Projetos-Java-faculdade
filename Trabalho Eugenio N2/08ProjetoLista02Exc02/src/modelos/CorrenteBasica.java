/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Cliente
 */
public class CorrenteBasica extends Poupanca{
    //atributos
    protected float taxaAnuidade = 0;
    
    //metodos
    public CorrenteBasica(float saldo, String nomeCompleto, int agencia, int conta, float taxaAnuidade) {
        super(saldo, nomeCompleto, agencia, conta);
        this.taxaAnuidade = taxaAnuidade;
    }

    public CorrenteBasica() {
    }

    public float getTaxaAnuidade() {
        return taxaAnuidade;
    }

    public void setTaxaAnuidade(float taxaAnuidade) {
        this.taxaAnuidade = taxaAnuidade;
    }

    @Override
    public void sacar(float valor) {
         saldo -= valor;
    }

    @Override
    public void depositar(float valor) {
         saldo += valor;
    }

    @Override
    public String emitirSaldo() {
        String saida = "Conta Corrente Basica: \n";
        saida += "Nome completo:" + nomeCompleto + "\n";
        saida += "Agencia:" + agencia + "\n";
        saida += "Conta:" + conta + "\n";
        saida += "Taxa de anuidade da conta:" + taxaAnuidade + "\n";
        saida += "Saldo com a taxa de Anuidade:" + (saldo-taxaAnuidade) + "\n";
        return saida;    
    }

    
}
