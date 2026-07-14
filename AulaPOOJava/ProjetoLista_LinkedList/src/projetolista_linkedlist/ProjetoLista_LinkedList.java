/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetolista_linkedlist;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ejmcc
 */
public class ProjetoLista_LinkedList {

  public static void mostrarDados(List lista, String str){
        System.out.println("\nDados da Lista Ligada: " + str);
        System.out.println("Tamanho: " + lista.size());
        System.out.println("Esta Vazia:  " + lista.isEmpty());
        System.out.println("Dados: " + lista.toString());
    }
  public static void main(String[] args) {
    // TODO code application logic here
    //List<String> dados = new LinkedList();
    List<String> dados = new ArrayList();
    mostrarDados(dados,"\nLista Ligada Inicial");

    // Adicionar elementos na lista
    dados.add("Eduardo");
    dados.add("Andre");
    dados.add("Geraldo");
    mostrarDados(dados,"\nLista com elementos-1");
        
    //Adicionar elementos na posicao indicada
    dados.add(0, "Maria");
    dados.add(3, "Jose");
    dados.add(5, "Godofredo");
    mostrarDados(dados,"\nLista com elementos-2");
       
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

    //Ordenando os dados
    dados.sort(null);
    //Mostrar dados usando while
    System.out.println("\nMostrar dados ordenados usando While");
    int pos = 0;
    while(pos < dados.size()){
        System.out.println("Lista["+pos+"]= "+dados.get(pos));
        pos++;
    }
        
    System.out.println("\n");
    System.out.println("Obter dado do inicio da Lista: " + dados.get(0));
    System.out.println("Obter dado do fim da Lista: " + dados.get(dados.size()-1));
    mostrarDados(dados,"Lista todos os elementos-3");

    System.out.println("\n");
    System.out.println("\nRemover dado de uma posicao da Lista: " + dados.remove(0));
    System.out.println("Remover um dado especifico: " + dados.remove("Geraldo"));
    mostrarDados(dados,"Lista todos os elementos-4");

    //Para substituir um elemento na lista
    System.out.println("\n");
    dados.set(2, "Geraldo Trocado");
    System.out.println("\nMostrar dados usando While");
    pos = 0;
    while(pos < dados.size()){
        System.out.println("Lista["+pos+"]= "+dados.get(pos));
        pos++;
    }
    mostrarDados(dados,"Lista todos os elementos-5");


    //Mostrar dados usando for
    System.out.println("\n");
    System.out.println("\nMostrar dados usando for");
    for(pos = 0; pos < dados.size(); pos++){
        System.out.println("Vetor["+pos+"]= "+dados.get(pos));
    }
    mostrarDados(dados,"Array todos os elementos-6");

    //Como limpar o Arraylist completamente
    dados.clear();
    mostrarDados(dados,"Array todos os elementos");

  }
  
}
