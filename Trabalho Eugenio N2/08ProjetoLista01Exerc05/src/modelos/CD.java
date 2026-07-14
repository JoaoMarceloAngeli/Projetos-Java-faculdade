/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Cliente
 */
public class CD extends Produto{
    //atributos
    private String nomeAlbum = " ";
    private String banda = " ";
    private String cantor = " ";
    private String generoMusical = " ";
    //metodos

    public CD(int codigo, String nomeAlbum, String banda, String cantor, String generoMusical) {
        super(codigo);
        this.nomeAlbum = nomeAlbum;
        this.banda = banda;
        this.cantor = cantor;
        this.generoMusical = generoMusical;
    }

    public CD() {
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    @Override
    public String obterDescricaoProduto() {
        return "Nome Album:" + nomeAlbum + " Banda:" + banda + " Cantor:" + cantor + " Genero Musical:" + generoMusical;
    }

    @Override
    public float obterPrecoVenda() {
        return (float) 13.50;
    }

    @Override
    public String obterTipoProduto() {
        return "CD";
    }
    
    
}
