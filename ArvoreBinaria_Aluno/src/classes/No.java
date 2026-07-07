/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Mister Floppy Disk
 */
public class No {
    private Aluno dado = null;
    private No esquerda = null;
    private No direita = null;
    private String[] chaves = new String[]{"",""};

    public No() { // Padrão
        dado = null;
        esquerda = null;
        direita = null;
        chaves = new String[]{"",""};
    }
    
    public No(Aluno dado, String campoOrdenamento1, String campoOrdenamento2){
        this.dado = dado;
        esquerda = null;
        direita = null;
        if(campoOrdenamento1.compareTo("Nome") == 0){
            chaves[0] = dado.getNome();
        }
        else {//if (campoOrdenamento1.compareTo("Matricula") == 0){
            chaves[0] = dado.getMatricula();
        }
        if(campoOrdenamento2.compareTo("---") == 0){
            chaves[1] = "";
        }
        else if(campoOrdenamento2.compareTo("Turno") == 0){
            chaves[1] = dado.getTurno();
        }
        else if (campoOrdenamento2.compareTo("Periodo") == 0){
            chaves[1] = dado.getPeriodo() + "";
        }
        else if(campoOrdenamento2.compareTo("Curso") == 0){
            chaves[1] = dado.getCurso();
        }
        else{
            chaves[1] = dado.getEnfase();
        }
        chaves[1] = chaves[1].concat(chaves[0]);
    }

    public Aluno getDado() {
        return dado;
    }

    public void setDado(Aluno dado) {
        this.dado = dado;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public String[] getChaves() {
        return chaves;
    }

    public void setChaves(String[] chaves) {
        this.chaves = chaves;
    }
    
    
}
