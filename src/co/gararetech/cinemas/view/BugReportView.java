/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.gararetech.cinemas.view;

import co.gararetech.cinemas.controller.BugReportController;
import co.gararetech.cinemas.view.elements.RoundedPanel;
import co.gararetech.cinemas.view.elements.RoundJButton;
import co.gararetech.cinemas.view.elements.RoundJTextArea;
import co.gararetech.cinemas.view.elements.RoundJTextField;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import java.awt.Color;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author outlo
 */
public class BugReportView extends javax.swing.JFrame {

    /**
     * Creates new form BugReportView
     */
    private BugReportController bugReportController;
    private int mouseX;
    private int mouseY;

    public BugReportView() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        Properties p = new Properties();
        p.put("windowTitleFont", "Ebrima PLAIN 15");
        p.put("logoString", "");
        p.put("windowDecoration", "off");
        AluminiumLookAndFeel.setCurrentTheme(p);
        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        bugReportController = new BugReportController();
        initComponents();
    }

    public BugReportController getBugReportController() {
        return bugReportController;
    }

    public JTextArea getTxtBugDesc() {
        return txtBugDesc;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
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

        outerPanel = new javax.swing.JPanel();
        jPanel2 = new RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new RoundJTextField(25);
        sendBugReport = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBugDesc = new RoundJTextArea();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(744, 576));
        setMinimumSize(new java.awt.Dimension(744, 576));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(744, 576));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        outerPanel.setBackground(Color.decode("#1D1C1C"));
        outerPanel.setPreferredSize(new java.awt.Dimension(849, 584));
        outerPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                outerPanelMouseDragged(evt);
            }
        });
        outerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                outerPanelMousePressed(evt);
            }
        });
        outerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(Color.decode("#222222"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMAIL :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DESKRIPSI BUG:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        txtEmail.setEditable(false);
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 300, 40));

        sendBugReport.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        sendBugReport.setText("KIRIM");
        sendBugReport.setToolTipText("Kirim");
        sendBugReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBugReportActionPerformed(evt);
            }
        });
        jPanel2.add(sendBugReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 220, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/gararetech/cinemas/view/images/logo-159.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        txtBugDesc.setColumns(20);
        txtBugDesc.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtBugDesc.setLineWrap(true);
        txtBugDesc.setRows(5);
        txtBugDesc.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtBugDesc);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 540, 150));

        outerPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 620, 480));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/gararetech/cinemas/view/images/exitButton.png"))); // NOI18N
        exit.setToolTipText("EXIT");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setIconTextGap(0);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        outerPanel.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/gararetech/cinemas/view/images/minimizeButton.png"))); // NOI18N
        minimize.setToolTipText("Minimize");
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.setIconTextGap(0);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        outerPanel.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, -1, -1));

        getContentPane().add(outerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        bugReportController.exitButton(this);
    }//GEN-LAST:event_exitMouseClicked

    private void sendBugReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBugReportActionPerformed
        // TODO add your handling code here:
        bugReportController.sendReport(this);
    }//GEN-LAST:event_sendBugReportActionPerformed

    private void outerPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outerPanelMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - this.getMouseX(), y - this.getMouseY());
    }//GEN-LAST:event_outerPanelMouseDragged

    private void outerPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outerPanelMousePressed
        // TODO add your handling code here:
        this.setMouseX(evt.getX());
        this.setMouseY(evt.getY());
    }//GEN-LAST:event_outerPanelMousePressed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        // TODO add your handling code here:
        bugReportController.minimizeButton(this);
    }//GEN-LAST:event_minimizeMouseClicked

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
            java.util.logging.Logger.getLogger(BugReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BugReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BugReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BugReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BugReportView().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(BugReportView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(BugReportView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(BugReportView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(BugReportView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel minimize;
    private javax.swing.JPanel outerPanel;
    private javax.swing.JButton sendBugReport;
    private javax.swing.JTextArea txtBugDesc;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}