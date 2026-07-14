/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Cliente
 */
public class PessoaFisica extends Cliente{
    //atributos
    private String nomeCompleto = " ";
    private String cPF = " ";
    private int identidade = 0;
    private String sexo = " ";
    
    //metodos

    public PessoaFisica(int codigo, Endereco endereco, String email, Telefone telefone, float valorBruto, String nomeCompleto, String cPF, int identidade, String sexo) {
        super(codigo, endereco, email, telefone, valorBruto);
        this.nomeCompleto = nomeCompleto;
        this.cPF = cPF;
        this.identidade = identidade;
        this.sexo = sexo;
    }

    public PessoaFisica() {
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getcPF() {
        return cPF;
    }

    public void setcPF(String cPF) {
        this.cPF = cPF;
    }

    public int getIdentidade() {
        return identidade;
    }

    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public float calcularImposto() {
        float imposto = -1;
        if(super.valorBruto == 0 || super.valorBruto <= 1400){
            imposto = 0;
        }
        else if(super.valorBruto >=  14000.01 || super.valorBruto <= 2100){
            imposto = (float) (10.0 / 100.0 * super.valorBruto);
        }
        else if(super.valorBruto >=  21000.01 || super.valorBruto <= 2800){
            imposto = (float) (15.0 / 100.0 * super.valorBruto);
        }
        else if(super.valorBruto >=  28000.01 || super.valorBruto <= 3600){
            imposto = (float) (25.0 / 100.0 * super.valorBruto);
        }
        else if(super.valorBruto >=  3600.01){
           imposto = (float) (30.0 / 100.0 * super.valorBruto);
        }
        return imposto;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + super.toString() + "nomeCompleto=" + nomeCompleto + ", cPF=" + cPF + ", identidade=" + identidade + ", sexo=" + sexo + " Imposto: R$" + calcularImposto() +'}';
    }
    
}
