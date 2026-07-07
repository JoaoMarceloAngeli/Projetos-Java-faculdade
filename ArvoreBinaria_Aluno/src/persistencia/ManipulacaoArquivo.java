/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import classes.Aluno;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author puc
 */
public class ManipulacaoArquivo {
    private File arquivo = null;

    public ManipulacaoArquivo(File arquivo) {
        this.arquivo = arquivo;
    }
    
    public List<Aluno> getDados() throws Exception{
        try{
            List<Aluno> listaDeAlunos = new LinkedList<>();
            BufferedReader arquivoAberto = new BufferedReader(new FileReader(arquivo));
            String linha;
            while((linha = arquivoAberto.readLine()) != null){

                if(linha.codePointAt(0) == 65279){ //Ignora o caractere BOM(Byte Order Mark) caso ele esteja 
                    //no inicio da linha
                    linha = linha.substring(1);
                }

                String[] camposDaLinha = linha.split(";");
                Aluno alunoAux = new Aluno(camposDaLinha[0], camposDaLinha[1], 
                        camposDaLinha[2], Integer.parseInt(camposDaLinha[3]), 
                        camposDaLinha[4], camposDaLinha[5]);
                listaDeAlunos.add(alunoAux);
            }
            arquivoAberto.close();
            return listaDeAlunos;
        }catch(Exception erro){
            throw erro;
        }
    }
}
