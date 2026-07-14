/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author puc
 */
public class ex4 {
    public int multiplicar(int n1, int n2) {
        if (n2 == 0) {
            return 0;
        }

        if (n2 < 0) {
            return -multiplicar(n1, -n2);
        }

        return n1 + multiplicar(n1, n2 - 1);
    }
}