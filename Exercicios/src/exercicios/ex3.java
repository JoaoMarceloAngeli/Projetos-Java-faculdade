/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author puc
 */
public class ex3 {
    public double calcularPotencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }

        if (expoente < 0) {
            return 1.0 / calcularPotencia(base, -expoente);
        }
        return base * calcularPotencia(base, expoente - 1);
    }
}
