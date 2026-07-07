
package visao;

import java.io.File;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import modelos.classes.Alunos;
import modelos.classes.Cursos;
import persistencia.ManipularArquivoAlunos;
import persistencia.ManipularArquivoCursos;

/**
 *
 * @author dobne
 */

public class TelaPrincipal extends javax.swing.JFrame {
    TreeMap <Integer, Cursos> treeCursos = null;
    TreeMap <String, Alunos> treeAlunos = null;

    public TelaPrincipal() {
        
        CarregarArquivoCursos();
        CarregarArquivoAlunos();
        
        setSize(500, 200);
        BotoesPanel botoes = new BotoesPanel(this);
        getContentPane().add(botoes);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Alunos");
        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void CarregarArquivoCursos(){
        String caminhoArquivo = "src/dados/Cursos.csv";
        
        try {
            File arquivo = new File(caminhoArquivo);
        
            if (!arquivo.exists()) {
                throw new Exception("Arquivo não encontrado no caminho: " + caminhoArquivo);
            }
            
            ManipularArquivoCursos manipulador = new ManipularArquivoCursos(arquivo);
            treeCursos = manipulador.carregarArquivoCursos();
                System.out.println("Cursos carregados: " + treeCursos.size()); // Verificação

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar csv dos cursos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void CarregarArquivoAlunos(){
        String caminhoArquivo = "src/dados/DadosDosAlunos.csv";
        
        try{
            File arquivo = new File(caminhoArquivo);
            
            if(!arquivo.exists()) throw new Exception("Arquivo não encontrado no caminho: " + caminhoArquivo);
            
            ManipularArquivoAlunos manipulador = new ManipularArquivoAlunos(arquivo, treeCursos);
            treeAlunos = manipulador.carregarArquivoAlunos();
                    System.out.println("Alunos carregados: " + treeAlunos.size());

        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar csv dos alunos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
