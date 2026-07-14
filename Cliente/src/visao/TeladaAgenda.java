/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import Controle.Controle;
import java.util.Collections;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Endereco;
import modelos.Icrud;
import modelos.Telefone;
import modelos.contatos;
/**
 *
 * @author eduar
 */
public class TeladaAgenda extends javax.swing.JFrame {
    public TeladaAgenda() {
        initComponents();
        jTextField1_idcontato.setEnabled(false);
        listarClientes(0);
    }
    private void limparCaixasdeTexto(){
        jTextField1_idcontato.setText("");
        jFormattedTextField1_telefone.setValue(null);
        jTextField1_logradouro.setText("");
        jTextField1_nome.setText("");
        jTextField2_numero.setText("");
        jTextField3_complemento.setText("");
        jTextField3_email.setText("");
        jTextField4_cep.setText("");
        jTextField5_cidade.setText("");
        jTextField6_estado.setText("");
    }
    private void listarClientes(int escolha){
        try {
            Icrud controle = new Controle();
            Icrud controleDados = new Controle();
            LinkedList<contatos> agenda = controleDados.listarClientes();
            if(escolha == 1){
                Collections.sort(agenda, (contatos Cliente1, contatos Cliente2) -> Cliente1.getNomeCompleto().compareTo(Cliente2.getNomeCompleto()));
            }else{
                Collections.sort(agenda, (contatos Cliente1, contatos Cliente2) -> Integer.compare(Cliente1.getIdContato(), Cliente2.getIdContato()));
            }
            if (agenda != null) {
                jTableResposta.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{"IdContato","Nome", "Telefone", "Email", "Logadouro", "numero", "complemento", "CEP", "Cidade", "Estado"}
                ));
                DefaultTableModel model = (DefaultTableModel) jTableResposta.getModel();
                String[] saida = new String[10];
                int size;
                if ((agenda.size()) == 0) {
                    return;
                } else {
                    size = agenda.size();
                }
                for (int i = 0; i < size; i++) {
                    saida[0] = agenda.get(i).getIdContato() + "";
                    saida[1] = agenda.get(i).getNomeCompleto() + "";
                    saida[2] = "+" + agenda.get(i).getTelefone().getDdi() + "(" + agenda.get(i).getTelefone().getDdd() + ")" + agenda.get(i).getTelefone().getNumero() + "";
                    saida[3] = agenda.get(i).getEmail() + "";
                    saida[4] = agenda.get(i).getEndereco().getLogradouro() + "";
                    saida[5] = agenda.get(i).getEndereco().getNumero() + "";
                    saida[6] = agenda.get(i).getEndereco().getComplemento() + "";
                    saida[7] = agenda.get(i).getEndereco().getCep() + "";
                    saida[8] = agenda.get(i).getEndereco().getCidade() + "";
                    saida[9] = agenda.get(i).getEndereco().getEstado() + "";
                    model.addRow(saida);
                }
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1_nome = new javax.swing.JTextField();
        jTextField3_email = new javax.swing.JTextField();
        jButton2_incluir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableResposta = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jTextField1_logradouro = new javax.swing.JTextField();
        jTextField2_numero = new javax.swing.JTextField();
        jTextField3_complemento = new javax.swing.JTextField();
        jTextField4_cep = new javax.swing.JTextField();
        jTextField5_cidade = new javax.swing.JTextField();
        jTextField6_estado = new javax.swing.JTextField();
        jButton1_excluir = new javax.swing.JButton();
        jButton2_alterar = new javax.swing.JButton();
        jFormattedTextField1_telefone = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1_idcontato = new javax.swing.JTextField();
        jComboBox1_ordenacao = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setText("Agenda de Contatos");

        jTextField1_nome.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jTextField1_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_nomeActionPerformed(evt);
            }
        });
        jTextField1_nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1_nomeKeyReleased(evt);
            }
        });

        jTextField3_email.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N

        jButton2_incluir.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButton2_incluir.setForeground(new java.awt.Color(102, 255, 102));
        jButton2_incluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-soma-30.png"))); // NOI18N
        jButton2_incluir.setText("Incluir");
        jButton2_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_incluirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel5.setText("Telefone");

        jLabel6.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel6.setText("Nome");

        jLabel7.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel7.setText("Email");

        jTableResposta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Email", "Endereco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableResposta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRespostaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableResposta);
        if (jTableResposta.getColumnModel().getColumnCount() > 0) {
            jTableResposta.getColumnModel().getColumn(0).setResizable(false);
            jTableResposta.getColumnModel().getColumn(1).setResizable(false);
            jTableResposta.getColumnModel().getColumn(2).setResizable(false);
            jTableResposta.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel10.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel10.setText("Endereco");

        jTextField1_logradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_logradouroActionPerformed(evt);
            }
        });

        jTextField2_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_numeroActionPerformed(evt);
            }
        });

        jButton1_excluir.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButton1_excluir.setForeground(new java.awt.Color(102, 255, 51));
        jButton1_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-lixeira-30.png"))); // NOI18N
        jButton1_excluir.setText("Excluir");
        jButton1_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_excluirActionPerformed(evt);
            }
        });

        jButton2_alterar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButton2_alterar.setForeground(new java.awt.Color(102, 255, 51));
        jButton2_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-lápis-30.png"))); // NOI18N
        jButton2_alterar.setText("Alterar");
        jButton2_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_alterarActionPerformed(evt);
            }
        });

        try {
            jFormattedTextField1_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+##(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1_telefone.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("LOGADOURO");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("NUMERO");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("COMPLEMENTO");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("CEP");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("CIDADE");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("ESTADO");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setText("idContato");

        jComboBox1_ordenacao.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jComboBox1_ordenacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id Contato", "Nome" }));
        jComboBox1_ordenacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_ordenacaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setText("Listagem de Contatos");

        jButton1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButton1.setText("Ordenar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("SOBRE");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton2_incluir)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1_excluir)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton2_alterar))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField3_email, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jFormattedTextField1_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1)
                                            .addGap(45, 45, 45))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(74, 74, 74)
                                            .addComponent(jLabel9)
                                            .addGap(15, 15, 15))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField1_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField2_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField3_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField4_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField5_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField6_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(445, 445, 445)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(39, 39, 39)
                                            .addComponent(jLabel12)
                                            .addGap(80, 80, 80)
                                            .addComponent(jLabel13)
                                            .addGap(91, 91, 91)
                                            .addComponent(jLabel11)
                                            .addGap(85, 85, 85)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jComboBox1_ordenacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel14))))))
                            .addGap(72, 72, 72))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1_idcontato, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1_idcontato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField1_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(jComboBox1_ordenacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextField1_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addComponent(jTextField3_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField1_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2_incluir)
                    .addComponent(jButton1_excluir)
                    .addComponent(jButton2_alterar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_nomeActionPerformed
        
    }//GEN-LAST:event_jTextField1_nomeActionPerformed

    private void jButton2_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_incluirActionPerformed
        try {
            Icrud controle = new Controle();
            String erro = "";
            if(jTextField1_nome.getText().isEmpty()) erro += "Esse campo (Nome) e obrigatorio, nao pode estar vazio.\n";
            if(jTextField1_nome.getText().isEmpty()) erro += "Esse campo (Nome) e obrigatorio, nao pode estar vazio.\n";
            if(!jFormattedTextField1_telefone.getText().matches("^[0-9()+]+$")) erro += "Esse campo (Telefone) somente aceita numeros e nao pode estar vazio.\n";
            if(jTextField3_email.getText().isEmpty()) erro += "Esse campo (Email) e obrigatorio, nao pode estar vazio\n.";
            if(jTextField1_logradouro.getText().isEmpty()) erro += "Esse campo (Logradouro) e obrigatorio, nao pode estar vazio.\n";
            if(jTextField2_numero.getText().isEmpty()) erro += "Esse campo (Numero) somente aceita numeronao pode estar vazio.\n";
            if(!jTextField2_numero.getText().matches("[0-9]+")) erro += "Esse campo (Numero) somente aceita numeros.\n";
            if(jTextField3_complemento.getText().isEmpty()) erro += "Esse campo (Complemento) e obrigatorio, nao pode estar vazio.\n";
            if(jTextField4_cep.getText().isEmpty()) erro += "Esse campo (CEP) nao pode estar vazio.\n";
            if(!jTextField4_cep.getText().matches("[0-9]+")) erro += "Esse campo (CEP) somente aceita numeros.\n";    
            if(jTextField5_cidade.getText().isEmpty()) erro += "Esse campo (Cidade) e obrigatorio, nao pode estar vazio.\n";
            if(jTextField6_estado.getText().isEmpty()) erro += "Esse campo (Estado) e obrigatorio, nao pode estar vazio.\n";
            if(!erro.isEmpty())throw new Exception(erro);      
            String numeroTele = jFormattedTextField1_telefone.getText().trim();
            String[] telefonePartes = numeroTele.split("[()]+");
            int ddi = Integer.parseInt(telefonePartes[0].substring(1));
            int ddd = Integer.parseInt(telefonePartes[1]);
            int numero = Integer.parseInt(telefonePartes[2]);
            Telefone t1 = new Telefone(ddi, ddd, numero);
            Endereco e1 = new Endereco(jTextField1_logradouro.getText(),
                                        Integer.parseInt(jTextField2_numero.getText()),
                                        jTextField3_complemento.getText(),
                                        Integer.parseInt(jTextField4_cep.getText()),
                                        jTextField5_cidade.getText(),
                                        jTextField6_estado.getText());
            contatos nContato = new contatos();
            nContato.setNomeCompleto(jTextField1_nome.getText().toUpperCase());
            nContato.setTelefone(t1);
            nContato.setEmail(jTextField3_email.getText());
            nContato.setEndereco(e1);
            controle.incluirCliente(nContato);
            listarClientes(0);
            limparCaixasdeTexto();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButton2_incluirActionPerformed

    private void jTextField1_logradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_logradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_logradouroActionPerformed

    private void jTextField2_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_numeroActionPerformed

    private void jTableRespostaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRespostaMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableResposta.getModel(); 
        int linhaselecionada = jTableResposta.getSelectedRow(); 
        jTextField1_idcontato.setText((String) model.getValueAt(linhaselecionada,0));
        jTextField1_nome.setText((String) model.getValueAt(linhaselecionada,1)); 
        jFormattedTextField1_telefone.setText((String) model.getValueAt(linhaselecionada,2));
        jTextField3_email.setText((String) model.getValueAt(linhaselecionada,3));  
        jTextField1_logradouro.setText((String) model.getValueAt(linhaselecionada,4));  
        jTextField2_numero.setText((String) model.getValueAt(linhaselecionada,5));  
        jTextField3_complemento.setText((String) model.getValueAt(linhaselecionada,6));  
        jTextField4_cep.setText((String) model.getValueAt(linhaselecionada,7));  
        jTextField5_cidade.setText((String) model.getValueAt(linhaselecionada,8));  
        jTextField6_estado.setText((String) model.getValueAt(linhaselecionada,9));
    }//GEN-LAST:event_jTableRespostaMouseClicked

    private void jButton1_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_excluirActionPerformed
        // TODO add your handling code here:  
        try {
            Icrud controleDados = new Controle();
            if ((JOptionPane.showConfirmDialog(null, "Voce deseja realmente remover esse contato?", "Remover Contato", JOptionPane.YES_NO_OPTION)) == JOptionPane.YES_OPTION) {
                int idContato = Integer.parseInt(jTextField1_idcontato.getText());
                controleDados.excluirCliente(idContato);
                listarClientes(0);
            }
            limparCaixasdeTexto();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButton1_excluirActionPerformed

    private void jTextField1_nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_nomeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_nomeKeyReleased

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        TelaSobre tela = new TelaSobre(this, true);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jButton2_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_alterarActionPerformed
        // TODO add your handling code here:
        try {
            Icrud controle = new Controle();

            if((JOptionPane.showConfirmDialog(null,"Voce deseja realmente alterar esse contato?", "Alterar Contato",JOptionPane.YES_NO_OPTION)) == JOptionPane.YES_OPTION){
                String numeroTele = jFormattedTextField1_telefone.getText().trim();
                String[] telefonePartes = numeroTele.split("[()]+");
                int ddi = Integer.parseInt(telefonePartes[0].substring(1));
                int ddd = Integer.parseInt(telefonePartes[1]);
                int numero = Integer.parseInt(telefonePartes[2]);
                Telefone t1 = new Telefone(ddi, ddd, numero);
                Endereco e1 = new Endereco(jTextField1_logradouro.getText(),
                                            Integer.parseInt(jTextField2_numero.getText()),
                                            jTextField3_complemento.getText(),
                                            Integer.parseInt(jTextField4_cep.getText()),
                                            jTextField5_cidade.getText(),
                                            jTextField6_estado.getText());
                contatos objeto = new contatos();
                objeto.setIdContato(Integer.parseInt(jTextField1_idcontato.getText()));
                objeto.setNomeCompleto(jTextField1_nome.getText().toUpperCase());
                objeto.setTelefone(t1);
                objeto.setEmail(jTextField3_email.getText());
                objeto.setEndereco(e1);
                controle.alterarCliente(objeto);
                listarClientes(0);
                jButton2_incluir.setEnabled(true);
                jTextField1_nome.setEnabled(true);
                jTextField1_idcontato.setEnabled(true);
                jButton1_excluir.setEnabled(true);
                jTextField1_idcontato.setEnabled(false);
                limparCaixasdeTexto();
            }else{
                jButton2_incluir.setEnabled(true);
                jTextField1_nome.setEnabled(true);
                jTextField1_idcontato.setEnabled(true);
                jButton1_excluir.setEnabled(true); 
                jTextField1_idcontato.setEnabled(false);               
                limparCaixasdeTexto();               
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
        
    }//GEN-LAST:event_jButton2_alterarActionPerformed

    private void jComboBox1_ordenacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_ordenacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1_ordenacaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String a = "Nome";
        if(a.equals(jComboBox1_ordenacao.getSelectedItem().toString())){
            listarClientes(1);
        }else{
            listarClientes(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(TeladaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeladaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeladaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeladaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeladaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeladaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeladaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeladaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeladaAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1_excluir;
    private javax.swing.JButton jButton2_alterar;
    private javax.swing.JButton jButton2_incluir;
    private javax.swing.JComboBox<String> jComboBox1_ordenacao;
    private javax.swing.JFormattedTextField jFormattedTextField1_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableResposta;
    private javax.swing.JTextField jTextField1_idcontato;
    private javax.swing.JTextField jTextField1_logradouro;
    private javax.swing.JTextField jTextField1_nome;
    private javax.swing.JTextField jTextField2_numero;
    private javax.swing.JTextField jTextField3_complemento;
    private javax.swing.JTextField jTextField3_email;
    private javax.swing.JTextField jTextField4_cep;
    private javax.swing.JTextField jTextField5_cidade;
    private javax.swing.JTextField jTextField6_estado;
    // End of variables declaration//GEN-END:variables

    

}
