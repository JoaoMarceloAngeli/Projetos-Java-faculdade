/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;
import java.util.Random;

/**
 *
 * @author Pedro Francisco
 */
public class Ordenar {
    private int tamanho = 0;
        private int[] vetor;
        
        public Ordenar(){
        }
        public Ordenar(int tamanho)throws Exception{
            if (tamanho <= 0) throw new Exception("O tamanho não pode ser <= 0");
            this.tamanho = tamanho;
            vetor = new int[tamanho];
        }
        public int[] criarVetor(int tamanho){
            Random random = new Random();
            
            for(int i = 0; i < tamanho; i++){
                vetor[i] = random.nextInt(100);
            }
            return vetor;
        }
        public void ordenarVetor(int[] vetor) throws Exception{
            Pilha p1 = new Pilha(tamanho);
            Pilha p2 = new Pilha(tamanho);
            
            for (int i = 0; i < tamanho; i++) {
                p1.inserir(vetor[i]);
            }
            
            while(!p1.estaVazia()){
            int auxiliar = p1.acessar();
            p1.retirar();
            while(!p2.estaVazia() && p2.acessar()> auxiliar){
                p1.inserir(p2.acessar());
                p2.retirar();
            }
            p2.inserir(auxiliar);
            }
            for(int i = tamanho - 1; i >= 0; i--){
                vetor[i] = p2.acessar();
                p2.retirar();
            } 
        }
}
