/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoqueue;
//Bibliotecas necessaria para implementar uma fila
//uma coleção primeiro a entrar, primeiro a sair que modela uma fila
import java.util.Queue;
//Estrutra a ser usa para implementar a Fila
import java.util.LinkedList;
/**
 *
 * @author ejmcc
 */
public class ProjetoQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<String> filaDeString = new LinkedList<String>();
        
        //Como saber se a fila esta vazia
        System.out.println("1 - A fila esta Vazia: " + filaDeString.isEmpty());
        
        //Como saber a quantidade de elementos da Fila
        System.out.println("2 - Quantidade de Elementos: " + filaDeString.size());
        
        //Como adicionar elemento da Fila
        //Método add
        filaDeString.add("Patrícia");
        filaDeString.add("Roberto");
        filaDeString.add("Flávio");
        filaDeString.add("Pamela");
        filaDeString.add("Anderson");

        //Como saber se a fila esta vazia
        System.out.println("3 - A fila esta Vazia: " + filaDeString.isEmpty());
        
        //Como saber a quantidade de elementos da Fila
        System.out.println("4 - Quantidade de Elementos: " + filaDeString.size());
        
        //Como mostrar todos os elementos de uma fila
        while(!filaDeString.isEmpty()){
            System.out.println("N - "+filaDeString.poll());
        }
        
        //como obter o primeiro elemento da Fila sem retirar
        System.out.println(filaDeString.peek());
        System.out.println(filaDeString.peek());
        
        
        //Como obter o primeiro elemento da Fila retirando este
        System.out.println("1 - "+filaDeString.poll());
        System.out.println("1 - "+filaDeString.poll());

        
        System.out.println(filaDeString);
    }
}
    
