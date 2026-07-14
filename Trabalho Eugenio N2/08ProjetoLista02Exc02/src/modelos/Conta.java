/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Cliente
 */
abstract public class Conta {
    //atributos
  protected float saldo = 0;
  protected String nomeCompleto = " ";
  protected int agencia = 0;
  protected int conta = 0;
  //metodos

    public Conta(float saldo, String nomeCompleto, int agencia, int conta) {
        this.saldo = saldo;
        this.nomeCompleto = nomeCompleto;
        this.agencia = agencia;
        this.conta = conta;
    }

    public Conta() {
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
  
    abstract public void sacar(float valor);
    abstract public void depositar(float valor);
    abstract public String emitirSaldo();
}
