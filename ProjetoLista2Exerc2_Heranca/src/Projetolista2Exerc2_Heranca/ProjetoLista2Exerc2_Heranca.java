/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projetolista2Exerc2_Heranca;
import modelos.ContaPoupanca;
import modelos.ContaCorrenteComLimite;
import modelos.ContaCorrenteBasica;
public class ProjetoLista2Exerc2_Heranca {
    public static void main(String[] args) throws Exception{
            try {
                ContaPoupanca poup = new ContaPoupanca(1234, 000111, 550, 0.03);
                System.out.println(poup.toString());
                System.out.println("Saque(550): " + poup.sacar(550.0));
                System.out.println("Deposito(50): " + poup.depositar(50.0));
                System.out.println("Juros: " + poup.calcularJuros());
                System.out.println("Extrato: " + poup.Extrato());

                ContaCorrenteBasica corr = new ContaCorrenteBasica(5678, 222333, 300, 0.02);
                System.out.println(corr.toString());
                System.out.println("Saque(300): " + corr.sacar(300.0));
                System.out.println("Deposito(310): " + corr.depositar(310.0));
                System.out.println("Taxa: " + corr.deduzirTaxa());
                System.out.println("Extrato: " + corr.Extrato());

                ContaCorrenteComLimite lim = new ContaCorrenteComLimite(9101, 444555, 3500, 50, 0.004);
                System.out.println(lim.toString());
                System.out.println("Saque(50): " + lim.sacar(50.0));
                System.out.println("Deposito(20): " + lim.depositar(20.0));
                System.out.println("Taxa: " + lim.deduzirTaxa());
                System.out.println("Extrato: " + lim.Extrato());
            } catch(Exception erro){
                System.out.println(erro.getMessage());
            }
    }
}
