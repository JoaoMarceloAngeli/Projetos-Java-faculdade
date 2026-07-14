/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelos.Icrud;
import modelos.Contato;
import persistencia.ContatoDAO;
import serviçospdf.MetodosPdf;

public class Controle implements Icrud{
     private Icrud c;

    public Controle() {
         try {
             this.c = new ContatoDAO();
         } catch (Exception ex) {
             Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    public void Controle(){
    }
    @Override
    public void incluir(Contato objeto) throws Exception {
        try {
            String erro = verificar(objeto);
            if (!erro.isEmpty()) throw new Exception(erro);
            c.incluir(objeto);
        } catch (Exception erro) {
            throw erro;
        }
    }

   @Override
    public void excluir(int id) throws Exception {
        try{
        String erro = "";
            if(!erro.isEmpty())throw new Exception("Insira o nome do cliente a ser excluido\n");   
            c.excluir(id);
        }catch (Exception erro) {
            throw erro;
    }
    }

    @Override
    public void alterar(Contato objeto) throws Exception {
        try {
            String erro = verificar(objeto);
            if (!erro.isEmpty()) throw new Exception(erro);
            c.alterar(objeto);
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public LinkedList<Contato> listar() throws Exception {
        try {             
            return c.listar();
        } catch (Exception erro) {
            throw erro;
        }
    }
    private MetodosPdf pdf = new MetodosPdf();

    public void gerarPdf(List<Contato> contatos) {
        try {
            String filePath = "Tabela.PDF";
            pdf.gerarPdf(contatos, filePath);
        } catch (Exception erro) {
            System.out.println("Erro ao gerar PDF: " + erro.getMessage());
            throw erro;
        }
    }

    public void abrirPdf(String filePath) {
        try {
            pdf.abrirPdf(filePath);
        } catch (Exception erro) {
            System.out.println("Erro ao abrir PDF: " + erro.getMessage());
            throw erro;
        }
    }
   private String verificar(Contato objeto){
        String erro = "";
        if(!objeto.getNomeCompleto().matches("^[a-zA-Z0-9 ]+$")) erro += "Esse campo (nome) somente aceita letras\n";
        if(!objeto.getEmail().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) erro += "Esse campo (email) recebeu um email invalido.\n";
        if(!objeto.getEndereco().getLogradouro().matches("^[a-zA-Z0-9 ]+$")) erro += "Esse campo (logadouro) somente aceita letras e numeros\n";
        if(!objeto.getEndereco().getCidade().matches("^[a-zA-Z ]+$")) erro += "Esse campo (cidade) somente aceita letras\n";
        if(!objeto.getEndereco().getEstado().matches("^[a-zA-Z ]+$")) erro += "Esse campo (estado) somente aceita letras\n";
        if((objeto.getTelefone().getDdi()) == 0 || (objeto.getTelefone().getDdi()) >99) erro += "Informe um (DDI) de telefone valido.\n";
        if((objeto.getTelefone().getDdd()) < 11 || (objeto.getTelefone().getDdd()) >99) erro += "Informe um (DDD) de telefone valido.\n";
        if((objeto.getEndereco().getNumero()) < 1 || (objeto.getEndereco().getNumero()) > 5000) erro = "Informe um numero de residencia que seja valido para endereço.\n";
        String cep = Integer.toString(objeto.getEndereco().getCep());
        if(!cep.matches("^[0-9]{8}$")) erro += "Informe um CEP valido deve ter 8 digitos.\n";
        String ddi = Integer.toString(objeto.getTelefone().getDdi());
        if(!ddi.matches("[0-9]+")) erro += "Esse campo (DDI) somente aceita numeros.\n";
        String ddd = Integer.toString(objeto.getTelefone().getDdd());
        if(!ddd.matches("[0-9]+")) erro += "Esse campo (DDD) somente aceita numeros.\n";
        String numero = Integer.toString(objeto.getTelefone().getNumero());
        if(!numero.matches("[0-9]+")) erro += "Esse campo (numero) somente aceita numeros.\n";
        return erro;
    }
}