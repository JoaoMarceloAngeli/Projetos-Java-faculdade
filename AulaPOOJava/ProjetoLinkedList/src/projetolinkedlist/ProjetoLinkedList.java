/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolinkedlist;
//incluido Biblioteca
import java.util.LinkedList;

/**
 * Paginas a serem visitadas
 * https://www.devmedia.com.br/diferenca-entre-arraylist-vector-e-linkedlist-em-java/29162
 * https://www.devmedia.com.br/explorando-a-classe-arraylist-no-java/24298
 */
public class ProjetoLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void mostrarDados(LinkedList objeto, String str){
        System.out.println("\nDados da Lista Ligada: " + str);
        System.out.println("Tamanho: " + objeto.size());
        System.out.println("Esta Vazia:  " + objeto.isEmpty());
        System.out.println("Dados: " + objeto.toString());
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList<String> dados = new LinkedList<String>();
        
        mostrarDados(dados,"\nLista Ligada Inicial");
        // Adicionar elementos no final da lista
        dados.addLast("Eduardo");
        dados.addLast("Andre");
        dados.addLast("Geraldo");
        mostrarDados(dados,"\nLista com elementos");
        
        // Adicionar elementos no inicio da lista
        dados.addFirst("Carlos");
        dados.addFirst("Julio");
        dados.addFirst("Leandra");
        mostrarDados(dados,"\nLista com elementos");
        
        //Adicionar elementos na posicao indicada
        dados.add(0, "Maria");
        dados.add(3, "Jose");
        dados.add(5, "Godofredo");
        mostrarDados(dados,"\nLista com elementos");
        
        // inclusão de elementos no final
        dados.add("Brendo");
        dados.add("Debora");
       
        
        //Mostrar dados usando for
        //Obter o elemento da lista com get + posicao desejada
        System.out.println("\nMostrar dados usando for");
        for(int pos = 0; pos < dados.size(); pos++){
            System.out.println("Lista["+pos+"]= "+dados.get(pos));
        }
        
        //Qual a posição do elemento
        System.out.println("\n");
        String nome = "Geraldo";
        System.out.println(nome + " esta na posição : "+ dados.indexOf(nome));
        nome = "Messala";
        System.out.println(nome + " esta na posição : "+ dados.indexOf(nome));
        
        //Verificar se um dados elemento existe no arrayList
        System.out.println("\n");
        nome = "Geraldo";
        if(dados.contains(nome)) 
            System.out.println(nome + " existe na Lista Lincada");
        else System.out.println(nome + " não existe na Lista Lincada");
        
        nome = "Messala";
        if(dados.contains(nome)) 
            System.out.println(nome + " existe na Lista Lincada");
        else System.out.println(nome + " não existe na Lista Lincada");
        
        dados.sort(null);
        //Mostrar dados usando while
        System.out.println("\nMostrar dados ordenados usando While");
        int pos = 0;
        while(pos < dados.size()){
            System.out.println("Lista["+pos+"]= "+dados.get(pos));
            pos++;
        }
        
        System.out.println("\n");
        System.out.println("Obter dado do inicio da Lista: " + dados.getFirst());
        System.out.println("Obter dado do fim da Lista: " + dados.getLast());
        mostrarDados(dados,"Lista todos os elementos");
        
        System.out.println("\n");
        System.out.println("\nRemover dado do inicio da Lista: " + dados.removeFirst());
        System.out.println("Remover dado do fim da Lista: " + dados.removeLast());
        System.out.println("Remover dado na pisicao indica na Lista: " + dados.remove(5));
        System.out.println("Remover um dado especifico: " + dados.remove("Geraldo"));
        mostrarDados(dados,"Lista todos os elementos");
        
        //Para substituir um elemento na lista
        System.out.println("\n");
        dados.set(5, "Geraldo Trocado");
        System.out.println("\nMostrar dados usando While");
        pos = 0;
        while(pos < dados.size()){
            System.out.println("Lista["+pos+"]= "+dados.get(pos));
            pos++;
        }
        mostrarDados(dados,"Lista todos os elementos");
        

        //Mostrar dados usando for
        System.out.println("\n");
        System.out.println("\nMostrar dados usando for");
        for(pos = 0; pos < dados.size(); pos++){
            System.out.println("Vetor["+pos+"]= "+dados.get(pos));
        }
        mostrarDados(dados,"Array todos os elementos");
        
        //Como limpar o Arraylist completamente
        dados.clear();
        mostrarDados(dados,"Array todos os elementos");

    }
    
}
