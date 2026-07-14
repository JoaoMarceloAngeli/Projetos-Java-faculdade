/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoarraylist;
import java.util.ArrayList;

/**
 * Paginas a serem visitadas
 * https://www.devmedia.com.br/diferenca-entre-arraylist-vector-e-linkedlist-em-java/29162
 * https://www.devmedia.com.br/explorando-a-classe-arraylist-no-java/24298
 */
public class ProjetoArrayList {

    /**
     * @param args the command line arguments
     */
    public static void mostrarDados(ArrayList objeto, String str){
        System.out.println("\nDados do ArrayList: " + str);
        System.out.println("Tamanho: " + objeto.size());
        System.out.println("Esta Vazia:  " + objeto.isEmpty());
        System.out.println("Dados: " + objeto.toString());
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> dados = new ArrayList<String>(4);
        
        mostrarDados(dados,"Array Inicial");
        // inclusão de 4 elementos na posicao final
        dados.add("Eduardo");
        dados.add("Andre");
        dados.add("Geraldo");
        dados.add("Carlos");
        
        mostrarDados(dados,"Array com 4 elementos");
        
        //quando o ArrayList vai incluir mais elementos do que ele comporta
        //automaticamente ele e aumentado em 50%
        dados.add("Julio");
        dados.add("Leandra");
        dados.add("Geraldo");
        mostrarDados(dados,"Array com 7 elementos");
        
        //Mostrar dados usando for
        System.out.println("\nMostrar dados usando for");
        for(int pos = 0; pos < dados.size(); pos++){
            System.out.println("Vetor["+pos+"]= "+dados.get(pos));
        }
        
        // inclusão de 2 elementos em uma posição especifica
        dados.add(1,"Brendo");
        dados.add(0,"Debora");
        
        //Como ordenar os dados
        dados.sort(null);
        //Mostrar dados usando while
        System.out.println("\nMostrar dados ordenados usando While");
        int pos = 0;
        while(pos < dados.size()){
            System.out.println("Vetor["+pos+"]= "+dados.get(pos));
            pos++;
        }
        //Verificar se um dado elemento existe no arrayList
        String nome = "Geraldo";
        if(dados.contains(nome)) 
            System.out.println(nome + " existe no arrayList");
        else System.out.println(nome + " não existe no arrayList");
        
        nome = "Godofredo";
        if(dados.contains(nome)) 
            System.out.println(nome + " existe no arrayList");
        else System.out.println(nome + " não existe no arrayList");
        
        //Qual a posição do elemento
        nome = "Geraldo";
        System.out.println(nome + " esta na posição : "+ dados.indexOf(nome));
        
        //Para substituir um elemento na lista
        dados.set(5, "Geraldo Trocado");
        System.out.println("\nMostrar dados usando While");
        pos = 0;
        while(pos < dados.size()){
            System.out.println("Vetor["+pos+"]= "+dados.get(pos));
            pos++;
        }
        mostrarDados(dados,"Array todos os elementos");
        
        //Para remover um elemento em posicao especifica
        dados.remove(5);
        //Mostrar dados usando for
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
