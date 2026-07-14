/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.classes;
import javax.swing.JOptionPane;
import modelos.interfaces.IServicos;

/**
 *
 * @author dobne
 */
public class ConjuntoProfessores implements IServicos{
    private int tamanho = 0;
    private int indiceOcupacao = -1;
    private Professor array[] = null;

    public int getTamanho() {
        return tamanho;
    }
    public int getIndiceOcupacao() {
        return indiceOcupacao;
    }
    public boolean estaCheio(){
    return (tamanho-1 == indiceOcupacao);
    }

    public ConjuntoProfessores(int tamanho) throws Exception{
        if (tamanho <= 0) throw new Exception("Tamanho não pode ser <= 0");
        this.tamanho = tamanho;
        array = new Professor[tamanho];
    }
    public ConjuntoProfessores(){
    }    
    
    @Override
    public void incluir(Professor professor) throws Exception {
        if (array == null) throw new Exception("Conjunto não inicializado.");
        if (estaCheio()) throw new Exception("Conjunto está cheio.");
        
        int matricula = professor.getMatricula();
        
        if (array[matricula] != null) {
        throw new Exception("Já existe um professor com a matrícula: " + matricula);
        }
        array[matricula] = professor;
    }
    
    private int buscar(int matricula) {
        for (int i = 0; i < 1001; i++) {
        if (array[i] != null && array[i].getMatricula() == matricula) {
            return i;
            }
        }
        return -1;
    }

    @Override
    public void excluir(int matricula) throws Exception {
        try{
            array[matricula] = null;
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null,"Erro ao excluir: " + erro.getMessage());
        }

    }
    @Override
    public void alterar(Professor professor) throws Exception {
        try{ 
            int indice = buscar(professor.getMatricula());
            if (indice != -1) array[indice] = professor;
            else JOptionPane.showMessageDialog(null, "Matrícula não encontrada. Não foi possível alterar.");
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(null, "Erro ao alterar: " + erro.getMessage());
    }
    }
    
    @Override
  public Professor[] listagemDeProfessores() throws Exception {
    if (array == null) {
        throw new Exception("Conjunto não inicializado.");
    }
        return array.clone();
  }
}
