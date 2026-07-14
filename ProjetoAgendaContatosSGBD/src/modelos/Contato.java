/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

public class Contato {
    //Atributos
    private String nomeCompleto = "";
    private String telefone = "";
    private String email = "";
    //Metodos
    //MEtodos Construtores
    public Contato() {
    }
    public Contato(String nomeCompleto, String telefone, String email) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
    }
    // Metodos set´s e get´s
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    } 
}
