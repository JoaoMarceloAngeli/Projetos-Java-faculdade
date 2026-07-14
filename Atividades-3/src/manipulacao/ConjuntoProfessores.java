/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulacao;
import java.util.LinkedList;
import modelos.Professor;


public final class ConjuntoProfessores implements Interface.IProfessor{
    private LinkedList<Professor>[] array = null;
    private int tamanho = 0;
    private int colisoes = 0;
    int tamanho_tabela= 0;

    public ConjuntoProfessores(int tamanho, int colisoes) throws Exception{
    this.tamanho = tamanho;
    this.colisoes = colisoes;
    tamanho_tabela =tamanho_tabela_hash(tamanho, colisoes);
    array = new LinkedList[tamanho_tabela];
     for (int i = 0; i < (tamanho_tabela_hash(tamanho, colisoes)); i++) {
            array[i] = new LinkedList<>();
            for(int j = 0; j< colisoes;j++){
                array[i].add(j, null);
            }
        }
    }

    public ConjuntoProfessores() {
    }
    
    @Override
    public void incluir(Professor objetoPro) throws Exception {
        try {
            String erro = "";
           if(objetoPro.getMatricula() > 1001) throw new Exception("Errro tamanho;");
          
           if(!erro.isEmpty())throw new Exception("Insira a matricula do professor a ser excluido\n");  
    
            if (array == null) {
            throw new Exception("Array não foi inicializado.");
            }

            int index = hash(objetoPro.getMatricula()); // Garantir índice não negativo
            
            if (index > array.length) {
                throw new Exception("Índice fora dos limites do array.");
            }
            
            if(array[index].contains(objetoPro)) throw new Exception("Repitido");
            
            array[index].addFirst(objetoPro);

        } catch (Exception erro) {
        throw new Exception(erro.getMessage() + " erro no Incluir Conjunto");
        }   
    }

    public int getColisoes() {
        return colisoes;
    }
    public int hash(int matricula){
        return matricula%tamanho_tabela;
    }
   public int tamanho_tabela_hash(int numero, int colisoes) throws Exception{
       try {
           int i = 2;
           int cont = 0;
           int resposta = 0;
          int tamVe = numero/colisoes;
          boolean primo = false;
          while(primo == false){
              while(i<=tamVe){
              if(tamVe%i == 0){
                  cont ++;
          }
              i++;
          }
          if(cont == 1){
              resposta = tamVe;
              primo = true;
          }
          tamVe++;
          cont = 0;
          i = 2;
          }
          return resposta;
       } catch (Exception erro) {
        throw new Exception(erro.getMessage() + "erro no hash Conjunto");

       }
   }

    @Override
    public void excluir(int matricula) throws Exception {
        try {
        String erro = "";
        if(!erro.isEmpty())throw new Exception("Insira a matricula do professor a ser excluido\n");  
        
        int index = hash(matricula);
        
        int percorre = 0;
        while(((array[index].get(percorre))!= null) && percorre < colisoes){
            
            if(array[index].get(percorre).getMatricula() == matricula){
            array[index].set(percorre,null);
            }
            percorre++;
        }
        } catch (Exception erro) {
        throw new Exception(erro.getMessage() + " erro no excluir Conjunto");
        }   
    }

    @Override
    public void alterar(Professor objeto) throws Exception {
        try {
        String erro = verificar(objeto);           
        if(!erro.isEmpty())throw new Exception(erro);
            int index = hash(objeto.getMatricula()); // Garantir índice não negativo
        
        int percorre = 0;
        while(((array[index].get(percorre))!= null) && percorre < colisoes){
            if(array[index].get(percorre).getMatricula() == objeto.getMatricula()){
            array[index].set(percorre,objeto);
            }
            percorre++;
        }
        } catch (Exception erro) {
        throw new Exception(erro.getMessage() + "erro no alterar Conjunto");
        }   
    }
    @Override
    public LinkedList<Professor>[] listar() throws Exception {
        try {
            if (array == null) throw new Exception("Array não foi inicializado.");

            return array.clone();
        } catch (Exception erro) {
        throw new Exception(erro.getMessage() + "erro no listar Conjunto");
        }   
    }
    private String verificar(Professor objeto){
        String erro = "";
        if(objeto.getNome().isEmpty()) erro += "Esse campo (nome) e obrigatorio, nao pode estar vazio.\n";
        if(!objeto.getNome().matches("^[a-zA-Z ]+$")) erro += "Esse campo (nome) somente aceita letras\n";
        if(objeto.getEscola().isEmpty()) erro += "Esse campo (escola) e obrigatorio, nao pode estar vazio.\n";
        if(!objeto.getEscola().matches("^[a-zA-Z/ ]+$")) erro += "Esse campo (escola) somente aceita letras\n";
        if(objeto.getContrato().isEmpty()) erro += "Esse campo (contrato) e obrigatorio, nao pode estar vazio.\n";
        if(!objeto.getContrato().matches("^[a-zA-Z ]+$")) erro += "Esse campo (contrato) somente aceita letras\n";
        if(objeto.getTitulacao().isEmpty()) erro += "Esse campo (titulacao) e obrigatorio, nao pode estar vazio.\n";
        //if(!objeto.getTitulacao().matches("^[a-zA-Z(-) ]+$")) erro += "Esse campo (titulacao) somente aceita letras\n";

        return erro;
    }

}
