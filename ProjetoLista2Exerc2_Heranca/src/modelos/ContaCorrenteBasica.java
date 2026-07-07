/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

public class ContaCorrenteBasica extends ContaBancaria {

	private double taxa = 0;

	public ContaCorrenteBasica() {
	}
	public ContaCorrenteBasica(int conta, int agencia, float saldo, double taxa) {
            super(conta,agencia,saldo);
            this.taxa = taxa;
	}
	public double getTaxa() {
		return 0;
	}
	public void setTaxa(double taxa) {
            this.taxa = taxa;
	}
	public float deduzirTaxa() {
		return (float) (saldo * taxa);
	}
        @Override
	public float sacar(double valor) {
            if (saldo >= valor) saldo -= valor;
            else System.out.println("Tá sem grana.");
            return saldo;
	}
        @Override
        public float depositar(double valor){
            return saldo += valor;
        }
        @Override
        public float Extrato(){
            return saldo - deduzirTaxa();
        }
        @Override
        public String toString() {
            return "ContaCorrenteBasica{" + super.toString() + "taxa=" + taxa + '}';
        }
        
}

