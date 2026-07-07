/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos;

import java.util.LinkedList;

/**
 *
 * @author dobne
 */
public interface Icrud {
        public void incluirCliente(Professor objeto) throws Exception;

	public void excluirCliente(int Professor) throws Exception;

	public void alterarCliente(Professor objeto) throws Exception;
        
        public LinkedList<Professor> listarClientes() throws Exception;
}
