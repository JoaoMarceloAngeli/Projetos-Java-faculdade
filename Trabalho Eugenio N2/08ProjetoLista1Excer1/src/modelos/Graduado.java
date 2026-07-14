/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Cliente
 */
public class Graduado extends Estudante{
    //atributos
    private int anoConclusao = 0;
    private int anoColocacaoGrau = 0;
    private int numeroDiploma = 0;

    public Graduado(String nome, Endereco endereco, Telefone telefone, String email, int matricula, String curso, String campus, int anoConclusao, int anoColocacaoGrau, int numeroDiploma) {
        super(nome, endereco, telefone, email, matricula, curso, campus);
        this.anoConclusao = anoConclusao;
        this.anoColocacaoGrau = anoColocacaoGrau;
        this.numeroDiploma = numeroDiploma;
    }

    public Graduado() {
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public int getAnoColocacaoGrau() {
        return anoColocacaoGrau;
    }

    public void setAnoColocacaoGrau(int anoColocacaoGrau) {
        this.anoColocacaoGrau = anoColocacaoGrau;
    }

    public int getNumeroDiploma() {
        return numeroDiploma;
    }

    public void setNumeroDiploma(int numeroDiploma) {
        this.numeroDiploma = numeroDiploma;
    }

    @Override
    public String toString() {
        return "Graduado{"+ super.toString() + "anoConclusao=" + anoConclusao + ", anoColocacaoGrau=" + anoColocacaoGrau + ", numeroDiploma=" + numeroDiploma + '}';
    }
    
}
