/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Cliente
 */
public class Poupanca extends Conta{

    public Poupanca(float saldo, String nomeCompleto, int agencia, int conta) {
        super(saldo, nomeCompleto, agencia, conta);
    }

    public Poupanca() {
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
        String saida = "Conta Poupanca: \n";
        saida += "Nome completo:" + nomeCompleto + "\n";
        saida += "Agencia:" + agencia + "\n";
        saida += "Conta:" + conta + "\n";
        saida += "Saldo:" + saldo + "\n";
        return saida;
    }
    
}
