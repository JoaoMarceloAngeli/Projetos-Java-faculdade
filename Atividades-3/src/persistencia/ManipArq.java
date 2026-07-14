/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import manipulacao.ConjuntoProfessores;
import modelos.Professor;


public class ManipArq{
    private File nomeArqui = new File("");
    
    public ManipArq() {
    }
    public ManipArq(File nomeArqui) {
        this.nomeArqui = nomeArqui;
    }

    public void setNomeArqui(File nomeArqui) {
        this.nomeArqui = nomeArqui;
    }
    
    public ConjuntoProfessores obterProfess() throws Exception{
        try{
        ConjuntoProfessores professor = new ConjuntoProfessores(1001,5);
        FileReader lerArq = new FileReader(nomeArqui);
        BufferedReader bufLer = new BufferedReader(lerArq);
        String linha = "";
        while((linha = bufLer.readLine()) != null){
        String[] partesLinha = linha.split(";");
        Professor conjtProfessor = new Professor(Integer.parseInt(partesLinha[0]), partesLinha[1], partesLinha[2], partesLinha[3], partesLinha[4]);   
        //Criar objeto contato
        professor.incluir(conjtProfessor);
        }
        bufLer.close();
        return professor;
        }
        catch (Exception erro){
        throw new Exception(erro.getMessage() + "erro no obter dados");
        }
    }
    
    
}