/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adsad;

import No.No;

/**
 *
 * @author Pedro Francisco
 */
public class regular {
    No ref1 = new No(5);
    No ref2 = new No(10);
    No ref3 = new No(40);
    
    System.out.println("Referencia 1: " + ref1);
    System.out.println("Referencia 2: " + ref2);
    System.out.println("Referencia 3: " + ref3);
    System.out.println();
    
    ref1.setDireita(ref2);
    ref1.setEsquerda(ref3);
    System.out.println("Referencia 1 - No inicial: " + ref1);
    System.out.println("Referencia 1 - Direita   : " + ref2);
    System.out.println("Referencia 1 - Esquerda  : " + ref3);
    System.out.println(); 
}
