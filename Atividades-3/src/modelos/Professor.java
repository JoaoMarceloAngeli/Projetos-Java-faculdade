/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;


public class Professor {
    //atributos
    private int matricula = 0;
    private String nome = "";
    private String escola = "";
    private String titulacao = "";
    private String contrato = "";
    
    //metodos

    public Professor(int matricula, String nome, String escola, String titulacao, String contrato) {
        this.matricula = matricula;
        this.nome = nome;
        this.escola = escola;
        this.titulacao = titulacao;
        this.contrato = contrato;
    }

    public Professor(int matricula) {
        this.matricula= matricula;
    }

    public Professor() {
    }
       
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return "Matricula:"+ matricula + "\n" + "Nome:"+ nome + "\n"+ "Escola:" + escola + "\n" + "Titulacao:" + titulacao + "\n" + "Contrato:" + contrato;
        }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Professor other = (Professor) obj;
        return this.matricula == other.matricula;
    }
    
}
