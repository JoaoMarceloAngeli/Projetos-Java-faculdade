/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author Pedro Francisco
 */
public class Pilha {
    private int[] array;
	private int tamanho = 16;
	private int topo = 0;

        public Pilha(){
        }
	public Pilha(int tamanho) {
            this.array = new int[tamanho];
            this.tamanho = tamanho;
            this.topo = -1;
	}
	public boolean estaVazia(){
            return topo == -1;
	}
	public boolean estaCheia() {
            return topo == tamanho -1;
	}
	public void inserir(int elemento) throws Exception{
            if (estaCheia()) throw new Exception("Pilha cheia.");
            topo++;
            array[topo] = elemento;
	}
	public void retirar() throws Exception{
            if (estaVazia()) throw new Exception("A pilha está vazia.");
            topo--;
	}
	public int acessar() throws Exception{
            if(estaVazia()) throw new Exception("A pilha está vazia.");
            return array[topo];
	}
}
