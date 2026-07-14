/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.contas;

/**
 *
 * @author vitus
 */
public class ex1 {
    
    public float exercicio1(){
        
        float sequenciaImpar = 1;
        float inversor = 1;
        float valorresultado = 0;        
        while(sequenciaImpar < 4000)
        {
            valorresultado = valorresultado + ((4/sequenciaImpar)*inversor);
            sequenciaImpar = sequenciaImpar + 2;
            inversor = inversor*(-1);
        }
        return valorresultado;
   }
   int impar = 3999;
   int inver = 1;
   float resultado = 0;
           
   public float ex1recursivo(){
       if(impar == -1) {return resultado};
       resultado = ((4/impar)*inver);
       inver = inver*(-1);
       impar = impar-2;
    }
}
