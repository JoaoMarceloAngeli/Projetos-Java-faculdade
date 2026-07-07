
package modelos.classes;

/**
 *
 * @author dobne
 */
public class Enfase {
    private int codigo = 0;
    private String descricao = "";

    public Enfase(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return codigo + ";" + descricao;
    }
    
}
