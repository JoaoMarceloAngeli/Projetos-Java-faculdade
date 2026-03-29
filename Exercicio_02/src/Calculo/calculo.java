/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 *
 * @author Pedro Francisco
 */
public class calculo {
    public static BigDecimal calcularPiCom51Termos() {
        MathContext mc = new MathContext(52);
        try {
            return calcularTermo(0, 51, BigDecimal.ZERO, mc);
        } catch (ArithmeticException e) {
            System.err.println("Erro de cálculo: " + e.getMessage());
            return BigDecimal.ZERO; 
        }
    }

    private static BigDecimal calcularTermo(int i, int termosRestantes, BigDecimal soma, MathContext mc) {
        if (termosRestantes == 0) {
            return soma.multiply(new BigDecimal(4), mc);
        }
        int denominador = 2 * i + 1;

        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero ao calcular o denominador.");
        }

        BigDecimal termo = BigDecimal.ONE.divide(new BigDecimal(denominador), mc);
        if (i % 2 == 0) {
            soma = soma.add(termo);
        } else {
            soma = soma.subtract(termo);
        }
        return calcularTermo(i + 1, termosRestantes - 1, soma, mc);
    }
}
