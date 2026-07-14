/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Cliente
 */
public class Notebook extends TV{
    //atributos
    private int memoriaRAM = 0;
    private int capacidadeHS_SSD = 0;
    private String processador = " ";
    
//metodos

    public Notebook(int codigo, String modelo, String marca, String sistemaOperacional, int tamanho, int memoriaRAM, int capacidadeHS_SSD, String processador) {
        super(codigo, modelo, marca, sistemaOperacional, tamanho);
        this.memoriaRAM = memoriaRAM;
        this.capacidadeHS_SSD = capacidadeHS_SSD;
        this.processador = processador;
    }

    public Notebook() {
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getCapacidadeHS_SSD() {
        return capacidadeHS_SSD;
    }

    public void setCapacidadeHS_SSD(int capacidadeHS_SSD) {
        this.capacidadeHS_SSD = capacidadeHS_SSD;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    @Override
    public String obterDescricaoProduto() {
        return super.obterDescricaoProduto() + " Memoria RAM:" + memoriaRAM + " Capacidade HS/SSD:" + capacidadeHS_SSD + " Processador:" + processador;
    }
    
     @Override
    public float obterPrecoVenda() {
        return (float) 15.80;
    }
    
    @Override
    public String obterTipoProduto() {
        return "Notebbok";
    }

 
}
