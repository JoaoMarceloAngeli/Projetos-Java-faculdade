/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
//responsavel por realizara coneccao
import java.sql.Connection;
//gerencia o driver que nos usamos
import java.sql.DriverManager;
//caso de erro no banco ele tem a funcao de mostrar
import java.sql.SQLException;
/**
 *
 * @author Cliente
 */
public class ConexaoBD {
    //a classe nao estanciada pois os valores tendem a ser continuos
    private static Connection conexao = null;
    private ConexaoBD(){}
    // pega a conexao 
    public static Connection getConexao() throws Exception{
      try
        {
            if(conexao == null){
                //pegamos o arquivo jar e as funcoes dele
                String driver = "org.postgresql.Driver";
                //onde esta o banco
                String url = "jdbc:postgresql://localhost:5432/Contato";
                String usuario = "postgres";
                String senha = "12345"; 
                //procora o driver informado e o registra e carrega
                Class.forName(driver);
                //DriverManager vai comunicar com os drivers getConnection informamos o banco que iremos conectar
                conexao = DriverManager.getConnection(url, usuario, senha);
            }               
        }
        catch(ClassNotFoundException erro){
            //Erro de não encontrar o drive do banco no projeto
            throw new Exception("Drive: "+erro.getMessage());
        }
        catch(SQLException erro){
            //Erro no banco de dados: usuario, senha ou banco de dados 
            throw new Exception("Banco: " + erro.getMessage());
        }
      return conexao;
    } 
}
