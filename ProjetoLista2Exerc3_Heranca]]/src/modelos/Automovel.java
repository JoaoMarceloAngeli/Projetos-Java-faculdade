/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

public  class Automovel extends Veiculo {
    
    public Automovel(String Ligar,String Acelerar, String Desligar) {
        super(Ligar,Acelerar,Desligar);
    }
     
  @Override
    public String toString() {
        return "Fusca{"+ "Ligar" + Ligar + ", Acelerar" + Acelerar + ", Desligar" + Desligar +  '}';
    }
}
