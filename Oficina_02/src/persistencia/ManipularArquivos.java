/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import modelos.classes.Professor;
import modelos.classes.ConjuntoProfessores;

public class ManipularArquivos {
    private String nomeDoArquivo;

    public ManipularArquivos(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public ConjuntoProfessores obterListaProfessores() throws Exception {
        ConjuntoProfessores objConjuntoProfessores = new ConjuntoProfessores(1001);

        try (FileReader fr = new FileReader(nomeDoArquivo);
             BufferedReader br = new BufferedReader(fr)) {

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] vetorStr = linha.split(";");
                if (vetorStr.length >= 5) {
                    try {
                        int matricula = Integer.parseInt(vetorStr[0]);
                        if (matricula > 0 && matricula < 1001) {
                            Professor objetoProfessor = new Professor(
                                matricula,
                                vetorStr[1],
                                vetorStr[2],
                                vetorStr[3],
                                vetorStr[4]
                        );
                        objConjuntoProfessores.incluir(objetoProfessor);
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Erro ao converter matrícula para número: " + vetorStr[0]);
                    }
                } else {
                    System.err.println("Linha com formato inválido: " + linha);
                }
            }
        } catch (IOException e) {
            throw new Exception("Erro ao ler o arquivo: " + e.getMessage(), e);
        }

        return objConjuntoProfessores;
    }
}
