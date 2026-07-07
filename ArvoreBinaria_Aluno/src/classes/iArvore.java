/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package classes;

import java.util.List;


/**
 *
 * @author Mister Floppy Disk
 */
public interface iArvore {
    public void incluir(Aluno elemento) throws Exception;
    //public ArvoreBinaria clonar() throws Exception;
    public List<Aluno> getDadosOrdenados(String opcao);
    public List<Aluno> buscarNaArvore(String chave);
    public void deletar(String chave) throws Exception;
    public List<String> getChaves();
}
