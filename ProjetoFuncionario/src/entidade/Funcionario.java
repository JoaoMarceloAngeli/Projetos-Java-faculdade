/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author Pedro Francisco
 */
public class Funcionario {
     private String matricula = "";
    private String nome = "";
    private int numeroDependentes = 0;
    private int itens = 0;
    private int gratificacao = 0;
    private float salarioBase = 0;
  private float salarioBruto = 0;
  private float descontoINSS = 0;
    private float descontoIRPF = 0;
    private float descontoDependentes = 0;
    private float salarioLiquido = 0;

    public int getGratificacao() {
        return gratificacao;
    }

      public int getItens() {
        return itens;
    }

    public void setItens(int itens) {
        this.itens = itens;
    }
    public float getSalarioBruto() {
        return salarioBruto;
    }

    public float getDescontoINSS() {
        return descontoINSS;
    }

    public float getDescontoIRPF() {
        return descontoIRPF;
    }

    public float getDescontoDependentes() {
        return descontoDependentes;
    }
  
    
//Metódos
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }


        public float getSalarioLiquido() {
        return salarioLiquido;
    }

    
    public Funcionario(String matricula, String nome, 
            int numeroDependentes, float salarioBase, int itens) throws Exception{
      
        if(matricula.isEmpty()){
                throw new Exception("Insirá a matrícula");
            }
        this.matricula = matricula;
        if(nome.isEmpty()){
            throw new Exception("Nome não pode ficar em branco");
        }
        this.nome = nome;
        if(numeroDependentes < 0){
            throw new Exception("Número de dependentes não pode ser menor que 0");
        }
        this.numeroDependentes = numeroDependentes;
        if(salarioBase <= 0){
            throw new Exception("Salário base não pode ser menor ou igual a 0");
        }
        this.salarioBase = salarioBase;
        if(itens <= 0){
            throw new Exception("O número de itens não pode ser 0 ou menor que 0");
        }
        this.itens = itens;
        calcularSalario();
            }
    private void calcularSalario(){
        salarioBruto = salarioBase + calcularGratificacao(itens);
        descontoINSS = calcularINSS(salarioBruto);
        descontoIRPF = calcularIRPF(salarioBruto - descontoINSS);
        descontoDependentes = numeroDependentes * 123;
        salarioLiquido = salarioBruto - descontoINSS - descontoIRPF -descontoDependentes;
    }
    private int calcularGratificacao(int itens){
        if(itens <= 1000){
            this.gratificacao = 500;
            return this.gratificacao;
            
        }
        else if(itens >= 1001 && itens <= 2000){
            this.gratificacao = 1250;
            return this.gratificacao;   
        }
        else{
            this.gratificacao = 2250;
            return this.gratificacao;
        }
    }
    private float calcularINSS(float salarioBruto){
        if(salarioBruto <= 1302.00){
            return (float) (salarioBruto * 0.075);
        }
        else if(salarioBruto <= 2571.29){
            return (float) (salarioBruto * 0.09);
        }
        else if(salarioBruto <= 3856.94){
            return (float) (salarioBruto * 0.12);
        }
        else {
            return (float) (salarioBruto * 0.14);
        }
    }
    private float calcularIRPF(float salarioBase){
        if(salarioBase <= 1902.00){
            return 0;
        }
        else if(salarioBase <= 2826.65){
            return (float) (salarioBase * 0.075);
        }
        else if(salarioBase <= 3751.05){
            return (float) (salarioBase * 0.15);
        }
        else if(salarioBase <= 4664.68){
            return (float) (salarioBase * 0.225);
        }
        else{
            return (float) (salarioBase * 0.275);
        }
    }
}
