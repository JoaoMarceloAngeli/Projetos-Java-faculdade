/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author puc
 */
public class ex6 {
    public static long calcularFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }
}