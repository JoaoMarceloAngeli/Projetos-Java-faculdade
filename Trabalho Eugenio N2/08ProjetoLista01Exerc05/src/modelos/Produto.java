/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Cliente
 */
abstract public class Produto {
    //atributos
    protected int codigo = 0;
    
    //metodos
    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public Produto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    //metodos abstratos
    abstract public String obterDescricaoProduto();
    abstract public float obterPrecoVenda();
    abstract public String obterTipoProduto();
}
