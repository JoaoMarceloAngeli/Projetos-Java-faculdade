/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculo;

/**
 *
 * @author Pedro Francisco
 */
public class calculo {
    public double calcularPiInterativo(double precisao) {
        double pi = 4; 
        double denominador = 3; 
        double termo; 
        boolean subtrair = true; 

        do {
            termo = 4.0 / denominador;

            if (subtrair) {
                pi -= termo; 
            } else {
                pi += termo; 
            }

            subtrair = !subtrair; 
            denominador += 2; 

        } while (Math.abs(termo) >= precisao);

        return pi; 
    }

    public double calcularPiRecursivo(double precisao) {
        return calcularPiRecursivo(0, precisao); 
    }

    public double calcularPiRecursivo(int n, double precisao) {
        double termo = 4.0 / (2 * n + 1) * (n % 2 == 0 ? 1 : -1);
        if (Math.abs(termo) < precisao) {
            return 0.0; 
        }
        return termo + calcularPiRecursivo(n + 1, precisao); 
    }
}
