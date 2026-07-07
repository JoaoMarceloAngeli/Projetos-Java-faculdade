/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author Pedro Francisco
 */
public class MudancaDeBase {
    private int numero = 0;
        
        public MudancaDeBase(int numero)throws Exception{
            if(numero <= 0) throw new Exception("Número não pode ser <= 0");
            this.numero = numero;
        }
        public MudancaDeBase(){
        }
	public String mudarBase(int base) throws Exception {
            Pilha pilha = new Pilha(16);
            while (numero > 0) {
            int resto = numero % base;
            pilha.inserir(resto);
            numero /= base;
        }
        String resultado = "";
        while(!pilha.estaVazia()){
            int elemento = pilha.acessar();
            if (elemento > 9) resultado += (char) (elemento - 10 + 'A');
            else resultado += elemento;
            pilha.retirar();
        }
        return resultado;
	}
    
}
