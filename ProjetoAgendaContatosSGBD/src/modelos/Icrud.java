/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos;
import java.util.List;
public interface Icrud {
    void incluir(Contato objeto) throws Exception;
    void excluir(String nomeCompleto) throws Exception;
    void alterar(Contato objeto) throws Exception;
    Contato consultar(String nomeCompleto) throws Exception;
    List<Contato> listagemDeContatos() throws Exception;
}
