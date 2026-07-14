/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;
import java.util.LinkedList;
import modelos.Professor;

public interface IProfessor {
    public void incluir(Professor objeto)throws Exception;
    public void excluir(int matricula) throws Exception;
    public void alterar(Professor objeto) throws Exception;
    public LinkedList<Professor>[] listar() throws Exception;
}
