/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturadeDados;
public class no {
    private int dado;
    private no esquerda = null;
    private no direita  = null;
    
    public no(){
        this.dado = 0;
        esquerda = null;
        direita  = null;
    }
    public no(int dado){
        this.dado = dado;
        esquerda = null;
        direita = null;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public no getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(no esquerda) {
        this.esquerda = esquerda;
    }

    public no getDireita() {
        return direita;
    }

    public void setDireita(no direita) {
        this.direita = direita;
    }
    }


