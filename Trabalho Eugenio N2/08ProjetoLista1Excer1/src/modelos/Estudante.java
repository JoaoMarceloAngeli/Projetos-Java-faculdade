/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Cliente
 */
public class Estudante extends Pessoa{
    //Atrinutos
    protected int matricula = 0;
    protected String curso = " ";
    protected String campus = " ";
    //metodos 

    public Estudante(String nome, Endereco endereco, Telefone telefone, String email, int matricula, String curso, String campus) {
        super(nome, endereco, telefone, email);
        this.matricula = matricula;
        this.curso = curso;
        this.campus = campus;
    }

    public Estudante() {
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    @Override
    public String toString() {
        return "Estudante{" +super.toString()+ "matricula=" + matricula + ", curso=" + curso + ", campus=" + campus + '}';
    }
    
}
