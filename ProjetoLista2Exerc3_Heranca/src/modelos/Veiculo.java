/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Pedro Francisco
 */
public class Veiculo {
    public String Direita = "";
    public String Esquerda = ""; 
    public String Frente = "";
    public String Freiar = "";
    public Veiculo (String Direita, String Esquerda, String Frente, String Freiar){
        this.Direita = Direita;
        this.Esquerda = Esquerda;
        this.Freiar = Freiar;
        this.Frente = Frente;
    }
     public String getDireita() {
        return Direita;
    }

    public void setDireita(String Direita) {
        this.Direita = Direita;
    }
    public String getEsquerda(){
        return Esquerda;
    }
    public void setEsquerda(String Esquerda){
        this.Esquerda = Esquerda;
    }
    
    public String getFrente(){
        return Frente;
    }
    public void setFrente(String Frente){
        this.Frente = Frente;
    }
    public String getFreiar(){
        return Freiar;
    }
    public void setFreiatr(String Freiar){
        this.Freiar = Freiar;
    }
    @Override
    public String toString(){
    return "Metodos{" + ", Direita" + Direita + ", Esquerda" + Esquerda + ", Frente" + Frente + ", Freiar" + Freiar + "}";
}
}
