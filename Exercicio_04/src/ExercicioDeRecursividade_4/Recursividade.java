/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioDeRecursividade_4;
/**
 *
 * @author Pedro Francisco
 */
public class Recursividade {
     private int N1 = 0;
    private int N2 = 0;

    public Recursividade(){
    }

    public int getN1() {
        return N1;
    }

    public void setn1(int N1) {
        this.N1 = N1;
    }

    public int getN2() {
        return N2;
    }

    public void setY(int N2) {
        this.N2= N2;
    }
     public Recursividade(int N1, int N2) throws Exception {
        if (N1 == 0) throw new Exception("n1 não pode estar vazio");
        this.N1 = N1;

        if (N2 == 0) throw new Exception("n2 não pode estar vazio");
        this.N2 = N2;
    }
     public int multiplicarInterativo(int N1, int N2) {
    if (N2 == 0) {
        return 0;
    }
    boolean negativo = false;
    if (N2 < 0) {
        negativo = true;
        N2 = -N2; 
    }

    int resultado = 0;
    for (int i = 0; i < N2; i++) {
        resultado += N1; 
    }

    return negativo ? -resultado : resultado; 
}
    public int multiplicarRecursivo(int N1, int N2) {
        if (N2 == 0) {
            return 0;
        }
        if (N2 < 0) {
            return -multiplicarRecursivo(N1, -N2);
        }
        // Caso recursivo
        return N1 + multiplicarRecursivo(N1, N2 - 1);
    }      

}
