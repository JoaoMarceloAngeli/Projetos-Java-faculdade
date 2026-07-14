/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author puc
 */
public class ex1 {

     public double calcularPi(double precisao) {
    return calcularPiRecursivo(1, 1, 0, precisao);
}

private double calcularPiRecursivo(int termoAtual, int sinal, double pi, double precisao) {
    double novoTermo = 4.0 / (2 * termoAtual - 1) * sinal; 
    pi += novoTermo; 
    if (Math.abs(novoTermo) < precisao) {
        return pi;
    }

    return calcularPiRecursivo(termoAtual + 1, -sinal, pi, precisao);
}
}
