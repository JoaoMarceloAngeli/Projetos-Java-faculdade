/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
import java.util.List;
import modelos.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import util.ConexaoBD;
import java.util.LinkedList;
/**
 *
 * @author ejmcc
 */
public class ContatoDAO implements Icrud{
  //Conexao com o banco
    private Connection conexao = null;
  //Metodo Construtor
  public ContatoDAO() throws Exception{
    conexao = ConexaoBD.getConexao();
  }
  //Metodos Sobrecarregados
  @Override
  public void incluir(Contato objeto) throws Exception {
    try {
      String sql = "insert into contato(nomecompleto,telefone,email ) values (?, ?, ?)";
      PreparedStatement preparedStatement = conexao.prepareStatement(sql);
      // Parameters start with 1
      preparedStatement.setString(1, objeto.getNomeCompleto());
      preparedStatement.setString(2, objeto.getTelefone());
      preparedStatement.setString(3, objeto.getEmail());
      preparedStatement.executeUpdate();

    } catch (SQLException erro) {
        //Erro do comando SQL - chave, coluna, nome da tabela, ...
        throw new Exception("SQL Erro: "+ erro.getMessage());
    } catch(Exception erro){
        throw erro;
    }
  }

  @Override
  public void excluir(String nomeCompleto) throws Exception {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public void alterar(Contato objeto) throws Exception {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public Contato consultar(String nomeCompleto) throws Exception {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public List<Contato> listagemDeContatos() throws Exception {
    return null;
  }
  
}
