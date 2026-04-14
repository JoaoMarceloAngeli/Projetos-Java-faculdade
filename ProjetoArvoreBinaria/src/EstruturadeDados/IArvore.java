/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EstruturadeDados;

/**
 *
 * @author Pedro Francisco
 */
public interface IArvore {
    public void incluir(int elemento) throws Exception;
    public String percursoCentralEsquerda()throws Exception;
    public String percursoPreOrdemEsquerda()throws Exception;
    public String percursoPosOrdemEsquerda()throws Exception;
    public String percursoCentralDireita()throws Exception;
    public String percursoPreOrdemDireita()throws Exception;
    public String percursoPosOrdemDireita()throws Exception;        
}
