/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import modelos.Icrud;
import modelos.Contato;
import persistencia.ContatoDAO;


public class Controle implements Icrud{
    
    public void Controle() throws Exception{
    }
    @Override
    public void incluir(Contato objeto) throws Exception {
        try {
            ContatoDAO dao = new ContatoDAO();
            String erro = verificar(objeto);
            if (!erro.isEmpty()) throw new Exception(erro);
            dao.incluir(objeto);
            } catch (Exception erro) {
            throw erro;
        }
    }

   @Override
    public void excluir(int id) throws Exception {
        try {
            ContatoDAO dao = new ContatoDAO();
            if (id != -1){
                dao.excluir(id);
            }
        }catch (Exception erro) {
            throw erro;
    }}

    @Override
    public void alterar(Contato objeto) throws Exception {
        try {
        ContatoDAO dao = new ContatoDAO();
        String erro = verificar(objeto);
        if (!erro.isEmpty()) throw new Exception(erro);
        dao.alterar(objeto);
        } catch (Exception erro) {
        throw erro;
    }}
    

    @Override
    public LinkedList<Contato> listar() throws Exception {
        try {         
            ContatoDAO c = new ContatoDAO();
            return c.listar();
        } catch (Exception erro) {
            throw erro;
        }
    }

    

    
   private String verificar(Contato objeto){
        String erro = "";
        if(objeto.getNomeCompleto().isEmpty()) erro += "Esse campo (nome) é obrigatorio, não pode estar vazio.\n";
        if(!objeto.getNomeCompleto().matches("^[a-zA-Z ]+$")) erro += "Esse campo (nome) somente aceita letras.\n";
        if(objeto.getEmail().isEmpty()) erro += "Esse campo (email) é obrigatorio, não pode estar vazio\n.";
        if(Integer.toString(objeto.getTelefone().getDdi()).isEmpty()) erro += "Esse campo (DDI) é obrigatorio, não pode estar vazio.\n";
        if(Integer.toString(objeto.getTelefone().getDdd()).isEmpty()) erro += "Esse campo (DDD) é obrigatorio, não pode estar vazio.\n";
        if(Integer.toString(objeto.getTelefone().getNumero()).isEmpty()) erro += "Esse campo (telefone) é obrigatorio, não pode estar vazio.\n";         
        if(objeto.getEndereco().getLogradouro().isEmpty()) erro += "Esse campo (Logradouro) é obrigatorio, não pode estar vazio.\n";
        if(Integer.toString(objeto.getEndereco().getNumero()).isEmpty()) erro += "Esse campo (número) é obrigatorio, não pode estar vazio.\n";
        if(objeto.getEndereco().getCep().isEmpty()) erro += "Esse campo (cep) é obrigatorio, não pode estar vazio.\n";
        if(objeto.getEndereco().getCidade().isEmpty()) erro += "Esse campo (cidade) é obrigatorio, não pode estar vazio.\n";
        if(!objeto.getEndereco().getCidade().matches("^[a-zA-Z\\s]+$")) erro += "Esse campo (cidade) não pode conter números ou acentos.\n";
        if(objeto.getEndereco().getEstado().isEmpty()) erro += "Esse campo (UF) é obrigatorio, não pode estar vazio.\n";
        if (!objeto.getEndereco().getEstado().matches("^[a-zA-Z\\s]+$")) erro += "Esse campo (UF) não pode conter números.\n";
        if(!objeto.getEmail().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) erro += "Esse campo (email) recebeu um email invalido.\n";
        String ddi = Integer.toString(objeto.getTelefone().getDdi());
        if(!ddi.matches("[0-9]+")) erro += "Esse campo (DDI) somente aceita numeros.\n";
        String ddd = Integer.toString(objeto.getTelefone().getDdd());
        if(!ddd.matches("[0-9]+")) erro += "Esse campo (DDD) somente aceita numeros.\n";
        String numero = Integer.toString(objeto.getTelefone().getNumero());
        if(!numero.matches("[0-9]+")) erro += "Esse campo (número) somente aceita numeros.\n";
        return erro;
    }   
}