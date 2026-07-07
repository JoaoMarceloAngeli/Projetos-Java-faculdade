
package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import modelos.classes.Alunos;
import modelos.classes.Alunos.TurnoEnum;
import modelos.classes.Cursos;

/**
 *
 * @author dobne
 */
public class ManipularArquivoAlunos {
    private TreeMap<String, Alunos> tree;
    private File nomeDoArquivo;
    private TreeMap<Integer, Cursos> treeCursos;
    
    public ManipularArquivoAlunos (File nomeDoArquivo, TreeMap<Integer, Cursos> treeCursos) {
        this.nomeDoArquivo = nomeDoArquivo;
        this.treeCursos = treeCursos;
        this.tree = new TreeMap<>();
    }
    
    public TreeMap<String, Alunos> carregarArquivoAlunos() throws Exception {        
    
        try (FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr)) {
            
            String linha;
                while ((linha = br.readLine()) != null) {
                String[] partesLinha = linha.split(";");
                if (partesLinha.length >= 5) {
                    try {
                        String matricula = partesLinha[0];
                        String nome = partesLinha[1];
                        TurnoEnum turno = TurnoEnum.valueOf(partesLinha[2]);
                        int periodo = Integer.parseInt(partesLinha[3]);
                        String enfase = partesLinha[4];
                        String codigoCurso = partesLinha[5];
                        int codigoInt = Integer.parseInt(codigoCurso);
                        Cursos curso = treeCursos.get(codigoInt);
                        if (curso == null) {
                            System.err.println("Curso não encontrado para o código: " + codigoCurso);
                            continue;
                        }
                        
                        tree.put(matricula, new Alunos(matricula, nome, turno, periodo, enfase, curso)); 
                    } catch (IllegalArgumentException e) {
                        System.err.println("Erro ao processar linha: " + linha + " - " + e.getMessage());
                    }
            }
        }
            br.close();
            return tree;
            
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao carregar arquivo CSV.", "Erro", JOptionPane.ERROR_MESSAGE);
            throw new Exception("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
    
    public void salvarAlunos(TreeMap<String, Alunos> treeAlunos) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeDoArquivo.getPath(), true))) {
        for (Map.Entry<String, Alunos> entry : treeAlunos.entrySet()) {
            Alunos aluno = entry.getValue();
            writer.write(aluno.toString());
            writer.newLine();
        }
    } catch (IOException ex) {
        System.err.println("Erro ao salvar os dados: " + ex.getMessage());
    }
}

}
