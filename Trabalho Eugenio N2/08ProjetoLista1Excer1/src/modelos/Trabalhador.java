/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Cliente
 */
public class Trabalhador extends Pessoa{
    //atributos
    private String funcao = " ";
    private String departamento = " ";
    private float salario = 0;
    //metodos

    public Trabalhador(String nome, Endereco endereco, Telefone telefone, String email, String funcao, String departamento, float salario) {
        super(nome, endereco, telefone, email);
        this.funcao = funcao;
        this.departamento = departamento;
        this.salario = salario;     
    }

    public Trabalhador() {
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabalhador{"+ super.toString() + "funcao=" + funcao + ", departamento=" + departamento + ", salario=" + salario + '}';
    }
    
}
