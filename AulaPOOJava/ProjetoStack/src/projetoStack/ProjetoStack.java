/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoStack;
//Bibliotecas necessaria para implementar uma fila
//uma coleção primeiro a entrar, primeiro a sair que modela uma fila
import java.util.Stack;
/**
 *
 * @author ejmcc
 */
public class ProjetoStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<String> pilhaDeString = new Stack<String>();
        
        //Como saber se a pilha esta vazia
        System.out.println("\n1 - A pilha esta Vazia: " + pilhaDeString.isEmpty());
        
        //Como saber a quantidade de elementos da pilha
        System.out.println("\n2 - Quantidade de Elementos: " + pilhaDeString.size());

        
        //Como adicionar elemento da pilha
        //Método add
        pilhaDeString.push("Patrícia");
        pilhaDeString.push("Roberto");
        pilhaDeString.push("Flávio");
        pilhaDeString.push("Pamela");
        pilhaDeString.push("Anderson");
        
        System.out.println("\n3 - Dados da pilha: " + pilhaDeString);
        
        //Como saber se a pilha esta vazia
        System.out.println("\n4 - A pilha esta Vazia: " + pilhaDeString.isEmpty());

        //Como saber a quantidade de elementos da pilha
        System.out.println("\n5 - Quantidade de Elementos: " + pilhaDeString.size());
        
        //como obter o primeiro elemento da pilha sem retirar
        System.out.println("\nElemento da pilha: " + pilhaDeString.peek());
        System.out.println("\nElemento da pilha: " + pilhaDeString.peek());
       
        //Como mostrar todos os elementos de uma pilha
        System.out.println("\nMostrando os dados da pilha");
        while(!pilhaDeString.isEmpty()){
            System.out.println("N - "+pilhaDeString.pop());
        }
        
        //Como saber se a pilha esta vazia
        System.out.println("\n6 - A pilha esta Vazia: " + pilhaDeString.isEmpty());
        
        //Como saber a quantidade de elementos da pilha
        System.out.println("\n7 - Quantidade de Elementos: " + pilhaDeString.size());
        
        System.out.println(pilhaDeString);

    }
}
    
