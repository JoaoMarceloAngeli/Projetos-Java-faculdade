/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import Interface.IVeiculo;

public class Automovel implements IVeiculo{

    public Automovel() {
    }

    
    @Override
    public String obterCorDoVeiculo() {
        return "O fuscao e preto";
    }

    @Override
    public String obterVeiculo() {
        return "Fusca";
    }

    @Override
    public String obterLocalPilotagem() {
        return "Estrata,Rodovia e ruas";
    }
    
}
