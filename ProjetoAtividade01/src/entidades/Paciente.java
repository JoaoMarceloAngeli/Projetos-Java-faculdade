/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

public class Paciente {
    //Atributos
    private String nomeCompleto = "";
    private int peso = 0;
    private float altura = 0;
    private String sexo = "";
    
    //Metodos
    public String getNomeCompleto(){
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) throws Exception {
        if(nomeCompleto.isEmpty()) 
            throw new Exception("O nome completo não pode estar vazio");
        this.nomeCompleto = nomeCompleto;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) throws Exception{
        if(peso <= 0) 
            throw new Exception("O peso não pode ser <= 0");
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        if(altura <= 0) 
            throw new Exception("A altura não pode ser <= 0");
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) throws Exception{
        if(sexo.isEmpty()) 
            throw new Exception("O sexo não pode estar vazio");
        this.sexo = sexo;
    }

    public float calcularIMC() {
        return peso/(altura * altura);
    }
}
