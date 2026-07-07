/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.classes;

/**
 *
 * @author dobne
 */
public class Professor {
    private int matricula = 0;
    private String nome = "";
    private String escola = "";
    private String titulacao = ""; /*enum*/
    private String contrato = ""; /*enum*/
    
    public Professor(){
    }
    public Professor(int matricula, String nome, String escola, String titulacao, String contrato){
        this.matricula = matricula;
        this.nome = nome;
        this.escola = escola;
        this.titulacao = titulacao;
        this.contrato = contrato;
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
        return "Professor{" + "matricula=" + matricula + ", nome=" + nome + ", escola=" + escola + ", titulacao=" + titulacao + ", contrato=" + contrato + '}';
    }
    
}
