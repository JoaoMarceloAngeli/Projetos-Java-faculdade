
package visao;

import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.classes.Alunos;
import modelos.classes.Cursos;

/**
 *
 * @author dobne
 */
public class AlunosPanel extends javax.swing.JPanel {
    private TreeMap<String, Alunos> treeAlunos;
    private TreeMap<Integer, Cursos> treeCursos;
    /**
     * Creates new form AlunosPanel
     */
    public AlunosPanel(TreeMap<String, Alunos> treeAlunos, TreeMap<Integer, Cursos> treeCursos) {
        if (treeAlunos == null) {
         this.treeAlunos = new TreeMap<>();
     } else this.treeAlunos = treeAlunos;
        
        initComponents();
        this.treeCursos = treeCursos;
        preencherComboBoxCursos();
        listar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField_Matricula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_Periodo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_Turno = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_Enfase = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox_Curso = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Alunos = new javax.swing.JTable();
        jButton_Alterar = new javax.swing.JButton();
        jButton_Incluir = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 191, 116));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Matrícula:");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome:");

        jComboBox_Periodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Período:");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Turno:");

        jComboBox_Turno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MATUTINO", "VESPERTINO", "NOTURNO" }));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ênfase:");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Curso:");

        jTable_Alunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Matrícula", "Nome", "Turno", "Período", "Ênfase", "Curso"
            }
        ));
        jTable_Alunos.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable_Alunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_AlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Alunos);

        jButton_Alterar.setBackground(new java.awt.Color(255, 102, 0));
        jButton_Alterar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_Alterar.setText("Alterar");
        jButton_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AlterarActionPerformed(evt);
            }
        });

        jButton_Incluir.setBackground(new java.awt.Color(255, 102, 0));
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
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Turno, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Nome, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(jComboBox_Curso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_Enfase, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_Periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(371, 371, 371))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_Periodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox_Turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox_Enfase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Alterar)
                    .addComponent(jButton_Incluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_IncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IncluirActionPerformed
        try{
            String erro = "";
            if(jTextField_Matricula.getText().isEmpty()) erro += "Informe a matrícula para incluir.";
            if(jTextField_Nome.getText().isEmpty()) erro += "Nome deve ser preenchido.";
            
            if (!erro.isEmpty()) throw new Exception(erro);
            
            String matricula = jTextField_Matricula.getText();
            String nome = jTextField_Nome.getText().toUpperCase();
            String turno = (String) jComboBox_Turno.getSelectedItem();
            int periodo = (int) jComboBox_Periodo.getSelectedItem();
            String enfase = (String) jComboBox_Enfase.getSelectedItem();
            Cursos curso = (Cursos) jComboBox_Curso.getSelectedItem();

            
            Alunos aluno = new Alunos(matricula, nome, Alunos.TurnoEnum.valueOf(turno), periodo, enfase, curso);
            
            if (treeAlunos.containsKey(matricula)) {
                JOptionPane.showMessageDialog(this, "Já existe um aluno com essa matrícula.");
            } else {
                treeAlunos.put(matricula, aluno);
                JOptionPane.showMessageDialog(this, "Aluno incluído com sucesso!");
                listar();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro ao incluir aluno: " + e.getMessage());
        }
        
    }//GEN-LAST:event_jButton_IncluirActionPerformed

    private void jButton_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AlterarActionPerformed
    try{ 
        String matricula = jTextField_Matricula.getText();
        String nome = jTextField_Nome.getText().toUpperCase();
        String turno = (String) jComboBox_Turno.getSelectedItem();
        int periodo = (int) jComboBox_Periodo.getSelectedItem();
        String enfase = (String) jComboBox_Enfase.getSelectedItem();
        Cursos curso = (Cursos) jComboBox_Curso.getSelectedItem();
        
        Alunos antigo = treeAlunos.get(matricula);
        Alunos novo = new Alunos(matricula, nome, Alunos.TurnoEnum.valueOf(turno), periodo, enfase, curso);

        treeAlunos.replace(matricula, antigo, novo);
        JOptionPane.showMessageDialog(this, "Dados alterados com sucesso!");

        jTextField_Matricula.setText("");
        jTextField_Nome.setText("");
        jTextField_Matricula.setEditable(true);
        listar();
    }catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage() + "\nErro ao alterar curso\n", "Erro", JOptionPane.ERROR_MESSAGE);
    }        
    }//GEN-LAST:event_jButton_AlterarActionPerformed

    private void jTable_AlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_AlunosMouseClicked
        jTextField_Matricula.setEditable(false);
        
        int selecionado = jTable_Alunos.getSelectedRow();
            
            if (selecionado == -1) {
                JOptionPane.showMessageDialog(null, "Selecione uma linha para editar.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
            }
            
            String matricula = (String) jTable_Alunos.getValueAt(selecionado, 0);
            String nome = (String) jTable_Alunos.getValueAt(selecionado, 1);
            String turno = (String) jComboBox_Turno.getSelectedItem();
            String periodo = (String) jComboBox_Periodo.getSelectedItem();
            String enfase = (String) jComboBox_Enfase.getSelectedItem();
            String curso = (String) jComboBox_Curso.getSelectedItem();
            
            jTextField_Matricula.setText(matricula);
            jTextField_Nome.setText(nome);
            jComboBox_Turno.setSelectedItem(turno);
            jComboBox_Periodo.setSelectedItem(periodo);
            jComboBox_Enfase.setSelectedItem(enfase);
            jComboBox_Curso.setSelectedItem(curso);
            
    }//GEN-LAST:event_jTable_AlunosMouseClicked
    
    public void preencherComboBoxCursos() {
    try {
        for (Map.Entry<Integer, Cursos> entry : treeCursos.entrySet()) {
            int codigo = entry.getKey();
            String descricao = entry.getValue().getDescricao();

            jComboBox_Curso.addItem(codigo + " - " + descricao);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao preencher os cursos na comboBox: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
}

    public void listar(){
        try{
        if (treeAlunos.isEmpty() || treeAlunos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não há alunos para exibir.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable_Alunos.getModel();
        jTable_Alunos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable_Alunos.getColumnModel().getColumn(0).setPreferredWidth(150);
        jTable_Alunos.getColumnModel().getColumn(1).setPreferredWidth(280);
        jTable_Alunos.getColumnModel().getColumn(2).setPreferredWidth(135);
        jTable_Alunos.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTable_Alunos.getColumnModel().getColumn(4).setPreferredWidth(50);
        jTable_Alunos.getColumnModel().getColumn(5).setPreferredWidth(200);

        
        model.setRowCount(0);
        
        treeAlunos.forEach((matricula, alunos) -> {
            Object[] dados = {
                alunos.getMatricula(),
                alunos.getNome(),
                alunos.getTurno(),
                alunos.getPeriodo(),
                alunos.getEnfase(),
                alunos.getCurso().getDescricao()
            };
            model.addRow(dados);
        });
        
        jTable_Alunos.setModel(model);
        jTable_Alunos.revalidate();
        jTable_Alunos.repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao listar alunos: " + e.getMessage());
        }
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Alterar;
    private javax.swing.JButton jButton_Incluir;
    private javax.swing.JComboBox<String> jComboBox_Curso;
    private javax.swing.JComboBox<String> jComboBox_Enfase;
    private javax.swing.JComboBox<String> jComboBox_Periodo;
    private javax.swing.JComboBox<String> jComboBox_Turno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Alunos;
    private javax.swing.JTextField jTextField_Matricula;
    private javax.swing.JTextField jTextField_Nome;
    // End of variables declaration//GEN-END:variables
}
