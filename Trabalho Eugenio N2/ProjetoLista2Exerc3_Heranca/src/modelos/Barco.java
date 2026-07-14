/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import Interface.IVeiculo;

public class Barco implements IVeiculo{

    public Barco() {
    }

    @Override
    public String obterCorDoVeiculo() {
        return "Branco e preto";
    }

    @Override
    public String obterVeiculo() {
        return "Barco";
    }

    @Override
    public String obterLocalPilotagem() {
        return "Lagos,Lagoas, Rios e Mares ";
    }
    
}
