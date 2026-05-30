/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.cadastro;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class FrmMedicamento extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmMedicamento.class.getName());
    
    private int idSelecionado = -1;

    public FrmMedicamento() {
        initComponents();
        setLocationRelativeTo(null);  //centraliza a tela
        carregarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblComponente = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtComponente = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMedicamentos = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Cadastro de Medicamentos");

        lblNome.setText("Nome:");

        lblComponente.setText("Componente ativo:");

        lblData.setText("Data Cadastro:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.addActionListener(this::txtDataActionPerformed);

        tblMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Componente Ativo", "Data Cadastro"
            }
        ));
        tblMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicamentosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMedicamentos);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(this::btnAtualizarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblComponente)
                                    .addComponent(lblNome)
                                    .addComponent(lblData))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNome)
                                    .addComponent(txtComponente)
                                    .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAtualizar)
                                .addGap(30, 30, 30)
                                .addComponent(btnExcluir)))))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnSalvar)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitulo)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComponente)
                    .addComponent(txtComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
      
        if (txtNome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o nome do medicamento!");
            txtNome.requestFocus();
        return;
    }

        if (txtComponente.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o componente ativo!");
            txtComponente.requestFocus();
        return;
    }

        if (txtData.getText().trim().equals("__/__/____")|| txtData.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Informe a data de cadastro!");
                txtData.requestFocus();
        return;
    }
        
        try {

            java.sql.Connection con = Conexao.conectar();

            String sql =
                "INSERT INTO medicamento(nome, componenteativo, datacadastro) " + "VALUES (?, ?, ?)";

            java.sql.PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, txtNome.getText());
            ps.setString(2, txtComponente.getText());
            java.time.LocalDate data =
                java.time.LocalDate.parse(
                txtData.getText(),
                java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy")
            );

            ps.setDate(
                    3,
                    java.sql.Date.valueOf(data)
                );

            ps.executeUpdate();
            carregarTabela();

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Medicamento cadastrado com sucesso!"
            );

            txtNome.setText("");
            txtComponente.setText("");
            txtData.setText("");

            txtNome.requestFocus();

            con.close();

        } catch (Exception e) {

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    e.getMessage()
            );

        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tblMedicamentos.getSelectedRow();
        
        if (linha == -1) {

            JOptionPane.showMessageDialog(
                this,
                "Selecione um medicamento na tabela!"
         );

            return;
        }
        int id = Integer.parseInt(
            tblMedicamentos.getValueAt(linha, 0).toString()
        );
        
        int resposta = JOptionPane.showConfirmDialog(
            this,
            "Deseja realmente excluir este medicamento?",
            "Confirmação",
            JOptionPane.YES_NO_OPTION
        );

        if (resposta != JOptionPane.YES_OPTION) {
        return;
        }
        
        try {
            Connection con = Conexao.conectar();

            String sql =
                "DELETE FROM medicamento WHERE id = ?";

            PreparedStatement ps =
                   con.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(
                this,
                "Medicamento excluído com sucesso!"
            );

            carregarTabela();

            con.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                this,
                e.getMessage()
            );

        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tblMedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicamentosMouseClicked
        int linha = tblMedicamentos.getSelectedRow();

        idSelecionado = Integer.parseInt(
            tblMedicamentos.getValueAt(linha, 0).toString()
        );

        txtNome.setText(
            tblMedicamentos.getValueAt(linha, 1).toString()
        );

        txtComponente.setText(
            tblMedicamentos.getValueAt(linha, 2).toString()
        );

        String dataBanco = tblMedicamentos.getValueAt(linha, 3).toString();

        java.time.LocalDate data =
            java.time.LocalDate.parse(dataBanco);

        txtData.setText(
            data.format(
                java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy")
            )
        );
    }//GEN-LAST:event_tblMedicamentosMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {

            if (idSelecionado == -1) {
                JOptionPane.showMessageDialog(
                        this, "Selecione um medicamento na tabela!"
                );
            return;
        }

            Connection con = Conexao.conectar();

            String sql =
                    "UPDATE medicamento " +
                    "SET nome = ?, " +
                    "componenteativo = ?, " +
                    "datacadastro = ? " +
                    "WHERE id = ?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, txtNome.getText());

            ps.setString(2, txtComponente.getText());

            java.time.LocalDate data =
                java.time.LocalDate.parse(
                    txtData.getText(), java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            ps.setDate(
                    3,
                    java.sql.Date.valueOf(data));

            ps.setInt(4, idSelecionado);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(
                    this, "Medicamento atualizado com sucesso!");

            carregarTabela();

            idSelecionado = -1;

            txtNome.setText("");
            txtComponente.setText("");
            txtData.setText("");

            con.close();

            } catch (Exception e) {

                JOptionPane.showMessageDialog(
                    this,
                    e.getMessage()
                );

            }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void carregarTabela() {

        try {

            java.sql.Connection con = Conexao.conectar();

            String sql = "SELECT * FROM medicamento";

            java.sql.PreparedStatement ps =
                    con.prepareStatement(sql);

            java.sql.ResultSet rs =
                    ps.executeQuery();

            javax.swing.table.DefaultTableModel modelo =
                    (javax.swing.table.DefaultTableModel)
                    tblMedicamentos.getModel();

            modelo.setRowCount(0);

            while (rs.next()) {

                modelo.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("componenteativo"),
                    rs.getDate("datacadastro")
                });

            }

            con.close();

        } catch (Exception e) {

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    e.getMessage()
            );

        }
}
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FrmMedicamento().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblComponente;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblMedicamentos;
    private javax.swing.JTextField txtComponente;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
