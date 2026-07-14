/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProjetLista2_Exerc3_Heraca;
import Interface.IVeiculo;
import modelos.Automovel;
import modelos.Aviao;
import modelos.Barco;

public class Main {
private static void imprimir(IVeiculo objeto){
        String saida = "Veiculos:" + "\n";
        saida += "Tipo combustivel: " + objeto.obterCorDoVeiculo()+ "\n";
        saida += "Local de pilotagem: " + objeto.obterLocalPilotagem()+ "\n";
        saida += "Tipo de veiculo: " + objeto.obterVeiculo()+ "\n";
        System.out.println(saida);
    }
    public static void main(String[] args) {
        Automovel aut = new Automovel();
        imprimir(aut);
        
        Aviao avia = new Aviao();
        imprimir(avia);
        
        Barco barc = new Barco();
        imprimir(barc);
    }
    
}
