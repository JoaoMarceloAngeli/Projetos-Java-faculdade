/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

/**
 *
 * @author eduar
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.LinkedList;
import modelos.Endereco;
import modelos.Icrud;
import modelos.Telefone;
import modelos.contatos;
import util.ConexaoBD;
public class ContatoDao implements Icrud {
    
    private Connection conexao = null;
    public ContatoDao() throws Exception {
         conexao = ConexaoBD.getConexao();
    }
    
    @Override
    public void incluirCliente(contatos objeto) throws Exception {
        try {
            String sql = "insert into clientes(nomecompleto,telefone,email,logradouro,numero,complemento,cep,cidade,estado ) values (?, ?, ?, ?, ?, ?, ?, ?, ? )";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, objeto.getNomeCompleto());
            preparedStatement.setString(2, objeto.getTelefone().toString());
            preparedStatement.setString(3, objeto.getEmail());
            preparedStatement.setString(4, objeto.getEndereco().getLogradouro());
            preparedStatement.setInt(5, objeto.getEndereco().getNumero());
            preparedStatement.setString(6, objeto.getEndereco().getComplemento());
            preparedStatement.setInt(7, objeto.getEndereco().getCep());
            preparedStatement.setString(8, objeto.getEndereco().getCidade());
            preparedStatement.setString(9, objeto.getEndereco().getEstado());
            preparedStatement.executeUpdate();
        } catch (SQLException erro) {
            throw new Exception("SQL Erro: "+ erro.getMessage());
        } catch(Exception erro){
            throw erro;
        }
    }

    @Override
    public void excluirCliente(int idContato) throws Exception{ 
        try {
            String sql = "delete from clientes where idcontato = ?";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, idContato);
            preparedStatement.executeUpdate();
        }  catch (SQLException erro) {
        throw new Exception("SQL Erro: "+ erro.getMessage());
        } catch(Exception erro){
            throw erro;
        }
    }

    @Override
    public void alterarCliente(contatos objeto) throws Exception{      
        try {
            String sql = "update clientes set nomecompleto = ?,telefone = ?,email = ?,logradouro = ?,numero = ?,complemento = ?,cep = ?,cidade = ?,estado = ? where idcontato = ?";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, objeto.getNomeCompleto());
            preparedStatement.setString(2, objeto.getTelefone().toString());
            preparedStatement.setString(3, objeto.getEmail());
            preparedStatement.setString(4, objeto.getEndereco().getLogradouro());
            preparedStatement.setInt(5, objeto.getEndereco().getNumero());
            preparedStatement.setString(6, objeto.getEndereco().getComplemento());
            preparedStatement.setInt(7, objeto.getEndereco().getCep());
            preparedStatement.setString(8, objeto.getEndereco().getCidade());
            preparedStatement.setString(9, objeto.getEndereco().getEstado());
            preparedStatement.setInt(10, objeto.getIdContato());
            preparedStatement.executeUpdate();
        }  catch (SQLException erro) {
        throw new Exception("SQL Erro: "+ erro.getMessage());
        } catch(Exception erro){
            throw erro;
        }
    }

    @Override
    public contatos consultarCliente(String nome) throws Exception{
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LinkedList<contatos> listarClientes() throws Exception{
        LinkedList<contatos> listaContatos = new LinkedList<>();
        String sql = "select * from clientes";
        String numeroTele;
        try {
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                Endereco end = new Endereco(rs.getString("logradouro"), rs.getInt("numero"), rs.getString("complemento"), rs.getInt("cep"), rs.getString("cidade"), rs.getString("estado"));
                numeroTele = rs.getString("telefone");
                String[] telefonePartes = numeroTele.split(";");
                int ddi = Integer.parseInt(telefonePartes[0]);
                int ddd = Integer.parseInt(telefonePartes[1]);
                int numero = Integer.parseInt(telefonePartes[2]);
                Telefone tele = new Telefone(ddi, ddd, numero);
                contatos pessoa = new contatos();
                pessoa.setIdContato(rs.getInt("idcontato"));
                pessoa.setNomeCompleto(rs.getString("nomecompleto"));
                pessoa.setTelefone(tele);
                pessoa.setEmail(rs.getString("email"));
                pessoa.setEndereco(end);
                listaContatos.add(pessoa);
            }
        }catch (SQLException erro) {
            throw new Exception("SQL Erro: "+ erro.getMessage());
        } catch(Exception erro){
            throw erro;
        }
        return listaContatos;
    }
}
