/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EstruturaDeDados;

/**
 *
 * @author Pedro Francisco
 */
public interface IArvore {
    public void incluir(int elemento) throws Exception;
    public void Buscar(int elemento) throws Exception;     
    public void Listar(int elemento) throws Exception;
    public void Carregar(int elemento) throws Exception;
    public String crecentenome()throws Exception;
    public String decrecentenome()throws Exception;
    public String crecentematricula()throws Exception;
    public String decrecentematricula()throws Exception;
}
