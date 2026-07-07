
package modelos.classes;

/**
 *
 * @author dobne
 */
public class Alunos {
    private String matricula = "";
    private String nome = "";
    private TurnoEnum turno;
    private int periodo = 0;
    private String enfase = "";
    private Cursos curso;
    
    public enum TurnoEnum{
        MATUTINO,
        VESPERTINO,
        NOTURNO
    }
    
    public Alunos(String matricula, String nome, TurnoEnum turno, int periodo, String enfase, Cursos curso){
        this.matricula = matricula;
        this.nome = nome;
        this.turno = turno;
        this.periodo = periodo;
        this.enfase = enfase;
        this.curso = curso;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TurnoEnum getTurno() {
        return turno;
    }

    public void setTurno(TurnoEnum turno) {
        this.turno = turno;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getEnfase() {
        return enfase;
    }

    public void setEnfase(String enfase) {
        this.enfase = enfase;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return matricula + ";" + nome + ";" + turno + ";" + periodo + ";" + enfase + ";" + curso + "\n";
    }
    
}
