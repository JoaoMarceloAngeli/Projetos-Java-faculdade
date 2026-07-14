/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import modelos.Cliente;
/**
 *
 * @author Cliente
 */
public class PessoaJuridica extends Cliente{
    //atributos
    private String cNPJ = " ";
    private String nomeFantasia = " ";
    private String razaoSocial = " ";
    private int inscricaoEstadual = 0;
    private String url = " ";
    
    //metodos

    public PessoaJuridica(int codigo, Endereco endereco, String email, Telefone telefone, float valorBruto, String cNPJ, String nomeFantasia, String razaoSocial, int inscricaoEstadual, String url) {
        super(codigo, endereco, email, telefone, valorBruto);
        this.cNPJ =cNPJ;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
        this.url = url;
    }

    public PessoaJuridica() {
    }

    public String getcNPJ() {
        return cNPJ;
    }

    public void setcNPJ(String cNPJ) {
        this.cNPJ = cNPJ;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(int inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public float calcularImposto() {
        return (float) (20.0/100.0 * super.valorBruto);
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + super.toString() + "cNPJ=" + cNPJ + ", nomeFantasia=" + nomeFantasia + ", razaoSocial=" + razaoSocial + ", inscricaoEstadual=" + inscricaoEstadual + ", url=" + url + " Imposto: R$" + calcularImposto() +'}';
    }
    
    
}
