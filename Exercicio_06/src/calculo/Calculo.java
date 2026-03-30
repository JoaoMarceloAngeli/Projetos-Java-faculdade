/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculo;


public class Calculo {
    public int numero = 0;
     public Calculo(){
    }

    public int getnumero() {
        return numero;
    }

    public void setnumero(int numero) {
        this.numero = numero;
    }
    public Calculo(int numero) throws Exception{
        if(numero < 0) throw new Exception ("numero não pode ser menor que 0");
        this.numero = numero;
    }
     // Função recursiva para calcular o fatorial
    public static int fatorialRecursivo(int numero) {
    if (numero == 0 || numero == 1) {
            return 1; // Caso base: 0! = 1 e 1! = 1
        }
        return numero * fatorialRecursivo(numero - 1); // Chamada recursiva
    }

    // Função iterativa para calcular o fatorial
    public static int fatorialIterativo(int numero) {
        int resultado = 1;
        for (int i = 2; i <= numero; i++) { // Inicia a partir de 2 pois 1! já é 1
            resultado *= i;
        }
        return resultado;
    }
}
