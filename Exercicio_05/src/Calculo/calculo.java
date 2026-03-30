/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

/**
 *
 * @author Pedro Francisco
 */
public class calculo {
    public int numero = 0;
     public calculo(){
    }

    public int getnumero() {
        return numero;
    }

    public void setnumero(int numero) {
        this.numero = numero;
    }
    public String decimalParaBinario(int numero) {
        if (numero == 0) {
            return "0";
        }
        if (numero == 1) {
            return "1";
        }
        return decimalParaBinario(numero / 2) + (numero % 2);
    }
}
