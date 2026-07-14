/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author eduar
 */

public interface Icrud {

	public void incluirCliente(contatos objeto) throws Exception;

	public void excluirCliente(int idContato) throws Exception;

	public void alterarCliente(contatos objeto) throws Exception;

	public contatos consultarCliente(String nome) throws Exception;

	public LinkedList<contatos> listarClientes() throws Exception;

}
