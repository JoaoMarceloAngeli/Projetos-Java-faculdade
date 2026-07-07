/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author Pedro Francisco
 */
public class Paralelepipedo {
     public float Volume(float Altura, float Comprimento, float Largura){
        return (Altura * Comprimento * Largura);
    }
     
     public float Area(float Altura, float Comprimento, float Largura){
        return ( 2 * (Altura * Largura + Altura * Comprimento + Largura * Comprimento));
    }
}
