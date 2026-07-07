/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Pedro Francisco
 */
public class Automovel extends Veiculo {
    public String Ligar = ""; 
    public String Desligar = "";
    public Automovel (String Direita, String Esquerda, String Frente,String Freiar, String Ligar, String Desligar){
    super(Direita, Esquerda, Frente, Freiar);
    this.Ligar = Ligar;
    this.Desligar = Desligar;
    }
}
