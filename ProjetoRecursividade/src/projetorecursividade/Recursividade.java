/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetorecursividade;

/**
 *
 * @author ejmcc
 */
public class Recursividade {
  //Atributos
  int numero = 0;
  // Metodos

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }
  
  public long fatorialInterativo(){
    long fat = 1;
    for(int valor = numero; valor > 0; valor--){
      fat *= valor;
    }
    return fat;
  }
  private long fatorialRecursivo(int valor){
    if(valor > 0) return valor * fatorialRecursivo(--valor);
    else return 1;
  }
  public long fatorialRecursivo1(){
    return fatorialRecursivo(numero);
  }
}
