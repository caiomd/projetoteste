package br.com.projeto.view;

import br.com.projeto.model.Cliente;

import br.com.projeto.dao.ClienteDAO;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Frmcadastrocliente extends javax.swing.JFrame {

    public void Listar() {
        try {
                ClienteDAO dao = new ClienteDAO();
                List<Cliente> lista = dao.listarTodosClientes();
                DefaultTableModel model = (DefaultTableModel) tabelacliente.getModel();
                model.setNumRows(0);

            for (Cliente obj : lista) {
                model.addRow(new Object[]{
                    obj.getCod_cliente(),
                    obj.getNome(),
                    obj.getEndereco(),
                    obj.getTelefone(),
                    obj.getEmail(),
                    obj.getIdade(),
                    obj.getSalario()
                });
            }
        } catch (Exception e) {
            System.out.println("Aconteceu o erro: " + e);
        }
    }
    
    
    

    public Frmcadastrocliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txttelefone = new javax.swing.JTextField();
        txtidade = new javax.swing.JTextField();
        txtsalario = new javax.swing.JTextField();
        btnbusca = new javax.swing.JButton();
        btnalterar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelacliente = new javax.swing.JTable();
        txtbusca = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btncadastrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtendereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Código:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("E-mail:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Telefone:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Idade:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtcodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcodigo.setText("txtcod");
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 50, -1));

        txtnome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnome.setText("txtnome");
        getContentPane().add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 243, -1));

        txtemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtemail.setText("txtemail");
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 242, -1));

        txttelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttelefone.setText("txttelefone");
        getContentPane().add(txttelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 234, -1));

        txtidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtidade.setText("txtidade");
        getContentPane().add(txtidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 234, -1));

        txtsalario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtsalario.setText("txtsalario");
        getContentPane().add(txtsalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 238, -1));

        btnbusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnbusca.setText("Buscar");
        btnbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaActionPerformed(evt);
            }
        });
        getContentPane().add(btnbusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, -1, -1));

        btnalterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnalterar.setText("Alterar");
        btnalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnalterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        btnexcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnexcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        tabelacliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Endereço", "Telefone", "E-mail", "Idade", "Salário"
            }
        ));
        tabelacliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaclienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelacliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 600, 160));

        txtbusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbusca.setText("txtbusca");
        getContentPane().add(txtbusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 243, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Nome:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        btncadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btncadastrar.setText("Cadastrar");
        btncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btncadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Endereço:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtendereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtendereco.setText("txtendereco");
        getContentPane().add(txtendereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 242, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Salário:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaActionPerformed
        try {
           
              String nome = "%" + txtbusca.getText() + "%";
            
               ClienteDAO dao = new ClienteDAO();
                List<Cliente> lista = dao.buscarClientePorNome(nome);
                DefaultTableModel model = (DefaultTableModel) tabelacliente.getModel();
                model.setNumRows(0);

            for (Cliente obj : lista) {
                model.addRow(new Object[]{
                    obj.getCod_cliente(),
                    obj.getNome(),
                    obj.getEndereco(),
                    obj.getTelefone(),
                    obj.getEmail(),
                    obj.getIdade(),
                    obj.getSalario()
                });
            }
                
        } catch (Exception e) {     
        
        }

    }//GEN-LAST:event_btnbuscaActionPerformed

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed
        try {
            Cliente obj = new Cliente();
            
            obj.setNome(txtnome.getText());
            obj.setEmail(txtemail.getText());
            obj.setTelefone(txttelefone.getText());
            obj.setEndereco(txtendereco.getText());
            obj.setIdade(Integer.parseInt(txtidade.getText()));
            obj.setSalario(Double.parseDouble(txtsalario.getText()));
         

            ClienteDAO dao = new ClienteDAO();
            dao.cadastrar(obj);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Aconteceu o erro: " + e);

        }
    }//GEN-LAST:event_btncadastrarActionPerformed

    private void btnalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterarActionPerformed
        try {
            Cliente obj = new Cliente();

            obj.setNome(txtnome.getText());
            obj.setEmail(txtemail.getText());
            obj.setTelefone(txttelefone.getText());
            obj.setEndereco(txtendereco.getText());
            obj.setIdade(Integer.parseInt(txtidade.getText()));
            obj.setSalario(Double.parseDouble(txtsalario.getText()));

            obj.setCod_cliente(Integer.parseInt(txtcodigo.getText()));

            ClienteDAO dao = new ClienteDAO();
            dao.alterar(obj);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Aconteceu o erro: " + e);
        }
    }//GEN-LAST:event_btnalterarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        try {
            Cliente obj = new Cliente();

            obj.setCod_cliente(Integer.parseInt(txtcodigo.getText()));

            ClienteDAO dao = new ClienteDAO();
            dao.excluir(obj);
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Aconteceu o erro: " + e);
        }
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Listar();
    }//GEN-LAST:event_formWindowActivated

    private void tabelaclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaclienteMouseClicked
        
        txtcodigo.setText(tabelacliente.getValueAt(tabelacliente.getSelectedRow(), 0).toString());
        txtnome.setText(tabelacliente.getValueAt(tabelacliente.getSelectedRow(), 1).toString());      
        txtendereco.setText(tabelacliente.getValueAt(tabelacliente.getSelectedRow(), 2).toString());
        txttelefone.setText(tabelacliente.getValueAt(tabelacliente.getSelectedRow(), 3).toString());
        txtemail.setText(tabelacliente.getValueAt(tabelacliente.getSelectedRow(), 4).toString());  
        txtidade.setText(tabelacliente.getValueAt(tabelacliente.getSelectedRow(), 5).toString());
        txtsalario.setText(tabelacliente.getValueAt(tabelacliente.getSelectedRow(), 6).toString());
       
    }//GEN-LAST:event_tabelaclienteMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Frmcadastrocliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmcadastrocliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmcadastrocliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmcadastrocliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmcadastrocliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnalterar;
    private javax.swing.JButton btnbusca;
    private javax.swing.JButton btncadastrar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelacliente;
    private javax.swing.JTextField txtbusca;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JTextField txtidade;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtsalario;
    private javax.swing.JTextField txttelefone;
    // End of variables declaration//GEN-END:variables
}
