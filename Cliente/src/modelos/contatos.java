/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author eduar
 */
public class contatos {
    private int idContato = 0;
    private String nomeCompleto = "";
    private Telefone telefone = null;
    private String email = "";
    private Endereco endereco = null;
    public contatos(){
        
    }
    public contatos(int idContato, String nomeCompleto, Telefone telefone, String email, Endereco endereco)throws Exception{
        this.idContato = idContato;
        if(nomeCompleto.isEmpty())throw new Exception("o nome nao pode estar vazio");
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        if(email.isEmpty())throw new Exception("o email nao pode estar vazio");
        this.email = email;
        this.endereco = endereco;
    }
    public int getIdContato() {
        return idContato;
    }
    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) throws Exception{
        if(nomeCompleto.isEmpty())throw new Exception("o nome nao pode estar vazio");
        this.nomeCompleto = nomeCompleto;
    }

    public Telefone getTelefone(){
        return telefone;
    }

    public void setTelefone(Telefone telefone) throws Exception{
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception{
        if(email.isEmpty())throw new Exception("o email nao pode estar vazio");
        this.email = email;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) throws Exception{
        this.endereco = endereco;
    }
}
