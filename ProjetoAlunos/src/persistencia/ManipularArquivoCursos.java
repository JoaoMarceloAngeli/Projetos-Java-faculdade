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
import modelos.classes.Cursos;

/**
 *
 * @author dobne
 */
public class ManipularArquivoCursos {
    private TreeMap<Integer, Cursos> tree;
    private File nomeDoArquivo;
    
    public ManipularArquivoCursos(File nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
        this.tree = new TreeMap<>();
    }
    
    public TreeMap<Integer, Cursos> carregarArquivoCursos() throws Exception {        
        try (BufferedReader br = new BufferedReader(new FileReader(nomeDoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partesLinha = linha.split(";");
                if (partesLinha.length >= 2) {
                    try {
                        int codigo = Integer.parseInt(partesLinha[0]);
                        String desc = partesLinha[1].trim();
                        tree.put(codigo, new Cursos(codigo, desc)); 
                    } catch (IllegalArgumentException e) {
                        System.err.println("Erro ao processar linha: " + linha + " - " + e.getMessage());
                    }
                }
            }
            return tree;
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao carregar arquivo CSV.", "Erro", JOptionPane.ERROR_MESSAGE);
            throw new Exception("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
    
    public void salvarCursos(TreeMap<Integer, Cursos> treeCursos) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeDoArquivo.getPath(), true))) {
        for (Map.Entry<Integer, Cursos> entry : treeCursos.entrySet()) {
            Cursos curso = entry.getValue();
            writer.write(curso.toString());
            writer.newLine();
        }
    } catch (IOException ex) {
        System.err.println("Erro ao salvar os dados: " + ex.getMessage());
    }
}
}
