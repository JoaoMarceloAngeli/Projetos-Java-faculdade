/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg08projetolista01exerc05;
import modelos.Produto;
import modelos.Livro;
import modelos.CD;
import modelos.TV;
import modelos.Notebook;
/**
 *
 * @author Cliente
 */
public class Main {
    private static void imprimir( Produto objeto){
        String saida = "Produtos:" + "\n";
        saida += "Tipo de Produto: " + objeto.obterTipoProduto() + "\n";
        saida += "Codigo: " + objeto.getCodigo()+ "\n";
        saida += "Descricao produto: " + objeto.obterDescricaoProduto() + "\n";
        saida += "Preco de venda: " + objeto.obterPrecoVenda() + "\n";
        System.out.println(saida);
    }
    public static void main(String[] args) {
        
        Livro livr = new Livro(455, "Bao de banana", "Lucas", "Ronaldo", 1999);
        CD cd1 = new CD(88, "Roberto", "Macacos", "Juvenal", "Samba");
        TV tv1 = new TV(994, "M4888", "LG", "SnapDragon", 66);
        Notebook noteB =new Notebook(7858, "gffgfig", "Vigarista", "Banana", 90, 32, 18, "MediaTeck");
            
        imprimir(livr);
        imprimir(cd1);
        imprimir(tv1);
        imprimir(noteB);
    }
    
}
