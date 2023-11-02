/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototipo;

/**
 *
 * @author Usuario
 */
public class Manual extends javax.swing.JFrame {

    /**
     * Creates new form Manual
     */
    public Manual() {
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

        Marco = new javax.swing.JLabel();
        Manual = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FormatoManual = new javax.swing.JTextArea();
        logoImagen = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        BotonRegresar = new javax.swing.JButton();
        fondo2 = new javax.swing.JLabel();
        fondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Marco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        getContentPane().add(Marco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 460, 310));

        Manual.setBackground(new java.awt.Color(153, 153, 153));
        Manual.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        Manual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Manual.setText("MANUAL");
        Manual.setOpaque(true);
        getContentPane().add(Manual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 460, 50));

        FormatoManual.setEditable(false);
        FormatoManual.setBackground(new java.awt.Color(255, 255, 204));
        FormatoManual.setColumns(20);
        FormatoManual.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        FormatoManual.setRows(5);
        FormatoManual.setText("\n  Este manual de instrucciones se refiere a cuatro pantallas, una de inisio de \n  sesión, una de registro, una de recuperar contraseña y por ultimo el \n  presente manual.\n\n  *Cada pantalla tiene un logotipo en la parte superior y un formulario debajo.\n\n  *La pantalla de inicio de sesión tiene campos para correo electrónico y \n  contraseña, un botón para iniciar sesión, recordar datos, un boton que te\n  dirige a la pantalla de crear cuenta, y un boton que te dirige a la pantalla de\n  recuperar contraseña.\n\n  *La pantalla de registro tiene campos para nombre, apellido, correo \n  electrónico, confirmacion de correo, contraseña, confirmacion de contraseña\n  y un botón para crear la cuenta.\n\n  *La pantalla de recuperación de contraseña tiene campos para digitar la nueva\n  contraseña, correo electrónico y código, un botón para enviar el código, un\n  boton para recuperar y un boton para reenviar el codigo en caso de que no se envie.");
        FormatoManual.setBorder(null);
        FormatoManual.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(FormatoManual);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 460, 270));

        logoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diseno-de-logo.png"))); // NOI18N
        getContentPane().add(logoImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 130, 130));

        logo.setBackground(new java.awt.Color(255, 255, 255));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lavado-en-seco.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 130, 130));

        BotonRegresar.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        BotonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow.png"))); // NOI18N
        BotonRegresar.setText("Regresar");
        BotonRegresar.setContentAreaFilled(false);
        getContentPane().add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, -1));

        fondo2.setBackground(new java.awt.Color(255, 255, 204));
        fondo2.setForeground(new java.awt.Color(204, 204, 204));
        fondo2.setOpaque(true);
        getContentPane().add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 460, 310));

        fondo1.setBackground(new java.awt.Color(0, 102, 102));
        fondo1.setOpaque(true);
        getContentPane().add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 649, 662));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JTextArea FormatoManual;
    private javax.swing.JLabel Manual;
    private javax.swing.JLabel Marco;
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel fondo2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoImagen;
    // End of variables declaration//GEN-END:variables
}
