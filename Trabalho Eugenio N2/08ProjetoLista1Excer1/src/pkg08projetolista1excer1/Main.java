/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg08projetolista1excer1;
import modelos.Endereco;
import modelos.Pessoa;
import modelos.Telefone;
import modelos.Estudante;
import modelos.Graduado;
import modelos.Trabalhador;
public class Main {
    public static void main(String[] args) {
     Endereco end = new Endereco("Rua mamao", 516999, " qd 15 lt89", 76680002);
     Telefone tef = new Telefone(55, 62, 99918560);
     Pessoa ricardo = new Pessoa("Ricardo Maria", end, tef, "ricardo020504@gmail.com");
     System.out.println(ricardo);
     
     Endereco end2 = new Endereco("Rua Carlos", 99999, " qd 1 lt8", 76680802);
     Telefone tef2 = new Telefone(51, 61, 999181188);
     Estudante jose = new Estudante("Jose Queijo", end2, tef2, "jposjo@gmail.com", 202315555, "Matematica", "Urucu");
     System.out.println(jose);
     
     Endereco end3 = new Endereco("Rua Tiao", 77999, " qd 7 lt7", 7661102);
     Telefone tef3 = new Telefone(58, 51, 988181188);
     Graduado carlos = new Graduado("Carlos Peixoto", end3, tef3, "PeixeOrelha02@gamil.br", 71255555, "Fraces", "Para", 2000, 2001, 56144849);
     System.out.println(carlos);
     
     Endereco end4 = new Endereco("Rua Rabelo", 779, " qd 9 lt 9", 7602);
     Telefone tef4 = new Telefone(59, 50, 900081188);
     Trabalhador priscila = new Trabalhador("Priscila Raimunda", end4, tef4, "bibi@gmail.macaco", "Contadora", "Pessego", 99999);
     System.out.println(priscila);
    }
    
}
