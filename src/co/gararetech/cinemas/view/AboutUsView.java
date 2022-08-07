/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.gararetech.cinemas.view;

import co.gararetech.cinemas.view.elements.RoundedPanel;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class AboutUsView extends javax.swing.JFrame {
    /**
     * Creates new form AboutUsView
     */
    private int mouseX;
    private int mouseY;

    public AboutUsView() throws IOException {
        initComponents();
    }

    public int getMouseX() {
        return mouseX;
    }

    public void setMouseX(int mouseX) {
        this.mouseX = mouseX;
    }

    public int getMouseY() {
        return mouseY;
    }

    public void setMouseY(int mouseY) {
        this.mouseY = mouseY;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        panelDaftarAnggota = new javax.swing.JPanel();
        panelEdwin = new RoundedPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelEri = new RoundedPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelHanif = new RoundedPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        panelBadar = new RoundedPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        panelIlmi = new RoundedPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 640));
        setMinimumSize(new java.awt.Dimension(1024, 640));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mainPanelMouseDragged(evt);
            }
        });
        mainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainPanelMousePressed(evt);
            }
        });
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHeader.setBackground(Color.decode("#1D1C1C"));
        panelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/gararetech/cinemas/view/images/logo-159.png"))); // NOI18N
        panelHeader.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/gararetech/cinemas/view/images/exitButton.png"))); // NOI18N
        exit.setToolTipText("EXIT");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setIconTextGap(0);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        panelHeader.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, -1, -1));

        jLabel22.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("DEVELOPERS");
        panelHeader.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        mainPanel.add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 90));

        panelDaftarAnggota.setBackground(Color.decode("#42382F"));
        panelDaftarAnggota.setToolTipText("");
        panelDaftarAnggota.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEdwin.setBackground(Color.decode("#1D1C1C"));
        panelEdwin.setToolTipText("Edwin Liona Jaya");
        panelEdwin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/gararetech/cinemas/view/images/devs/devEdwin.png"))); // NOI18N
        panelEdwin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 6, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("EDWIN LIONA JAYA");
        panelEdwin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 15, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("10121154");
        panelEdwin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 52, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("UI/UX, BACK END, FRONT END");
        panelEdwin.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 89, -1, -1));

        panelDaftarAnggota.add(panelEdwin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 410, 140));

        panelEri.setBackground(Color.decode("#1D1C1C"));
        panelEri.setToolTipText("Eri Sukmawan");
        panelEri.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/gararetech/cinemas/view/images/devs/devEri.png"))); // NOI18N
        jLabel3.setToolTipText("Eri Sukmawan");
        panelEri.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ERI SUKMAWAN");
        panelEri.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 15, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("10121139");
        panelEri.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 52, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("UI/UX,BACK END, FRONT END");
        panelEri.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 89, -1, -1));

        panelDaftarAnggota.add(panelEri, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 410, 140));

        panelHanif.setBackground(Color.decode("#1D1C1C"));
        panelHanif.setToolTipText("Hanif Ahmad Syauqi");
        panelHanif.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/gararetech/cinemas/view/images/devs/devHanif.png"))); // NOI18N
        panelHanif.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("HANIF AHMAD SYAUQI");
        panelHanif.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 15, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("10121161");
        panelHanif.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 52, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("API STRUCTURE");
        panelHanif.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 110, 310, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("UI/UX, BACK END,FRONT END,");
        panelHanif.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 89, 310, -1));

        panelDaftarAnggota.add(panelHanif, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 410, 140));

        panelBadar.setBackground(Color.decode("#1D1C1C"));
        panelBadar.setToolTipText("ALFATIHNAMAN B");
        panelBadar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/gararetech/cinemas/view/images/devs/devBadar.png"))); // NOI18N
        panelBadar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ALFATIHNAMAN BADHARIJA ");
        panelBadar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 15, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("10121135");
        panelBadar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 52, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("UI/UX, FRONT END");
        panelBadar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 89, -1, -1));

        panelDaftarAnggota.add(panelBadar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 410, 140));

        panelIlmi.setBackground(Color.decode("#1D1C1C"));
        panelIlmi.setToolTipText("ILMI FATHURAHMAN G.");
        panelIlmi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/gararetech/cinemas/view/images/devs/devIlmi.png"))); // NOI18N
        panelIlmi.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("ILMI FATHURAHMAN G.");
        panelIlmi.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 15, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("10121157");
        panelIlmi.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 52, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("UI/UX, FRONT END");
        panelIlmi.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 89, -1, -1));

        panelDaftarAnggota.add(panelIlmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 410, 140));

        mainPanel.add(panelDaftarAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1030, 550));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void mainPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - this.getMouseX(), y - this.getMouseY());
    }//GEN-LAST:event_mainPanelMouseDragged

    private void mainPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMousePressed
        // TODO add your handling code here:
        this.setMouseX(evt.getX());
        this.setMouseY(evt.getY());
    }//GEN-LAST:event_mainPanelMousePressed

    public JPanel getPanelEdwin() {
        return panelEdwin;
    }

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
            java.util.logging.Logger.getLogger(AboutUsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutUsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutUsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutUsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AboutUsView().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(AboutUsView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelBadar;
    private javax.swing.JPanel panelDaftarAnggota;
    private javax.swing.JPanel panelEdwin;
    private javax.swing.JPanel panelEri;
    private javax.swing.JPanel panelHanif;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelIlmi;
    // End of variables declaration//GEN-END:variables
}
