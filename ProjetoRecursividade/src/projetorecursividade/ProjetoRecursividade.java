/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetorecursividade;

import javax.swing.JOptionPane;

/**
 *
 * @author ejmcc
 */
public class ProjetoRecursividade {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Recursividade teste = new Recursividade();
    teste.setNumero(5);
    String saida = "Resultado \n";
    saida += "Fatorial Interativo de " + teste.getNumero() + 
             " é =  " + teste.fatorialInterativo() + "\n";
    saida += "Fatorial Recursivo de " + teste.getNumero() + 
             " é =  " + teste.fatorialRecursivo1();
    JOptionPane.showMessageDialog(null, saida);
  }
  
}
