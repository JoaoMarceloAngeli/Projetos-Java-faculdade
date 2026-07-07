/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
public class ContaCorrenteComLimite extends ContaBancaria {

    private float limite = 0;
    private double taxa = 0;
    
    public ContaCorrenteComLimite(int conta, int agencia, float saldo, float limite, double taxa) {
        super(conta,agencia,saldo);
        this.limite = limite;
        this.taxa = taxa;
    } 
    public ContaCorrenteComLimite() {
    }
    public float getLimite() {
        return 0;
    }
    public void setLimite(float limite) {
        this.limite = limite;
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
    public float depositar(double valor) {
        if(valor > limite) System.out.print("O valor é maior que o limite da conta.");
        else saldo += valor;
        return saldo;
    }
    @Override
    public float Extrato(){
        return saldo - deduzirTaxa();
    }
    @Override
    public String toString() {
        return "ContaCorrenteComLimite{" + super.toString() + "limite=" + limite + '}';
    }
    
}

