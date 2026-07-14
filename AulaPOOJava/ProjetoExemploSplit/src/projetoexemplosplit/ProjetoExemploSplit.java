/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoexemplosplit;

/**
 *
 * @author ejmcc
 */
public class ProjetoExemploSplit {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    String str = "1234;Carlos da Silva;carlos@teste.com.br";
    String vetorString[] = str.split(";");
    
    System.out.println("Matricula: " + vetorString[0]);
    System.out.println("Nome: " + vetorString[1]);
    System.out.println("Email: " + vetorString[2]);
    
    
    
  }
  
}
