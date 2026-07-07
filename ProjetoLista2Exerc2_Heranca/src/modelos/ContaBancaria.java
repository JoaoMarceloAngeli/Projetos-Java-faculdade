/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

public abstract class ContaBancaria {
	private int conta = 0;
	private int agencia = 0;
	protected float saldo = 0;
        
	public ContaBancaria(int conta, int agencia, float saldo) {
            this.conta = conta;
            this.agencia = agencia;
            this.saldo = saldo;
	}
	public ContaBancaria() {
	}
	public int getConta() {
		return 0;
	}
	public void setConta(int conta) {
            this.conta = conta;
	}
	public int getAgencia() {
		return 0;
	}
	public void setAgencia(int agencia) {
            this.agencia = agencia;
	}
	public float getSaldo() {
		return 0;
	}
	public void setSaldo(float saldo) {
            this.saldo = saldo;
	}
	
	public abstract float depositar(double valor);
	public abstract float sacar(double valor);
	public abstract float Extrato();
        
        @Override
        public String toString() {
            return "ContaBancaria{" + "conta=" + conta + ", agencia=" + agencia + ", saldo=" + saldo + '}';
        }

}

