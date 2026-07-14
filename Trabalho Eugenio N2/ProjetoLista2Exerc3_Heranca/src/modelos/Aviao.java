/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import Interface.IVeiculo;

public class Aviao implements IVeiculo {

    public Aviao() {
    }

    @Override
    public String obterCorDoVeiculo() {
        return "Branco e vermelho";
    }

    @Override
    public String obterVeiculo() {
        return "Aviao";
    }

    @Override
    public String obterLocalPilotagem() {
        return "Espaco aereo";
    }
    
}
