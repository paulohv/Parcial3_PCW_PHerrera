/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author pauloherrera
 */
public class menuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form menuPrincipal
     */
    public menuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        txtRut = new javax.swing.JTextField();
        btnBuscarRut = new javax.swing.JButton();
        lblRut = new javax.swing.JLabel();
        btnClientes = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnListaPrecios = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 800));
        setSize(new java.awt.Dimension(1440, 900));
        getContentPane().setLayout(null);

        txtRut.setBackground(new java.awt.Color(152, 201, 58));
        txtRut.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });
        getContentPane().add(txtRut);
        txtRut.setBounds(460, 50, 480, 70);

        btnBuscarRut.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnBuscarRut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-search_more.png"))); // NOI18N
        btnBuscarRut.setText("BUSCAR");
        getContentPane().add(btnBuscarRut);
        btnBuscarRut.setBounds(960, 50, 140, 70);

        lblRut.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblRut.setText("INGRESE RUT O Nº ORDEN");
        lblRut.setAutoscrolls(true);
        getContentPane().add(lblRut);
        lblRut.setBounds(130, 70, 310, 30);

        btnClientes.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-group.png"))); // NOI18N
        btnClientes.setText("CLIENTES");
        getContentPane().add(btnClientes);
        btnClientes.setBounds(340, 680, 180, 70);

        btnReportes.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-to_do.png"))); // NOI18N
        btnReportes.setText("REPORTES");
        getContentPane().add(btnReportes);
        btnReportes.setBounds(990, 680, 180, 70);

        btnProveedores.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-supplier.png"))); // NOI18N
        btnProveedores.setText("PROVEDORES");
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnProveedores);
        btnProveedores.setBounds(740, 680, 220, 70);

        btnListaPrecios.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnListaPrecios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-cash_in_hand.png"))); // NOI18N
        btnListaPrecios.setText("PRECIOS");
        getContentPane().add(btnListaPrecios);
        btnListaPrecios.setBounds(540, 680, 180, 70);

        btnAdmin.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-admin_settings_male.png"))); // NOI18N
        btnAdmin.setText("ADMINISTRADOR");
        getContentPane().add(btnAdmin);
        btnAdmin.setBounds(90, 680, 220, 70);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo fondo blanco.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(-110, 0, 1570, 840);

        jMenu1.setText("Archivo");

        jMenuItem2.setText("Clientes");
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Usuarios");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Reportes");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Salir");
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Estado");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Historial");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ayuda");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProveedoresActionPerformed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnBuscarRut;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnListaPrecios;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnReportes;
    private javax.swing.JLabel fondo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JLabel lblRut;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
