/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Cliente
 */
public class TV extends Produto{
    //atributos
    protected String modelo = " ";
    protected String marca = " ";
    protected String sistemaOperacional = " ";
    protected int tamanho = 0;
    //metodos

    public TV(int codigo, String modelo, String marca, String sistemaOperacional, int tamanho) {
        super(codigo);
        this.modelo = modelo;
        this.marca = marca;
        this.sistemaOperacional = sistemaOperacional;
        this.tamanho = tamanho;
    }

    public TV() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String obterDescricaoProduto() {
        return "Modelo:" + modelo + " Marca:" + marca + " Sistema Operacional:" + sistemaOperacional + " Tamanho:" + tamanho;

    }

    @Override
    public float obterPrecoVenda() {
        return (float) 15.60;
    }

    @Override
    public String obterTipoProduto() {
        return "TV";
    }
    
}
