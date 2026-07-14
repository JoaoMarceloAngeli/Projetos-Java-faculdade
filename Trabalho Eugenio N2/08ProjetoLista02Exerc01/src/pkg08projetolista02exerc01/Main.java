/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg08projetolista02exerc01;
import modelos.Cliente;
import modelos.Endereco;
import modelos.Telefone;
import modelos.PessoaFisica;
import modelos.PessoaJuridica;
/**
 *
 * @author Cliente
 */
public class Main {
    public static void main(String[] args) {
      Endereco end = new Endereco("Rua 25", 78, "Qd 02 lt 52", 7589);
      Telefone tel = new Telefone(55, 69, 8824630);
      PessoaFisica roberto = new PessoaFisica(32, end, "Roberto@gmai.lo", tel, 3601, "Raberto Lima", "74852215", 2651, "Homem");
      System.out.println(roberto);
        
        Endereco end1 = new Endereco("Rua banzeiros", 78, "qd 2 ly 6", 82155425);
        Telefone telf1 = new Telefone(55, 68, 3999582);
        PessoaJuridica maria = new PessoaJuridica(5858, end1, "mariacove@gail.com", telf1, 8000, "7185825", "Roanldo", "Macacp", 85858, "ww.macaco.br");
        System.out.println(maria);
    }
    
}
