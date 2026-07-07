/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author Pedro Francisco
 */
public class ConjuntoDosNumerosNaturais {
    private long numero = 0;

public ConjuntoDosNumerosNaturais(ConjuntoDosNumerosNaturais objeto){
    this.numero = objeto.numero;
}
   public  ConjuntoDosNumerosNaturais(long numero) throws Exception{
       if(numero < 0 ){
            throw new Exception("Digite um número Natural no campo do primeiro número");
        }
        this.numero = numero;
   }
    
    public int fatorial(long numero) {
    if (numero == 0) {
        return 1;
    } else {
        return (int) (numero * fatorial(numero - 1));
    }
}

public boolean numeroPerfeito(long numero) {
    int somaDivisores = 0;
    for (int i = 1; i < numero; i++) {
        if (numero % i == 0) {
            somaDivisores += i;
        }
    }
    return somaDivisores == numero;
}

public boolean capicua(long numero) {
    String numeroString = String.valueOf(numero);
    return numeroString.equals(new StringBuilder(numeroString).reverse().toString());
}

public boolean quadradoPerfeito(long numero) {
    double raiz = Math.sqrt(numero);
    return raiz == (long) raiz;
}

public boolean primo(long numero) {
    if (numero <= 1) {
        return false;
    }
    for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
            return false;
        }
    }
    return true;
}

public String mudarBase(int base) {
            String convertido = "";
            String resto = "0123456789ABCDEF";
            long copiaNumero = numero;
            while(copiaNumero > 0){
                convertido = resto.charAt((int)(copiaNumero % base)) + convertido;
                copiaNumero /= base;
            }
        return convertido;
        }

public int mdc(long numero1, long numero2) {
    if (numero2 == 0) {
        return (int) numero1;
    } else {
        return mdc(numero2, numero1 % numero2);
    }
}

public int mmc(long numero1, long numero2) {
    return (int) (numero1 * numero2 / mdc(numero1, numero2));
}

public boolean primosEntreSi(long numero1, long numero2) {
    return primo(numero1) && primo(numero2) && mdc(numero1, numero2) == 1;
} 
}
