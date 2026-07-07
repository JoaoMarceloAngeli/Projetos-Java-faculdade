/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Pedro Francisco
 */
public class Barco extends Veiculo {
     public Barco(String Ligar,String Acelerar, String Desligar) {
        super(Ligar,Acelerar,Desligar);
    }
  @Override
    public String toString() {
        return "Barco{"+super.toString()+ "Ligar" + Ligar + ", Acelerar" + Acelerar + ", Desligar" + Desligar +  '}';
    }
}
