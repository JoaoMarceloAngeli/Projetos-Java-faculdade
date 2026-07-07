
package visao;

import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.classes.Cursos;

/**
 *
 * @author dobne
 */
public class CursosPanel extends javax.swing.JPanel {
    private TreeMap<Integer, Cursos> treeCursos;
    
    /**
     * Creates new form CursosPanel
     */
    public CursosPanel(TreeMap<Integer, Cursos> treeCursos) {
        if (treeCursos == null) {
         this.treeCursos = new TreeMap<>();
     } else this.treeCursos = treeCursos;
       
        initComponents();
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_CodigoCurso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_DescricaoCurso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Cursos = new javax.swing.JTable();
        jButton_Alterar = new javax.swing.JButton();
        jButton_Incluir = new javax.swing.JButton();

        setBackground(new java.awt.Color(71, 203, 203));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Descrição:");

        jTable_Cursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Descrição"
            }
        ));
        jTable_Cursos.getTableHeader().setReorderingAllowed(false);
        jTable_Cursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_CursosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Cursos);

        jButton_Alterar.setBackground(new java.awt.Color(255, 153, 0));
        jButton_Alterar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_Alterar.setText("Alterar");
        jButton_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AlterarActionPerformed(evt);
            }
        });

        jButton_Incluir.setBackground(new java.awt.Color(255, 153, 0));
        jButton_Incluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_Incluir.setText("Incluir");
        jButton_Incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IncluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_DescricaoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField_CodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButton_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_CodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton_Alterar)
                    .addComponent(jButton_Incluir))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_DescricaoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_IncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IncluirActionPerformed
        try{
            String erro = "";
            if (!jTextField_CodigoCurso.getText().matches("\\d+")) erro += "O código deve conter apenas números.\n";
            if(jTextField_CodigoCurso.getText().isEmpty()) erro += "Código não foi preenchido.\n";
            
            if (!erro.isEmpty()) 
                throw new Exception(erro);
        
            int codigo = Integer.parseInt(jTextField_CodigoCurso.getText());
            String descricao = jTextField_DescricaoCurso.getText().toUpperCase();
            if (descricao.isEmpty()) descricao = " ";
            
            Cursos curso = new Cursos(codigo, descricao);
            
            if (curso == null)
                return;
        
            if (treeCursos.containsKey(codigo)) {
                JOptionPane.showMessageDialog(this, "Já existe um curso com esse código.");
            } else {
                treeCursos.put(codigo, curso);
                JOptionPane.showMessageDialog(this, "Curso incluído com sucesso!");
                listar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao incluir curso: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton_IncluirActionPerformed

    private void jButton_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AlterarActionPerformed
       try{ 
            int codigo = Integer.parseInt(jTextField_CodigoCurso.getText());
            String descricao = jTextField_DescricaoCurso.getText().toUpperCase();
            
            Cursos antigo = treeCursos.get(codigo);
            Cursos novo = new Cursos(codigo, descricao);
            
            treeCursos.replace(codigo, antigo, novo);
            JOptionPane.showMessageDialog(this, "Dados alterados com sucesso!");
            
            jTextField_CodigoCurso.setText("");
            jTextField_DescricaoCurso.setText("");
            jTextField_CodigoCurso.setEditable(true);
            listar();
       }catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage() + "\nErro ao alterar curso\n", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton_AlterarActionPerformed

    private void jTable_CursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_CursosMouseClicked
        // TODO add your handling code here:
        jTextField_CodigoCurso.setEditable(false);
        
        int selecionado = jTable_Cursos.getSelectedRow();
            
            if (selecionado == -1) {
                JOptionPane.showMessageDialog(null, "Selecione uma linha para editar.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
            }
            
            int codigo = (int) jTable_Cursos.getValueAt(selecionado, 0);
            String descricaoCurso = (String) jTable_Cursos.getValueAt(selecionado, 1);
            
            jTextField_CodigoCurso.setText(String.valueOf(codigo));
            jTextField_DescricaoCurso.setText(descricaoCurso);
    }//GEN-LAST:event_jTable_CursosMouseClicked
    public void listar(){
        try{
        if (treeCursos.isEmpty() || treeCursos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não há cursos para exibir.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable_Cursos.getModel();
        jTable_Cursos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable_Cursos.getColumnModel().getColumn(0).setPreferredWidth(70);
        jTable_Cursos.getColumnModel().getColumn(1).setPreferredWidth(834);
        
        model.setRowCount(0);
        
        treeCursos.forEach((codigo, cursos) -> {
            Object[] dados = {
                cursos.getCodigo(),
                cursos.getDescricao()
            };
            model.addRow(dados);
        });
        
        jTable_Cursos.setModel(model);
        jTable_Cursos.revalidate();
        jTable_Cursos.repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao listar cursos: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Alterar;
    private javax.swing.JButton jButton_Incluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Cursos;
    private javax.swing.JTextField jTextField_CodigoCurso;
    private javax.swing.JTextField jTextField_DescricaoCurso;
    // End of variables declaration//GEN-END:variables
}
