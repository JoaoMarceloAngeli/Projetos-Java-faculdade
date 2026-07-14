/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;



public class calculadoraNaturais {
   private long numero1 = 0;
   private long numero2 = 0;


   public calculadoraNaturais(long numero1, long numero2) throws Exception{
       if(numero1 < 0 || numero1 % 1 != 0){
            throw new Exception("Digite um número inteiro Natural para o primeiro número");
        }
        this.numero1 = numero1;
       if(numero2 < 0 || numero2 % 1 != 0){
            throw new Exception("Digite um número inteiro Natural para o segundo número");
        }
        this.numero2 = numero2;
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

public String base2(long numero) {
    return Integer.toBinaryString((int) numero);
}

public String base8(long numero) {
    return Integer.toOctalString((int) numero);
}

public String base16(long numero) {
    return Integer.toHexString((int) numero);
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
