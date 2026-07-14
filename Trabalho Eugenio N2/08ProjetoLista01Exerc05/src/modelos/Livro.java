/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Cliente
 */
public class Livro extends Produto{
    private String titulo = " ";
    private String autor = " ";
    private String editora = " ";
    private int anoPuBlicacao = 0;

    public Livro(int codigo, String titulo, String autor, String editora, int anoPuBlicacao) {
        super(codigo);
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPuBlicacao = anoPuBlicacao;
    }

    public Livro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPuBlicacao() {
        return anoPuBlicacao;
    }

    public void setAnoPuBlicacao(int anoPuBlicacao) {
        this.anoPuBlicacao = anoPuBlicacao;
    }

    @Override
    public String obterDescricaoProduto() {
        return "Titulo:" + titulo + " Autor:" + autor + " Editora:" + editora + " Ano publicacao:" + anoPuBlicacao;
    }

    @Override
    public float obterPrecoVenda() {
        return (float) 18.99;
    }

    @Override
    public String obterTipoProduto() {
        return "Livro";
    }
    
    
}
