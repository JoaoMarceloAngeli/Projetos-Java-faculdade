/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
public class ContaPoupanca extends ContaBancaria {

    private double taxaDeJuros = 0;

    public ContaPoupanca() {
    }
    public ContaPoupanca(int conta, int agencia, float saldo, double taxaDeJuros) {
        super(conta,agencia,saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getTaxaDeJuros() {
            return 0;
    }
    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
    @Override
    public float sacar(double valor) {
        if (saldo >= valor) {
        saldo -= valor;
    } else {
        System.out.println("Tá sem grana.");
    }
    return saldo;
}
    @Override
    public float depositar(double valor){
        return saldo += valor;
    }
    public float calcularJuros() {
        return (float) (saldo * taxaDeJuros);
    }
    @Override
    public float Extrato(){
        return saldo + calcularJuros();
    }
    @Override
    public String toString() {
        return "ContaPoupanca{" + super.toString() + "taxaDeJuros=" + taxaDeJuros + '}';
    }
    
}

