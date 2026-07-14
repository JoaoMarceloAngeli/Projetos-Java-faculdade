/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import modelos.Endereco;
import modelos.Telefone;
/**
 *
 * @author Cliente
 */
abstract public class Cliente {
    protected int codigo = 0;
    protected Endereco endereco = null;
    protected String email = " ";
    protected Telefone telefone = null;
    protected float valorBruto = 0;

    public Cliente(int codigo, Endereco endereco, String email, Telefone telefone, float valorBruto) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.valorBruto = valorBruto;
    }

    public Cliente() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public float getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(float valorBruto) {
        this.valorBruto = valorBruto;
    }
    
    abstract public float calcularImposto();

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", endereco=" + endereco.toString() + ", email=" + email + ", telefone=" + telefone.toString() + ", valorBruto=" + valorBruto + '}';
    }
    
}
