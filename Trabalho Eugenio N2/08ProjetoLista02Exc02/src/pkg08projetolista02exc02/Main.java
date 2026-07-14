/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg08projetolista02exc02;
import modelos.Conta;
import modelos.Poupanca;
import modelos.CorrenteBasica;
import modelos.CorrenteLimite;
/**
 *
 * @author Cliente
 */
public class Main {
    public static void main(String[] args) {
        Poupanca contaP = new Poupanca(1500, "Luis Aguia", 449, 4422);
        contaP.depositar(250);
        contaP.sacar(150);
        System.out.println(contaP.emitirSaldo());
        
        CorrenteBasica contBa = new CorrenteBasica(500, "Roberto ", 5559, 25, 30);
        contBa.depositar(100);
        contBa.sacar(25);
        System.out.println(contBa.emitirSaldo());
        
        CorrenteLimite contLimi = new CorrenteLimite(1500, "Lucas", 5592, 25, 28, 100);
        contLimi.depositar(5);
        contLimi.sacar(1605);
        System.out.println(contLimi.emitirSaldo());
    }
    
}
