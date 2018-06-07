/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import javax.swing.UIManager;

public final class PanelSplash extends javax.swing.JFrame {

    Cargar hilo;

    public PanelSplash() {
        initComponents();
        iniciar();

        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        UIManager.put("ProgressBar.background", Color.RED);
        UIManager.put("ProgressBar.foreground", Color.RED);
        UIManager.put("ProgressBar.selectionBackground", Color.RED);
        UIManager.put("ProgressBar.selectionForeground", Color.RED);

        progreso.setForeground(new Color(90, 80, 153, 100));
        progreso.setBackground(new Color(90, 80, 153, 100));
        progreso.setStringPainted(true);

    }

    public void iniciar() {
        setLocationRelativeTo(null);
        hilo = new Cargar(getProgreso());
        hilo.start();

        //progreso.setForeground(Color.cyan);
        //progreso.setBackground(Color.red);
        progreso.setString("Cargando...");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progreso = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progreso.setBackground(java.awt.Color.cyan);
        progreso.setFont(new java.awt.Font("Neuropol", 0, 14)); // NOI18N
        progreso.setForeground(java.awt.Color.cyan);
        progreso.setMaximum(400);
        progreso.setValue(50);
        progreso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.cyan, java.awt.Color.cyan, java.awt.Color.cyan, java.awt.Color.cyan));
        progreso.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        progreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                progresoStateChanged(evt);
            }
        });
        getContentPane().add(progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 360, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IntNovaSoftPlusBlack.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void progresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_progresoStateChanged

        if (progreso.getValue() == 400) {

            // System.exit(0);
            new PanelPrincipal().setVisible(true);
            this.setVisible(false);

        }

    }//GEN-LAST:event_progresoStateChanged

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
            java.util.logging.Logger.getLogger(PanelSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelSplash().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar progreso;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the progreso
     */
    public javax.swing.JProgressBar getProgreso() {
        return progreso;
    }

    /**
     * @param progreso the progreso to set
     */
    public void setProgreso(javax.swing.JProgressBar progreso) {
        this.progreso = progreso;
    }
}
