/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

public abstract class Veiculo {
    public void Ligar;
    public String Acelerar = "";
    public String Desligar = "";
    public Veiculo(String Ligar,String Acelerar, String Desligar){
        this.Acelerar = "";
        this.Ligar = "";
        this.Desligar = "";      
    }
}
