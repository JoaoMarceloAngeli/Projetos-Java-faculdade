/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Pedro Francisco
 */
public class Aviao  extends Veiculo {
     public Aviao(String Ligar,String Acelerar, String Desligar) {
        super(Ligar,Acelerar,Desligar);
    }
  @Override
    public String toString() {
        return "Aviao{"+super.toString()+ "Ligar" + Ligar + ", Acelerar" + Acelerar + ", Desligar" + Desligar +  '}';
    }
    
}
