
package visao;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import persistencia.ManipularArquivoAlunos;
import persistencia.ManipularArquivoCursos;


/**
 *
 * @author dobne
 */
public class BotoesPanel extends javax.swing.JPanel {
    private final TelaPrincipal telaPrincipal;
    
    private ManipularArquivoCursos maniCursos;
    private ManipularArquivoAlunos maniAlunos;

    /**
     * Creates new form Botoes
     */
    public BotoesPanel(TelaPrincipal telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
        setLayout(null);
        initComponents();
        
        maniCursos = new ManipularArquivoCursos(new File("src/dados/Cursos.csv"));
        maniAlunos = new ManipularArquivoAlunos(new File("src/dados/DadosDosAlunos.csv"), telaPrincipal.treeCursos);
        
        jButton_Alunos.addActionListener(new AbrirNovaTelaAction(new AlunosPanel(telaPrincipal.treeAlunos, telaPrincipal.treeCursos), telaPrincipal));
        jButton_Cursos.addActionListener(new AbrirNovaTelaAction(new CursosPanel(telaPrincipal.treeCursos), telaPrincipal));
        jButton_Enfase.addActionListener(new AbrirNovaTelaAction(new EnfasePanel(), telaPrincipal));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Alunos = new javax.swing.JButton();
        jButton_Enfase = new javax.swing.JButton();
        jButton_Cursos = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("Projeto Alunos");
        setPreferredSize(new java.awt.Dimension(495, 200));

        jButton_Alunos.setBackground(new java.awt.Color(255, 153, 0));
        jButton_Alunos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_Alunos.setText("Alunos");

        jButton_Enfase.setBackground(new java.awt.Color(51, 204, 0));
        jButton_Enfase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_Enfase.setText("Enfases");

        jButton_Cursos.setBackground(new java.awt.Color(0, 153, 153));
        jButton_Cursos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_Cursos.setText("Cursos");
        jButton_Cursos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Cursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CursosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jButton_Cursos, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton_Alunos, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton_Enfase, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Alunos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Enfase, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cursos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_CursosActionPerformed

    private class AbrirNovaTelaAction implements ActionListener {
    private final JPanel painelInicial;
    private final TelaPrincipal telaPrincipal;
    private JFrame tela;

    public AbrirNovaTelaAction(JPanel painelInicial, TelaPrincipal telaPrincipal) {
        this.painelInicial = painelInicial;
        this.telaPrincipal = telaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tela == null) {
            tela = new JFrame("Alunos");
            tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tela.setSize(1000, 800);
            tela.setLayout(new BorderLayout());

            tela.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                try {
                    maniCursos.salvarCursos(telaPrincipal.treeCursos);
                    maniAlunos.salvarAlunos(telaPrincipal.treeAlunos);
                } catch (Exception ex) {
                    System.err.println("Erro ao salvar os dados: " + ex.getMessage());
                }
            }
        });
            
            JButton botaoAlunos = new JButton("Alunos");
            JButton botaoCursos = new JButton("Cursos");
            JButton botaoEnfase = new JButton("Enfases");

            estilizarBotao(botaoAlunos, new java.awt.Color(255,153,0));
            estilizarBotao(botaoCursos, new java.awt.Color(0,153,153));
            estilizarBotao(botaoEnfase, new java.awt.Color(51,204,0));
            
            JPanel botoesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 20));
            botoesPanel.setBackground(java.awt.Color.WHITE);
            botoesPanel.add(botaoAlunos);
            botoesPanel.add(botaoCursos);
            botoesPanel.add(botaoEnfase);

            tela.add(botoesPanel, BorderLayout.NORTH);

            painelInicial.setPreferredSize(new Dimension(1000, 740));
            tela.add(painelInicial, BorderLayout.CENTER);

            botaoAlunos.addActionListener(e1 -> alterarPainel(new AlunosPanel(telaPrincipal.treeAlunos, telaPrincipal.treeCursos)));
            botaoCursos.addActionListener(e1 -> alterarPainel(new CursosPanel(telaPrincipal.treeCursos)));
            botaoEnfase.addActionListener(e1 -> alterarPainel(new EnfasePanel()));
        } else {
            alterarPainel(painelInicial);
        }

        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        telaPrincipal.dispose();
    }

    private void alterarPainel(JPanel novoPainel) {
        Component componenteCentral = tela.getContentPane().getComponent(1);
        if (componenteCentral != null) {
            tela.getContentPane().remove(componenteCentral);
        }

        novoPainel.setPreferredSize(new Dimension(1000, 740));
        tela.add(novoPainel, BorderLayout.CENTER);

        tela.revalidate();
        tela.repaint();
    }
    
    private void estilizarBotao(JButton botao, java.awt.Color corFundo) {
        botao.setBackground(corFundo);
        botao.setForeground(java.awt.Color.WHITE);
        botao.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));
        botao.setPreferredSize(new Dimension(115, 35));
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Alunos;
    private javax.swing.JButton jButton_Cursos;
    private javax.swing.JButton jButton_Enfase;
    // End of variables declaration//GEN-END:variables
}
